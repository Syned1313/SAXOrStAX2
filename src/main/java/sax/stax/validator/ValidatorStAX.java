package sax.stax.validator;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ValidatorStAX {
    public void Validate(String path) throws SAXException, IOException, XMLStreamException {
        XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new FileInputStream(path));

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File("C:/PROJECT/SAXOrStAX/src/main/resources/Bot.xsd"));

        Validator validator = schema.newValidator();
        validator.validate(new StAXSource(reader));

        //no exception thrown, so valid
        System.out.println("Document is valid");

    }
}
