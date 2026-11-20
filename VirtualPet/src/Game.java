// Part B

public class Game {
    private String name;
    private int happinessIncr;
    private int weightDecr;
    public Game(String name, int happinessIncr, int weightDecr){
        this.name = name;
        this.happinessIncr = happinessIncr;
        this.weightDecr = weightDecr;
    }

    public boolean isWinner(){
        int chance = (int) (Math.random() * 2);
        if(chance == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int gethappinessIncr() {
        return happinessIncr;
    }

    public int getweightDecr() {
        return weightDecr;
    }
}
