 package sorting;


 public class removeA{
    public static void main(String[] args){
    String name="tannu";
  System.out.println("hiii");
    System.out.println(answer(name,0));

    }

 public static String answer(String name, int n ){
   String ans= new String("");
    
    if(name.length()==0){
      return ans;
    }
    if(name.charAt(n)=='a'){
      return answer(name,n+1);
    }
    ans=ans+name.charAt(n);
    return answer(name,n+1);


 }
}