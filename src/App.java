import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Variáveis
        float raio, area;
        Scanner teclado = new Scanner(System.in);
        // Entrada
        System.out.print("digite o valor do raio:\t");
        raio = teclado.nextFloat();
        teclado.close();
        
        // Processamento
        area = (float) Math.PI * raio * raio;

        // Saída
        System.out.printf("A = %.4f", area);
    }
}
