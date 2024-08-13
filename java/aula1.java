import java.util.Scanner;

// Esse eh um comentario feliz
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soma = calculaSomaDosMultiplosDeCincoEImpar(n);
        System.out.println(soma);
    }

    // Essa funcao eh legal
    public static int calculaSomaDosMultiplosDeCincoEImpar(int n){
        int soma = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0 || i % 5 == 0){
                soma += i;
            }
        }
        ;
    }
}
