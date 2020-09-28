package Market;

import java.util.List;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class Shelve implements  calcPrice{

    public List<Product> products;
    //public List<Product> shelveKaloriy;
   // public List<Product> polka;

//public int count(){
    //int num =length(polka);
    //return num;
//}


    public int calculate(){
int prices=0;
for (Product product: products){
    int price= product.calculatePrice();
    prices +=price;
}
        return prices;
    }

    public int calculate2(){
        int jir=0;
        for (Product kalorii: products){
            int jirok= kalorii.calculateKall();
            jir +=jirok;
        }
        return jir;
    }


}
