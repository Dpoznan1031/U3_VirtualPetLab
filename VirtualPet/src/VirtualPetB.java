// Part B

public class VirtualPetB {
    private String name;
    private int energyLevel;
    private int happyLevel;
    private int weight;
    private int ageYears;
    private int ageMonths;

    VirtualPetB(String givenName){
        name = givenName;
        weight = 5;
        energyLevel = 0;
        happyLevel = 0;
        ageYears = 0;
        ageMonths = 0;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        String out = name + "'s Information:\nEnergy: " + energyLevel + "\nHappiness: " + happyLevel +"\nWeight: ";
        out += weight + "g\n Age: " + ageMonths + " Months, and " + ageYears + " Years";
        return out;
    }

    public void feed(Food food) {
        if(energyLevel < 11 - food.getEnergyIncrease()){
            energyLevel += food.getEnergyIncrease();
        }
        weight += food.getWeightGain();
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
    public int getHappinessLevel() {
        return happyLevel;
    }

    public void play(Game game){
        boolean wonGame = game.isWinner();
        if(happyLevel < 11 - game.gethappinessIncr() && wonGame){
            happyLevel += game.gethappinessIncr();
        }
        else if(happyLevel > 1 - game.gethappinessIncr() && !wonGame){
            happyLevel -= game.gethappinessIncr();
        }
        if(weight > 6 + game.getweightDecr()){
            weight -= game.getweightDecr();
        }
    }

    public void updateStatus() {
        if(energyLevel > 0){
            energyLevel--;
        }
        if(happyLevel > 0){
            happyLevel--;
        }
        ageMonths++;
        if(ageMonths == 12){
            ageMonths = 0;
            ageYears++;
        }
    }
}