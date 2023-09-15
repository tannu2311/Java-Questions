import java.util.ArrayList;

public class factors {
    public static void main(String[] args){
     int n=16;
     System.out.println(fac(n));

    }
    public static ArrayList<Integer> fac(int n ){
        ArrayList<Integer> list= new ArrayList<>(3);
        for(int i=2;i<=Math.sqrt((double)n);i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i)
                list.add(n/i);
            }
        }
        list.add(n);
        list.add(1);
        return list;
    }

}
