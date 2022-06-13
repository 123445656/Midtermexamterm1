import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>();

        prodList.add(new PrintProduct(Printname("intel","2014","American","Gilbert")));
        prodList.add(new PrintProduct(Printname("iIntel","2014","American","John")));
        prodList.add(new PrintProduct(Printname("iIntel","2014","American","Fabrice")));
        prodList.add(new CompProduct(compname("LENOVO","2015","Huai","Ange")));
        prodList.add(new CompProduct(compname("HP","2015","Huai","Philbert")));
        prodList.add(new CompProduct(compname("HP","2015","Huai","Arstide")));
        prodList.add(new ScannProduct(Scannname("GRL","2016","Chinese","Richard")));
        prodList.add(new ScannProduct(Scannname("RLV","2016","Chinese","Angel")));
        prodList.add(new ScannProduct(Scannname("RLV","2016","Chinese","Boris")));
        prodList.add(new ScannProduct(Scannname("RLV","2016","Chinese","Jeanclaude")));



        for (Product prod:stList){
            System.out.println (prod);

        }
    }
}


