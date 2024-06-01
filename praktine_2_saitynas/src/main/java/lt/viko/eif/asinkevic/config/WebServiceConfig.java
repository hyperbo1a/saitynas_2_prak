package lt.viko.eif.asinkevic.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
        /**
         *  Method that creates a new MessageDispatcherServlet
         * @param applicationContext ApplicationContext object
         * @return ServletRegistrationBean object
         */
        @Bean
        public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
            MessageDispatcherServlet servlet = new MessageDispatcherServlet();
            servlet.setApplicationContext(applicationContext);
            servlet.setTransformWsdlLocations(true);
            return new ServletRegistrationBean<>(servlet, "/ws/*");
        }
        /**
         *  Method that creates a new DefaultWsdl11Definition
         * @param reisasSchema XsdSchema object
         * @return DefaultWsdl11Definition object
         */
        @Bean(name = "Reisas")
        public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema reisasSchema) {
            DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
            wsdl11Definition.setPortTypeName("ReisasPort");
            wsdl11Definition.setLocationUri("/ws");
            wsdl11Definition.setTargetNamespace("http://lt.viko.eif/arturas/springsoap/gen");
            wsdl11Definition.setSchema(reisasSchema);
            return wsdl11Definition;
        }
        /**
         *  Method that creates a new SimpleXsdSchema
         * @return XsdSchema object
         */
        @Bean
        public XsdSchema reisasSchema() {
            return new SimpleXsdSchema(new ClassPathResource("Reisas.xsd"));
        }
    }
