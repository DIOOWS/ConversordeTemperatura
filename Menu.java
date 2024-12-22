import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu(){
        this.scanner = new Scanner(System.in);
    }


    public void exibirMenu(){
        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("0. Sair");
    }

     public int obterOpcao() {
        System.out.print("\nDigite sua opção: ");
        return scanner.nextInt();
    }

    public double obterTemperatura(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public void fecharScanner() {
        scanner.close();
    }

}
