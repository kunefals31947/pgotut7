import java.util.Collections;
import java.util.Scanner;
import java.util.jar.Attributes;


public class Item {


    String idnt;
   String name;

    public Item(String idnt, String name) {
        this.idnt = idnt;
        this.name = name;
    }

    public String getIdnt() {
        return idnt;
    }

    public void setIdnt(String idnt) {
        this.idnt = idnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void show(){

        System.out.println("Nazwa przedmiotu: " + name);

    }
}