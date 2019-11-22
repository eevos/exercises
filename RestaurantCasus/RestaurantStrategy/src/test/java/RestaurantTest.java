import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RestaurantTest {

    public void setup() {
        RestaurantContext testRestaurant = new RestaurantContext();
    }


    //    Should return False
    @Test
    public void shouldNotReturnPreparation() {
        Cook testSoccerCook = new Cook(new SoccerStrategy());
        assertEquals(0, testSoccerCook.prepare());
    }

    //    Should return True
    @Test
    public void shouldReturnPreparation() {
        Cook testSoccerCook = new Cook(new SoccerStrategy());
        assertEquals("SoccerCook cooks an omelet", testSoccerCook.prepare());
    }

}
