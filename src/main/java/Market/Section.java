package Market;

import java.util.List;

public class Section implements calcPrice{

    public List<Shelve> shelves;



    public int calculate(){
        int shelve=0;
        for (Shelve shelves: shelves){
            int prices= shelves.calculate();
            shelve = shelve+ prices;
        }
        return shelve;

    }

    public int calculate2(){
        int jir=0;
        for (Shelve kallor: shelves){
            int jirok= kallor.calculate2();
            jir = jir+ jirok;
        }
        return jir;

    }


}
