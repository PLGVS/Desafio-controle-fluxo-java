import java.util.Locale;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        try{
           contar(num1, num2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O primeiro número deve ser menor que o segundo");
        }
        sc.close();
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2){
            throw new ParametrosInvalidosException();
        }
        for (int i = 1; i < num2 - num1; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
