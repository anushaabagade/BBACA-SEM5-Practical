import java.util.*;

public class setcq1 {
    public static void main(String[] args) {
        Hashtable<String, String> citySTD = new Hashtable<>();

        citySTD.put("Mumbai", "022");
        citySTD.put("Delhi", "011");
        citySTD.put("Bangalore", "080");
        citySTD.put("Chennai", "044");
        citySTD.put("Kolkata", "033");

        System.out.println("City and STD Code Details:");
        Enumeration<String> keys = citySTD.keys();
        while (keys.hasMoreElements()) {
            String city = keys.nextElement();
            String stdCode = citySTD.get(city);
            System.out.println("City: " + city + ", STD Code: " + stdCode);
        }

        String searchCity = "Bangalore";
        String stdCode = citySTD.get(searchCity);
        if (stdCode != null) {
            System.out.println("\nThe STD code for " + searchCity + " is: " + stdCode);
        } else {
            System.out.println("\nCity " + searchCity + " not found in the hashtable.");
        }
    }
}
