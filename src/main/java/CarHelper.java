import model.Auto;

import java.util.ArrayList;
import java.util.List;

public class CarHelper {
    public Auto getAutoById(String id, List<Auto> autos) {
        for (Auto auto : autos) {
            if (auto.getNumber().equals(id)) {
                return auto;
            }
        }

        return null;
    }

    public List<Auto> getAvailableAutos(List<Auto> autos) {
        List<Auto> availableAutos = new ArrayList<>();

        for (Auto auto : autos) {
            if (auto.getClient() == null) {
                availableAutos.add(auto);
            }
        }

        return availableAutos;
    }
}
