package Street;

public class TanHouse implements Processor{
    public int process(int sqr, int numPepople, int numRoom, int bedroom, int nalogNaRoskosh) {
        int result = ((sqr * numRoom) / numPepople) ;
        if (result>25){result=result*bedroom+nalogNaRoskosh;}
        else{result=result-bedroom+nalogNaRoskosh;}
        return result;
    }
}
