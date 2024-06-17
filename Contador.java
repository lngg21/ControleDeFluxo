import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int par1 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int par2 = scanner.nextInt();

        try {
            contar(par1, par2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int par1, int par2) throws ParametrosInvalidosException {
        if (par1 > par2) {
            throw new ParametrosInvalidosException("O segundo parâmetro tem que ser maior que o primeiro.");
        }
        int contagem = par2 - par1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
