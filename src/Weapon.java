public class Weapon extends Item{
    int power;

    public Weapon(String name, int power){
        super(name);
        this.power = power;


    }

    @Override
    public void use(){
        System.out.println(this.name + "attacked with power " + this.power);
    }
}
