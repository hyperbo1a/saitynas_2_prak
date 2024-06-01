<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:fo="http://www.w3.org/1999/XSL/Format"
        version="1.0"
        xmlns:gen="http://lt.viko.eif/arturas/springsoap/gen"
        exclude-result-prefixes="gen">

    <xsl:output encoding="UTF-8" indent="yes" method="xml" standalone="no" omit-xml-declaration="no"/>
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4-portrait" page-height="297mm"
                                       page-width="210mm" margin-top="10mm"
                                       margin-bottom="10mm" margin-left="15mm"
                                       margin-right="15mm">
                    <fo:region-body margin-top="20mm" margin-bottom="20mm"/>
                    <fo:region-before region-name="xsl-region-before" extent="20mm"/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="A4-portrait">
                <fo:static-content flow-name="xsl-region-before">
                    <fo:block text-align="center" font-size="20pt" font-family="Arial" font-weight="bold" color="#4CAF50">
                        Reisai Report
                    </fo:block>
                </fo:static-content>
                <fo:flow flow-name="xsl-region-body">
                    <xsl:apply-templates select="gen:getReisasResponse"/>
                    <xsl:apply-templates select="gen:getTelefonoNumerisReisasResponse"/>
                    <xsl:apply-templates select="gen:getValstybinisNumerisReisasResponse"/>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

    <xsl:template match="gen:getReisasResponse">
        <xsl:apply-templates select="gen:ReisasList"/>
    </xsl:template>

    <xsl:template match="gen:getTelefonoNumerisReisasResponse">
        <xsl:apply-templates select="gen:ReisasList"/>
    </xsl:template>

    <xsl:template match="gen:getValstybinisNumerisReisasResponse">
        <xsl:apply-templates select="gen:ReisasList"/>
    </xsl:template>

    <xsl:template match="gen:ReisasList">
        <fo:block>
            <fo:block font-weight="bold" text-align="center" color="#4CAF50" font-size="18pt" space-after="5mm">Reisas Information</fo:block>
            <xsl:apply-templates select="gen:Reisas"/>
        </fo:block>
    </xsl:template>

    <xsl:template match="gen:Reisas">
        <fo:block font-size="14pt" font-family="Arial, sans-serif" space-after="10mm" border="solid 1px #4CAF50" padding="10mm" margin-bottom="10mm">
            <fo:block font-weight="bold" text-align="left" color="#333">
                <xsl:text>Reisas ID: </xsl:text><xsl:value-of select="@id"/>
            </fo:block>
            <fo:block font-weight="bold" text-align="left" color="#333">
                <xsl:text>Address: </xsl:text><xsl:value-of select="gen:adresas"/>
            </fo:block>
            <fo:block font-weight="bold" margin-top="10pt" font-size="12pt" color="#4CAF50">Client Information</fo:block>
            <fo:block text-align="left">Client ID: <xsl:value-of select="gen:uzsakovas/gen:id"/></fo:block>
            <fo:block text-align="left">Client First Name: <xsl:value-of select="gen:uzsakovas/gen:FirstName"/></fo:block>
            <fo:block text-align="left">Client Last Name: <xsl:value-of select="gen:uzsakovas/gen:Lastname"/></fo:block>
            <fo:block text-align="left">Client Phone Number: <xsl:value-of select="gen:uzsakovas/gen:telefonoNumeris"/></fo:block>

            <fo:block font-weight="bold" margin-top="10pt" font-size="12pt" color="#4CAF50">Driver Information</fo:block>
            <fo:block text-align="left">Driver ID: <xsl:value-of select="gen:vairuotojas/gen:id"/></fo:block>
            <fo:block text-align="left">Driver First Name: <xsl:value-of select="gen:vairuotojas/gen:FirstName"/></fo:block>
            <fo:block text-align="left">Driver Last Name: <xsl:value-of select="gen:vairuotojas/gen:Lastname"/></fo:block>
            <fo:block text-align="left">Driver Phone Number: <xsl:value-of select="gen:vairuotojas/gen:telefonoNumeris"/></fo:block>

            <fo:block font-weight="bold" margin-top="10pt" font-size="12pt" color="#4CAF50">Bus Information</fo:block>
            <fo:block text-align="left">Bus Color: <xsl:value-of select="gen:autobusas/gen:spalva"/></fo:block>
            <fo:block text-align="left">Bus Registration Number: <xsl:value-of select="gen:autobusas/gen:valstybinisNumeris"/></fo:block>
            <fo:block text-align="left">Number of Seats: <xsl:value-of select="gen:autobusas/gen:vietuSkaicius"/></fo:block>
        </fo:block>
    </xsl:template>
</xsl:stylesheet>