package PROVAA1;
import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de páginas lidas: ");
        double paginas = entrada.nextDouble();

        System.out.println("Digite o tempo total gasto na leitura (em minutos).");
        double tempoTotal = entrada.nextDouble();

        double media = (tempoTotal + paginas) / 2;

        if (media >= 4) {
            System.out.println("\nLeitura profunda");
            
        
            System.out.println("\nA média calculada é: " + media);
            double mediaCalculada = entrada.nextDouble();

            System.out.println("\nClassificação final da leitura: ");
            String classificacao = entrada.nextLine();
        
        } else if (tempoTotal < 1);
        System.out.println("\nDados insuficientes para análise de leitura.");
        

             entrada.close();
        

    }
    
}
