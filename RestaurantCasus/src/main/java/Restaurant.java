import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<ICook> cooks = new ArrayList<ICook>();

    public void addCook(ICook cook){
        cooks.add(cook);
    }

    public void removeCook(ICook cook){
        cooks.remove(cook);
    }
}
