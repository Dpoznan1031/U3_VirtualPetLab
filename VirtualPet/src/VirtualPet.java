// Part A


public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happyLevel;
    private int weight;
    private int ageYears;
    private int ageMonths;

    VirtualPet(String givenName){
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
    public void feed() {
        if(energyLevel < 10){
            energyLevel++;
        }
        weight++;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
    public int getHappinessLevel() {
        return happyLevel;
    }
    public void play(){
        if(happyLevel < 10){
            happyLevel++;
        }
        if(weight > 5){
            weight--;
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