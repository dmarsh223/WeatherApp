package weather;


import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import java.net.*;



public class XMLReader {


    public static void parseWeather(String URL) {
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
                    // If your document is namespace aware use localName
                    //String localName = elem.getLocalName();
                    // Tag name returns the localName and the namespace prefix
                    String tagName = elem.getTagName();
                    String itemInfo = elem.getTextContent();
                    System.out.println(tagName + " " + itemInfo);
                    // do stuff with the children
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}





