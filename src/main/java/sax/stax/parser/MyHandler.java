package sax.stax.parser;

import sax.stax.model.*;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.Key;
import java.util.*;

public class MyHandler {

    public static List<Bot> parseXMLfile(String fileName) {
        List<Bot> botsList = new ArrayList<>();
        Set<Brand> carBrands = new HashSet<>();
        List<Car> cars = new ArrayList<>();
        Map<CarContinent, CarCountry> carCountriesContinents = new HashMap<>();
        Car car = null;
        CarCountry carCountry= null;
        carCountriesContinents = null;
        CarContinent carContinent = null;
        Brand brand = null;
        Bot bot = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            // инициализируем reader и скармливаем ему xml файл
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            // проходим по всем элементам xml файла
            while (reader.hasNext()) {
                // получаем событие (элемент) и разбираем его по атрибутам
                XMLEvent xmlEvent = reader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("bot")) {
                        bot = new Bot();
                        // Получаем атрибут id для каждого элемента Bot
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            bot.setId(Integer.parseInt(idAttr.getValue()));
                        }
                    } else if (startElement.getName().getLocalPart().equals("name")) {
                        xmlEvent = reader.nextEvent();
                        bot.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("surname")) {
                        xmlEvent = reader.nextEvent();
                        bot.setSurname(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("password")) {
                        xmlEvent = reader.nextEvent();
                        bot.setPassword(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("age")) {
                        xmlEvent = reader.nextEvent();
                        bot.setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("country")) {
                        xmlEvent = reader.nextEvent();
                        bot.setCountry(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("city")) {
                        xmlEvent = reader.nextEvent();
                        bot.setCity(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("street")) {
                        xmlEvent = reader.nextEvent();
                        bot.setStreet(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("numberOfBuilding")) {
                        xmlEvent = reader.nextEvent();
                        bot.setNumberOfBuilding(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("serial")) {
                        xmlEvent = reader.nextEvent();
                        bot.setSerial(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("cars")) {
                        cars = new ArrayList<>();
                    } else if (startElement.getName().getLocalPart().equals("car")) {
                        car = new Car();
                    } else if (startElement.getName().getLocalPart().equals("type")) {
                        xmlEvent = reader.nextEvent();
                        car.setType(xmlEvent.asCharacters().getData());
                    } else if ((startElement.getName().getLocalPart().equals("engine"))) {
                        xmlEvent = reader.nextEvent();
                        car.setEngine(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("carCountriesContinents")) {
                        carCountriesContinents = new HashMap<>();
                    } else if (startElement.getName().getLocalPart().equals("carFrom")) {
                        carCountry = new CarCountry();
                        carContinent = new CarContinent();
                    } else if (startElement.getName().getLocalPart().equals("carCountry")) {
                        xmlEvent = reader.nextEvent();
                        carCountry.setCarCountry(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("carContinent")) {
                        xmlEvent = reader.nextEvent();
                        carContinent.setCarContinent(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("carBrands")) {
                        carBrands = new HashSet<>();
                    } else if (startElement.getName().getLocalPart().equals("brand")) {
                        brand = new Brand();
                    } else if (startElement.getName().getLocalPart().equals("carBrand")) {
                        xmlEvent = reader.nextEvent();
                        brand.setCarBrand(xmlEvent.asCharacters().getData());
                    }
                }
                // если цикл дошел до закрывающего элемента Bot,
                // то добавляем считанного из файла студента в список
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("bot")) {
                        botsList.add(bot);
                    } else if (endElement.getName().getLocalPart().equals("brand")) {
                        carBrands.add(brand);
                    } else if (endElement.getName().getLocalPart().equals("carBrands")) {
                        bot.setCarBrands(carBrands);
                    } else if (endElement.getName().getLocalPart().equals("carFrom")) {
                        carCountriesContinents.put(carContinent, carCountry );
                    } else if (endElement.getName().getLocalPart().equals("carCountriesContinents")) {
                        bot.setCarCountriesContinents(carCountriesContinents);
                    } else if (endElement.getName().getLocalPart().equals("car")) {
                        cars.add(car);
                    } else if (endElement.getName().getLocalPart().equals("cars")) {
                        bot.setCars(cars);
                    }
                }
            }

        } catch (FileNotFoundException |
                XMLStreamException exc) {
            exc.printStackTrace();
        }
        return botsList;
    }
}
