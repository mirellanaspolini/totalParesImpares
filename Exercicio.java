import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int totalPar=0, resto=0, totalImpar=0;
        int[] listaNumeros = new int[10];
        Scanner leitor = new Scanner(System.in);

        for (int i=0;i < listaNumeros.length;i++){
            System.out.println("Digite um número:");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
            
            resto = listaNumeros[i] % 2;

            if (resto == 0){
                totalPar++;
            }else{ 
                totalImpar++;
            }
        }
        System.out.println(String.format("Quantidade de números pares: %d", totalPar));
        System.out.println(String.format("Quantidade de números ímpares: %d", totalImpar));
                
        leitor.close();
    }
}