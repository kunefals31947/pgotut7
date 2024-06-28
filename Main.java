import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemsnames = new ArrayList<>();
        itemsnames.add(new Item("1", "laptop"));
        itemsnames.add(new Item("2", "myszka"));
        itemsnames.add(new Item("3", "monitor"));
        itemsnames.add(new Item("4", "głosniki"));
        itemsnames.add(new Item("5", "lampka"));
        for (Item i : itemsnames) {
            i.show();
        }
Map <String,String> itemsmap=new HashMap<>();
        for (Item I:itemsnames){
            itemsmap.put(I.getIdnt(),I.getName());
        }
        for (Map.Entry<String, String> entry : itemsmap.entrySet()) {
            System.out.println("Identyfikator: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }

        itemsnames.add(new Item("6","ccc"));
        itemsnames.add(new Item("7","ccc"));
        itemsnames.add(new Item("8","ccc"));
        itemsnames.add(new Item("9","ccc"));
        itemsnames.add(new Item("10","ccc"));
        itemsnames.add(new Item("11","ccc"));
        itemsnames.add(new Item("12","ccc"));
        itemsnames.add(new Item("13","ccc"));
        itemsnames.add(new Item("14","ccc"));
        itemsnames.add(new Item("15","ccc"));
        for (Item i : itemsnames) {
            i.show();
        }

      List<Item> pierwsze5=new ArrayList<>(itemsnames.subList(0,5));
        Set<Item>ITEMSSET=new HashSet<>(pierwsze5);

        for (Item item : ITEMSSET) {
            System.out.println("Identyfikator: " + item.getIdnt() + ", Nazwa: " + item.getName());


        }
        }

}