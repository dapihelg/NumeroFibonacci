import java.util.Scanner;

public class NumerosDeFibonacciIterativo {
    public static int ant1;
    public static int ant2;
    public static int actual;
    public static int x;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Índice: ");
        x = entrada.nextInt();
        entrada.close();
        fibonacci(x);;

    }

    static int fibonacci(int x){
        int cont;
        int actual = 0, ant1, ant2;
        ant1 = ant2 = 1;
        if(x ==0 || x == 1)
            actual = 1;
        else
            for(int i = 2; i<=x; i++){
                actual = ant1+ant2;
                ant2 = ant1;
                ant1 = actual;
                cont = i-1;
                System.out.println("Índice "+cont+" número de la serie "+ant1);
            }
            return actual;
    }
}
