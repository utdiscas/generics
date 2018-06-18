/**
 * Created by caeruleum on 18.06.2018.
 */
public class WithOutGenerics {
    public static void main (String[] args){

        Integer[] iray = {1,2,3,4};
        Character[] cray = {'s','t','o','k','e','s'};

        printMe(iray);
        printMe(cray);
    }

    public static void printMe(Integer[] i){
        for(Integer x : i)
            System.out.printf("%s", x);
        System.out.println();
    }


    public static void printMe(Character[] i){
        for(Character x : i)
            System.out.printf("%s", x);
        System.out.println();
    }


}
