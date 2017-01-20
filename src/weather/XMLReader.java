package weather;

//import java.net.MalformedURLException;
//import java.util.Scanner;
//import java.net.URL;
import java.net.*;
import java.io.*;


public class XMLReader {


        public static void Reader() throws IOException {

        URL oracle = null;
        try {
            oracle = new URL("http://api.wunderground.com/api/184245b00544774c/conditions/q/NJ/Manahawkin.xml");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine;
        try {
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



