    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Calculadora");

            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            double soma = num1 + num2;
            double diferença = num1 - num2;
            double produto = num1 * num2;
            double quociente = num1 / num2;

            System.out.printf("Soma: %.2f\n", soma);
            System.out.printf("Diferença: %.2f\n", diferença);
            System.out.printf("Produto: %.2f\n", produto);
            System.out.printf("Quociente: %.2f\n", quociente);
        }
    }