import java.util.Scanner;

public class NumeroDeFibonacci {

    public static int lim=0;
    public static int x =0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("límite de la serie ");
        lim = in.nextInt();
        System.out.println("La serie llegará hasta la posición "+lim);
        lector(x, lim);

    }
public static int sumaSerie(int x){
        if(x == 0 || x==1)
            return 1;
        else
            return sumaSerie(x - 1) + sumaSerie(x - 2);
    }
    public static void lector(int x, int lim){
            System.out.println(" indice: "+x+" número de la serie: "+sumaSerie(x));
            x++;
            if(x<=lim)
        lector(x, lim);
    }
}