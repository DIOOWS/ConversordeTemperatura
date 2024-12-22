public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        while (true) {
            menu.exibirMenu();
            int opcao = menu.obterOpcao();

            if (opcao == 0) {
                System.out.println("Programa encerrado. Até mais!");
                menu.fecharScanner();
                break;
            }

            switch (opcao) {
                case 1:
                    double celsius = menu.obterTemperatura("Digite a temperatura em Celsius: ");
                    Conversor ConversorTemperatura = null;
                    double fahrenheit = ConversorTemperatura.celsiusParaFahrenheit(celsius);
                    System.out.printf("%.2f°C é igual a %.2f°F\n", celsius, fahrenheit);
                    break;

                case 2:
                    fahrenheit = menu.obterTemperatura("Digite a temperatura em Fahrenheit: ");
                    celsius = Conversor.fahrenheitParaCelsius(fahrenheit);
                    System.out.printf("%.2f°F é igual a %.2f°C\n", fahrenheit, celsius);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
