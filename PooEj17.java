import java.util.Scanner;

public class PooEj17 {
    public static void main(String[] args) {
        int suma = 0;
        int num = 1;
        System.out.println("Ingrese la cantidad de numeros a sumar: ");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();//numeros totales a sumas
        while(num <= n){
            suma += num;
            num +=1;
        }
        System.out.println("La suma es: "+suma);
    }
}