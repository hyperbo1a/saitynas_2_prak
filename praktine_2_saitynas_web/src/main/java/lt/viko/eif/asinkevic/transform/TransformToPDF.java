package lt.viko.eif.asinkevic.transform;

import eif.viko.lt.asinkevic.wsdl.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lt.viko.eif.asinkevic.client.Client;
import org.apache.fop.apps.*;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.file.Files;

public class TransformToPDF {

    private static void deleteFileIfExists(File file) {
        try {
            if (file.exists())
            {
                Files.deleteIfExists(file.toPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void convertToPDF(String xmlFilePath, String xslFilePath, String outputPdfPath) throws IOException, JAXBException {
        File fileXSLT = new File(xslFilePath);
        StreamSource source = new StreamSource(new File(xmlFilePath));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        File pdfFile = new File(outputPdfPath);
        deleteFileIfExists(pdfFile);
        OutputStream out = null;
        try {
            out = new FileOutputStream(pdfFile);
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xslFilePath));
            //File foFile = new File("src/main/resources/Reisas.fo");
            //Result res = new StreamResult(new FileWriter(foFile));
            Result res = new SAXResult((fop.getDefaultHandler()));
            transformer.transform(source, res);
        } catch (FOPException | TransformerException e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static <T> void convertToXML(T response, String filePath) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(response.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            marshaller.marshal(response, fileWriter);
        }
    }

    public static void convertToGetReisasClient(String firstName, String lastName) throws IOException, JAXBException {
        Client order = new Client();
        GetReisasResponse response = order.getReisas(firstName, lastName);
        String xmlFilePath = "Reisas.xml";
        convertToXML(response, xmlFilePath);
        convertToPDF(xmlFilePath, "Reisas.xsl", "src/main/resources/Reisas.pdf");
    }

    public static void convertToGetTelefonoNumerisReisas(String telefonoNumeris) throws IOException, JAXBException {
        Client reisas = new Client();
        GetTelefonoNumerisReisasResponse response = reisas.getTelefonoNumerisReisas(telefonoNumeris);
        String xmlFilePath = "Reisas.xml";
        convertToXML(response, xmlFilePath);
        convertToPDF(xmlFilePath, "Reisas.xsl", "src/main/resources/Reisas.pdf");
    }

    public static void convertToGetValstybinisNumerisReisas(String valstybinisNumeris) throws IOException, JAXBException {
        Client reisas = new Client();
        GetValstybinisNumerisReisasResponse response = reisas.getValstybinisNumerisReisas(valstybinisNumeris);
        String xmlFilePath = "Reisas.xml";
        convertToXML(response, xmlFilePath);
        convertToPDF(xmlFilePath, "Reisas.xsl", "src/main/resources/Reisas.pdf");
    }
}