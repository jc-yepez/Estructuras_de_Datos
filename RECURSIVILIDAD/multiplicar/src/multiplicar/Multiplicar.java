
package multiplicar;


public class Multiplicar {

    public int multi1(int a,int b){
        //limite
        if(b==1){
            return a;
        }else{
            return a +multi2(a,b-1);
        }
    }
    public int multi2(int a,int b){
        //limite
        if(b==1){
            return a;
        }else{
            return a +multi1(a,b-1);
        }
    }
    
    public static void main(String[] args) {
        Multiplicar m= new Multiplicar();
        System.out.println(m.multi(7, 4));
    }
    
}
