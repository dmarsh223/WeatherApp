package weather;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//    XMLReader.Reader();

    XMLReader manahawkin = new XMLReader();
    manahawkin.parseWeather("http://api.wunderground.com/api/184245b00544774c/conditions/q/NJ/Manahawkin.xml");

//    Information myHome = new Information();
//    System.out.println(myHome.getStateName());

//    XMLReader.parseWeather("http://api.wunderground.com/api/184245b00544774c/conditions/q/NJ/Manahawkin.xml");

//    XMLReader.parseXml2("https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esummary.fcgi?db=nucleotide&id=224589801");





    }
}
