package fibo;

public class Fibo {

    
     public static int fibo(int n){
         
         if (n==0||n==1){
             return 1;
         }else{
           
             return  fibo (n-1)+fibo(n-2);
           
             
         }
     }
    public static void main(String[] args) {
        
        //Fibo fi= new Fibo();
        int x=0;
     //  System.out.println(fi.fibo(8));
       
        while (x!=3){
          System.out.println(fibo(x));
          x++;
       }
    }
    
}
