package Street;

public class House implements Processor{


    public int process(int sqr, int numPepople, int numRoom, int bedroom, int nalogNaRoskosh) {
        int result = ((sqr * numRoom) / numPepople) ;
        if (result>30){result=result*bedroom+nalogNaRoskosh;}
        else{result=result-bedroom+nalogNaRoskosh;}
        return result;
    }

}
