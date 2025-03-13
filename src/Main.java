import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items= new ArrayList<>();

        items.add(new Item("Flower"));
        items.add(new Item("Banana"));
        items.add(new Weapon("Sword",10));
        items.add(new Consumable("Pizza", 5));


        for(Item currentItem: items){
            currentItem.use();
        }

    }

    public static void hashMapExample(){
        HashMap<String, Integer> klassantal= new HashMap<>();

        klassantal.put("TE22A", 23);
        klassantal.put("TE22B", 25);
        klassantal.put("TE22C", 28);
        klassantal.put("TE22D", 21);
        klassantal.put("TE22E", 29);

        System.out.println("Te22D innehåller "+ klassantal.get("TE22D")+ " Elever");

        /*
        HashMap<String, Item> itemList = new HashMap<>();

        itemList.put("flower", new Item("flower"));
        System.out.println("item is a "+ itemList.get("flower").name);
         */

    }

    public static void genericClassExample() {
        IntPrint intPrnt = new IntPrint(10);
        intPrnt.print();

        StringPrint strPrint = new StringPrint("Hej");
        strPrint.print();

        Printer<String> printer= new Printer<>("Hej");
        printer.print();

    }

}