import org.example.Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();

        double resultado;

        try {
            switch (opcao) {
                case 1:
                    resultado = calc.somar(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = calc.subtrair(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = calc.multiplicar(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    resultado = calc.dividir(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;

                default:
                    System.out.println("Operação inválida!");
            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}