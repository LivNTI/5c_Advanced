public class Consumable extends Item{
    int amount;

    public Consumable(String name, int amount){
        super(name);
        this.amount = amount;


    }

    @Override
    public void use(){
        this.amount--;
        System.out.println(this.name + " now has " + this.amount + " uses left");
    }
}
