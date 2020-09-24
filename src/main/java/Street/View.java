package Street;

public class View {


    public int viewOnPark(boolean Park){
        int result = 2;
     if (Park){result=result+10;}
     else{result=result -2;}
     return result;
    }

    public int nearSchool(boolean school){
        int result = 2;
        if (school){result=result+10;}
        else{result=result -2;}
        return result;
    }


}
