package Street;

public class rooms extends View {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int kolKomnat) {
        this.result = kolKomnat;
    }

    void Kol(int kolKomnat) {
        if (kolKomnat == 1) {
            setResult(15);
        } else if (kolKomnat == 2) {
            setResult(25);
        } else if (kolKomnat == 3) {
            setResult(35);
        }
    }


    void Lgota(boolean lgota) {

        if (lgota = false) {
            this.result = result - 5;
        } else {
            this.result = result + 5;
        }
    }
void Sum(int Kvartiri){


        this.result=Kvartiri*result;

}
public int View(){

         this.result=result+(viewOnPark(true));
         this.result=result+(nearSchool(false));
        return result;
}
}



