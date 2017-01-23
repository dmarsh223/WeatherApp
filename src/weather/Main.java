package weather;

public class Main {

    public static void main(String[] args) {

        Parser newParser = new Parser();
        Information manahawkin = new Information();

        newParser.newParse(manahawkin);
        manahawkin.returnInfo();


    }
}



