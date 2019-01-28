import org.mockito.Mockito;
import java.util.Scanner;
/**
 * Calculadora.
 * @author CltControl
 *
 */
public class Calculadora {
     /**
      * Main.
      * @param args
     */
     public static void main(String[] args) {
        String opcion = args[0];
        String xa = args[1];
        String ya = args[2];
        IResta mockResta = Mockito.mock(IResta.class);
        Mockito.when(mockResta.resta(2.0, 2.0)).thenReturn(0.0);
        Mockito.when(mockResta.resta(3.0, 1.0)).thenReturn(2.0);
        Mockito.when(mockResta.resta(15.0, 3.0)).thenReturn(12.0);
        IMultiplicacion mockMultiplicacion = Mockito.mock(IMultiplicacion.class);
        Mockito.when(mockMultiplicacion.multiplicacion(2.0, 2.0)).thenReturn(4.0);
        Mockito.when(mockMultiplicacion.multiplicacion(3.0, 1.0)).thenReturn(3.0);
        Mockito.when(mockMultiplicacion.multiplicacion(15.0, 3.0)).thenReturn(45.0);
        
        IDivision mockDivision = Mockito.mock(IDivision.class);
        Mockito.when(mockDivision.division(2.0, 2.0)).thenReturn(1.0);
        Mockito.when(mockDivision.division(3.0, 1.0)).thenReturn(3.0);
        Mockito.when(mockDivision.division(15.0, 2.0)).thenReturn(5.0);
        
        IPotencia mockPotencia = Mockito.mock(IPotencia.class);
        Mockito.when(mockPotencia.potencia(2.0, 2.0)).thenReturn(4.0);
        Mockito.when(mockPotencia.potencia(3.0, 1.0)).thenReturn(3.0);
        Mockito.when(mockPotencia.potencia(15.0, 3.0)).thenReturn(225.0);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1)Suma");
        System.out.println("2)Resta");
        System.out.println("3)Multiplicacion");
        System.out.println("4)Division");
        System.out.println("5)Potencia");
        System.out.println("Que operacion desea realizar: ");
        //String opcion = sc.nextLine();
        double resultado;
        double x , y;
        switch (opcion) {
         case "1":
            System.out.println("(x + y)");
            System.out.print("Ingrese x : ");
            try {
                //x = sc.nextDouble();
                x = Double.parseDouble(xa);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            System.out.print("Ingrese y : ");
            try {
                //y  = sc.nextDouble();
                y  = Double.parseDouble(ya);
                Suma s = new Suma();
                resultado = s.suma(x , y);
                System.out.print("Resultado : " + resultado);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            

            break;
         case "2":
            System.out.println("(x - y)");
            System.out.print("Ingrese x : ");
            try {
                //x = sc.nextDouble();
                x = Double.parseDouble(xa);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            System.out.print("Ingrese y : ");
            try {
                //y  = sc.nextDouble();
                y = Double.parseDouble(ya);
                resultado = mockResta.resta(x , y);
                System.out.print("Resultado : " + resultado);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            
             
            break;
         case "3":
            System.out.println("(x * y)");
            System.out.print("Ingrese x : ");
            try {
                //x = sc.nextDouble();
                x = Double.parseDouble(xa);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            System.out.print("Ingrese y : ");
            try {
                //y  = sc.nextDouble();
                y  = Double.parseDouble(ya);
                resultado = mockMultiplicacion.multiplicacion(x , y);
                System.out.print("Resultado : " + resultado);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            
            break;
         case "4":
            System.out.println("(x / y)");
            System.out.print("Ingrese x : ");
            try {
                //x = sc.nextDouble();
                x = Double.parseDouble(xa);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            System.out.print("Ingrese y : ");
            try {
                //y  = sc.nextDouble();
                y  = Double.parseDouble(ya);
                resultado = mockDivision.division(x , y);
                System.out.print("Resultado : " + resultado);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            break;
         case "5":
            System.out.println("(x ^ y)");
            System.out.print("Ingrese x : ");
            try {
                //x = sc.nextDouble();
                x = Double.parseDouble(xa);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            System.out.print("Ingrese y : ");
            try {
                //y  = sc.nextDouble();
                y  = Double.parseDouble(ya);
                resultado = mockPotencia.potencia(x , y);
                System.out.print("Resultado : " + resultado);
            } catch (Exception e) {
                System.out.print("No es un numero");
                return;
            }
            break;
         default:
            System.out.print("No es una opcion válida");
            break;
        }
     }
}