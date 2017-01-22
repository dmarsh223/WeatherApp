package weather;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {


        Location manahawkin = new Location();

        //xmlReader
        DOMParser parser = new DOMParser();

        try {
            parser.parse(new InputSource(new URL(("http://api.wunderground.com/api/184245b00544774c/conditions/q/NJ/Manahawkin.xml")).openStream()));

            //example found here http://stackoverflow.com/questions/24446849/parse-xml-without-tagname

            Document doc = parser.getDocument();

            Node locationInfo = doc.getElementsByTagName("display_location").item(0);
            NodeList childrenLocation = locationInfo.getChildNodes();


            for (int i = 0; i < childrenLocation.getLength(); i++) {

                if (childrenLocation.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) childrenLocation.item(i);

                    if (elem.getTagName() == "city") {
                        manahawkin.setTownName(elem.getTextContent());
                    }
                    if (elem.getTagName() == "state") {
                        manahawkin.setStateName(elem.getTextContent());
                    }
                    if (elem.getTagName() == "elevation") {
                        manahawkin.setElevation(Double.parseDouble(elem.getTextContent()));
                    }
                    if (elem.getTagName() == "zip") {
                        manahawkin.setZipCode(elem.getTextContent());
                    }


                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

        manahawkin.returnInfo();

    }


}

