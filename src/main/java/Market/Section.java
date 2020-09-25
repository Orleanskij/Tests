package Market;

import java.util.List;

public class Section {

    public List<Shelve> shelves;
    public List<Shelve> sectionKal;


    public int calculateTotalPrice(){
        int shelve=0;
        for (Shelve shelves: shelves){
            int prices= shelves.calculateShelve();
            shelve = shelve+ prices;
        }
        return shelve;

    }

    public int calculateTotalKal(){
        int jir=0;
        for (Shelve kallor: sectionKal){
            int jirok= kallor.calculateJir();
            jir = jir+ jirok;
        }
        return jir;

    }


}
