package com.mypractice.soap_api.util;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class XmlUtil {
    public static Document xmlString2doc(String xmlStr) throws ParserConfigurationException, IOException, SAXException {
        InputSource is = new InputSource(new StringReader(xmlStr));
        is.setEncoding("UTF-8");
        DocumentBuilder db = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder();
        return db.parse(is);
    }

    public static Document xmlFile2doc(String path) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder db = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder();
        return db.parse(path);
    }
}
