package Market;

import java.util.List;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class Shelve{

    public List<Product> products;
    public List<Product> shelveKaloriy;
   // public List<Product> polka;

//public int count(){
    //int num =length(polka);
    //return num;
//}


    public int calculateShelve(){
int prices=0;
for (Product product: products){
    int price= product.calculatePrice();
    prices +=price;
}
        return prices;
    }

    public int calculateJir(){
        int jir=0;
        for (Product kalorii: shelveKaloriy){
            int jirok= kalorii.calculateKall();
            jir +=jirok;
        }
        return jir;
    }


}
