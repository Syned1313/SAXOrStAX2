package sax.stax;

import org.xml.sax.SAXException;
import sax.stax.model.Bot;
import sax.stax.parser.XMLParserSAX;
import sax.stax.validator.ValidatorStAX;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static sax.stax.parser.MyHandler.parseXMLfile;

public class XMLParserStAX {
    public static void main(String[] args) throws SAXException, IOException, XMLStreamException {
        ValidatorStAX validator = new ValidatorStAX();
        String fileName = "C:/PROJECT/SAXOrStAX/src/main/resources/Bot.xml";
      //  validator.Validate(fileName);
        List<Bot> botsList = parseXMLfile(fileName);
        for (Bot bot : botsList) {
            System.out.println(bot.toString());
        }
    }
}


