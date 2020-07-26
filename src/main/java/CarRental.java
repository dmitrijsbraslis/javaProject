import model.Auto;
import model.Client;

import java.util.ArrayList;
import java.util.List;

public class CarRental {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();

        autos.add(new Auto("LM-1234", "VW", "Polo", 1986, 13.00));
        autos.add(new Auto("LK-17", "BMW", "X0", 1700, 10.00));
        autos.add(new Auto("HACKER", "Pepelac", "Ogonj", 1000, 0.00));

        Client hacker = new Client("Hacker", "Hackerovichs", "null@null.lv", "112");
        Client lana = new Client("Lana", "Brezhneva", "lana@lana.lv", "03");

        CarHelper helper = new CarHelper();
        helper.getAutoById("HACKER", helper.getAvailableAutos(autos)).rent(hacker);
    }
}
