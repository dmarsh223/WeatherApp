package weather;


public class Location {

    private String townName;
    private String stateName;
    private double elevation;
    private String zipCode;

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void returnInfo(){

        String yourCity = "Your city is " + getTownName();
        System.out.println(yourCity);
        String yourState = "Your state is " + getStateName();
        System.out.println(yourState);
        String yourElevation = "Your elevation is " + getElevation();
        System.out.println(yourElevation);
        String yourZip = "Your zip is " + getZipCode();
        System.out.println(yourZip);
    }
}

