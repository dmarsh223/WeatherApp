package weather;


import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.*;


public class XMLReader {


    public void parseWeather(String URL) {
        DOMParser parser = new DOMParser();

        try {
            parser.parse(new InputSource(new URL(URL).openStream()));

            //example found here http://stackoverflow.com/questions/24446849/parse-xml-without-tagname

            Document doc = parser.getDocument();
            Node weatherInfo = doc.getElementsByTagName("display_location").item(0);
            NodeList children = weatherInfo.getChildNodes();

            for (int i = 0; i < children.getLength(); i++) {
                if (children.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) children.item(i);


                    // Tag name returns the localName and the namespace prefix
                    String tagName = elem.getTagName();

                    String itemInfo = elem.getTextContent();

                    System.out.println(tagName + " " + itemInfo);
                    // do stuff with the children
                }
            }


            for (int i = 0; i < children.getLength(); i++) {


//                Node no1 = (Node) children.item(0);
//
//
//
//                Element elem = (Element) children.item(0);

                if (children.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) children.item(i);

//                        String city = elem.getElementsByTagName("city").item(i).getTextContent();
//                        System.out.println("Your location is " + city);

//                        String cityState = elem.getElementsByTagName("city").item(i).getTextContent();

                    String city = elem.getAttribute("city");


                    if (elem.getTagName() == "city") {
                        System.out.println("This is a city tag name test");
                        System.out.println("Your location is " + elem.getTextContent());
                        Information.setStateName(elem.getTextContent());


                    }


                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();

        }

    }



}






