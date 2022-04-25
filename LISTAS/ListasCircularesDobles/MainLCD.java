package ListasCircularesDobles;

public class MainLCD {

    public static void main(String[] args) {
        MetodosLCD lcd = new MetodosLCD();

        lcd.InsertaInicio(2);
        lcd.InsertaInicio(4);
        lcd.InsertaInicio(2);//cam
        lcd.InsertarUltimo(2);
        lcd.InsertarUltimo(2);//cam
        lcd.ImprimirAdelante();
        System.out.println("Numero de elementos: " + lcd.NumElementos());
//        lcd.BorrarPos(3);
//        lcd.InsertarPos(4, 1);
        lcd.BorrarElemento(2);
//        lcd.BorrarPos(3);
        System.out.println("adelante: \n" );
        lcd.ImprimirAdelante();
        System.out.println("atras \n" );
        lcd.ImprimirAtras();
        System.out.println("");
        System.out.println("Numero de veces que se repite el elemento: " + lcd.Buscar(2));
    }
}
