public class RestaurantContext {

    public static void main(String[] args) {
        Cook soccerCook = new Cook(new SoccerStrategy());

        System.out.println(soccerCook.prepare());
    }

}
