package Street;

public class Main {
    public static void main(String[] args) {
        System.out.println("sposob I by interfeise");
        Processor chastniyDom = new House();
        Processor tanHouse = new TanHouse();
        System.out.println("Chastni Dom "+ chastniyDom.process(300, 5, 6,2,10) + " BYN");
        System.out.println("TanHouse Dom "+ tanHouse.process(120, 3, 3,1,5) + " BYN");



        System.out.println("Sposob II");
        MultiDom mnogoetajka = new MultiDom();
        mnogoetajka.Schiataem();
    }


}
