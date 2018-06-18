/**
 * Created by caeruleum on 18.06.2018.
 */
public class WithGenerics {
    public static void main (String[] args){

        Integer[] iray = {1,2,3,4,6};
        Character[] cray = {'n','a','v','i','e','r'};

        printMe(iray);
        printMe(cray);
    }

    public static <T> void  printMe(T[] x){
        for(T b: x)
            System.out.printf("%s ", b);
        System.out.println();
    }


}
