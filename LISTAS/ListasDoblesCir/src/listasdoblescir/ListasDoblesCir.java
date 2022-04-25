package listasdoblescir;
public class ListasDoblesCir {
    public static void main(String[] args) {
        Metodos n=new Metodos();
        n.InsertarFn(8);
        n.InsertarIn(0);
        n.InsertarIn(5);
        n.InsertarIn(0);
        n.InsertarFn(0);
        //System.out.println("lista");
       // n.ImpreimirIn();
   
      //  System.out.println("borrar elementos");
        //n.BorrarElemento(0);
      //n.ImpreimirIn();
        System.out.println("insertar por posicion");
        n.InsertarPos(1, 13);
        n.ImpreimirIn();
        //System.out.println("buscar");
       // n.Buscar(0);
        //System.out.println("borrar posicion");
        //n.Borrarpos(1);
        //n.ImpreimirIn();
        
    }    
}
