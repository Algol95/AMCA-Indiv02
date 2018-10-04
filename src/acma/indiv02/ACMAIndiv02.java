package acma.indiv02;
import java.util.Scanner;
/**
 *
 * @author Ángel Miguel Cubino Aragón
 */
public class ACMAIndiv02 {
    
    public static void main(String[] args) {
        
        //VARIABLES Y ENTRADA TECLADO
        Scanner teclado = new Scanner(System.in);
        String prueba;
        int e1;
        int e2;
        int e3num1;
        int e3num2;
        int e4num1;
        int e4num2;
        int e5;
        int e6;
        int e7;
        int e8num;
        int e8pro;
        String e9;
        int e10num1;
        int e10num2;
        
        //E1
        System.out.println("E1. Introduzca su número:");
        e1 = teclado.nextInt();
        if (e1>=0) 
            System.out.println ("El número " + e1 +" es positivo");
        else
            System.out.println("El número " + e1 + " es negativo");
        
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
       
        //E2
        System.out.println("E2. Introduzca su número:");
        e2 = teclado.nextInt ();
        
        if (e2>=0)
            if (e2>0)
                System.out.println("El número " + e2 + " es positivo");
            else
                System.out.println("El número es cero.");
        else
            System.out.println("El número " + e2 + " es negativo");
        
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
        
        //E3
        System.out.println ("E3. Introduzca el primer número: ");
        e3num1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número:");
        e3num2 = teclado.nextInt();
        
        if (e3num1>e3num2)
            System.out.println("El número " + e3num1 + " es mayor que " + e3num2);
        else
            if (e3num1<e3num2)
                System.out.println ("El número " + e3num2 + " es mayor que " + e3num1);
            else
                System.out.println("Los números son iguales.");
        
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
        
        //E4
        System.out.println("E4. Introduzca el primer número:");
        e4num1 = teclado.nextInt();
        System.out.println("Introduce segúndo número");
        e4num2 = teclado.nextInt ();
        
        if (e4num1>e4num2)
            System.out. println(e4num1-e4num2);
        if (e4num1<e4num2)
            System.out. println(e4num1+e4num2);
        if (e4num1==e4num2)
            System.out. println(e4num1*e4num2);
        
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
        
        //E5
        System.out.println ("E5. Elija la operación que desea realizar:" );
        System.out.println ("1. SUMA" );
        System.out.println ("2. RESTA" );
        System.out.println ("3. MULTIPLICACIÓN" );
        System.out.println ("4. DIVISIÓN" );
        System.out.println ("5. SALIR" );
        e5 = teclado.nextInt();
        
        switch (e5){
            case 1:
                System.out.println("Ha seleccionado la operación SUMA");
                break;
            case 2:
                System.out.println("Ha seleccionado la operación RESTA");
                break;
            case 3:
                System.out.println("Ha seleccionado la operación MULTIPLICACIÓN");
                break;
            case 4:
                System.out.println("Ha seleccionado la operación DIVISIÓN");
                break;
            case 5:
                System.out.println("Ha seleccionado la operación SALIR");
                break;
            default:
                System.out.println("Este número no coincide con ninguna de las "
                                   + "opciones disponibles");
                
        }
        
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
        
        //E6
        e6=1;
        System.out.println("E6. Los 30 primeros números enteros:");
        
        while (e6<=30){
            System.out.println(e6);
            e6++;
        }
        
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
        
        //E7
        
        e7=50;
        System.out.println("E7. Números pares entre 50 y 97");
        
        do{
            if (e7%2==0) {
                System.out.println(e7);
                e7++;
            }
            else 
            e7++;
        }
        while (e7<=97);
        
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
        
        //E8 y E9
        System.out.println("E8/E9. Tabla de multiplicar");
        do {
        e8pro=0;
        System.out.println("Introduce un número:");
        e8num = teclado.nextInt();
        while (e8pro<=10) {
            System.out.println(e8num + " x " + e8pro + " = " + e8num*e8pro);
            e8pro++;
        }
        System.out.println("¿Quieres multiplicar otro número? (s/n)");
        e9 = teclado.next();
        }
        while ("s".equals(e9));
        //PAUSA
        System.out.println("Ingrese una tecla para continaur al siguiente ejercicio");
        prueba = teclado.next();

        //FIN DE PAUSA
        
        //E10
        System.out.println("E10. Hallar divisores de un número");
        System.out.println("Introduce un número:");
        e10num1 = teclado.nextInt();
        
        if (e10num1>=0) 
            System.out.println ("El número " + e10num1 +" es positivo");        
        for (e10num2=1;e10num2<=e10num1;e10num2++)
            if (e10num1%e10num2==0)
                System.out.println (e10num2);
        
    }
    
}
