public class App {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        SimpleCook Peter = new SimpleCook();
        SoccerCook Ronald = new SoccerCook();
        HardrockCook Harry = new HardrockCook();

//hoe kan ik de arraylist uit restaurant bereiken
        restaurant.addCook(Peter);
        restaurant.addCook(Ronald);
        restaurant.addCook(Harry);
        
        System.out.print(Peter.prepare());
        System.out.print(Ronald.prepare());
        System.out.print(Harry.prepare());

    }
}
