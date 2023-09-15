import java.util.Scanner;
public class occurence{
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    try{int n = in.nextInt();
    int count=0;
    while(n!=0){
        count ++;
        n=n/10;
    }
    System.out.println(count);}
    finally{in.close();}
  
  }
}