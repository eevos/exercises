public class Cook {

    private CookingStrategy strategy;

    public Cook(CookingStrategy strategy){
        this.strategy = strategy;
    }

    public String prepare(){
        return strategy.prepare();
    }

}
