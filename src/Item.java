public class Item {
    String name;

    public Item(String name){
        this.name= name;
    }

    public void use(){
        System.out.println(this.name + " was used");
    }
}
