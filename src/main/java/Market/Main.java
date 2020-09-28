package Market;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product baker = new Product();
        baker.tovar = 10;
        baker.kaloriy = 150;
        Product baker1=new Product();
        baker1.tovar=15;
        baker1.kaloriy = 200;
        Product baker2=new Product();
        baker2.tovar=20;
        baker2.kaloriy = 250;
        Product baker3=new Product();
        baker3.tovar=30;
        baker3.kaloriy = 250;


        Shelve cakes =new Shelve();
        cakes.products= Arrays.asList(baker,baker1);

        //cakes.polka=Arrays.asList(baker,baker1);
        //System.out.println(cakes.count());

        Shelve cakes2 =new Shelve();
        cakes2.products= Arrays.asList(baker2,baker3);


        Section bulki = new Section();
        bulki.shelves = Arrays.asList(cakes,cakes2);
        System.out.println("AllCost: "+ bulki.calculate() + "  AllCallories: "+bulki.calculate2());
    }
}
