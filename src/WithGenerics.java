/**
 * Created by caeruleum on 18.06.2018.
 */
public class WithGenerics {
    public static void main (String[] args){

        Integer[] iray = {1,2,3,4,6};
        Character[] cray = {'n','a','v','i','e','r'};

        printMe(iray);
        printMe(cray);

        System.out.println(max(123,23,32));
       System.out.println(max("equation","fluid:", "epsilon"));
    }

    public static <T> void  printMe(T[] x){
        for(T b: x)
            System.out.printf("%s ", b);
        System.out.println();
    }
//maximum of variables
    public static <T extends Comparable<T>> T  max(T a, T b, T c){
        T m=a;
        if(b.compareTo(a) > 0)
            m=b;
        if(c.compareTo(m) >0 )
            m=c;
        return m;
    }


}
