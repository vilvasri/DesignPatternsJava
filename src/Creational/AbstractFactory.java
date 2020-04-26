package Creational;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbstractFactory {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String xml = "<document><body><hello>Hello world</hello></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory absfac = DocumentBuilderFactory.newInstance();
        DocumentBuilder fac = absfac.newDocumentBuilder();
        Document doc = fac.parse(bais);

        doc.getDocumentElement().normalize();
        System.out.println("Root Element: "+ doc.getDocumentElement().getNodeName());

        System.out.println(absfac.getClass());
        System.out.println(fac.getClass());
    }
}

//If you see the output the impl is abstract
/*
Root Element document
class com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl
class com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl
 */