import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║         🌎 Conversor de Moedas Virtual        ║");
            System.out.println("╠══════════════════════════════════════════════ ╣");
            System.out.println("║ 1️⃣  Dólar 🇺🇸  => Peso argentino 🇦🇷            ║");
            System.out.println("║ 2️⃣  Peso argentino 🇦🇷 => Dólar 🇺🇸             ║");
            System.out.println("║ 3️⃣  Dólar 🇺🇸  => Real brasileiro 🇧🇷           ║");
            System.out.println("║ 4️⃣  Real brasileiro 🇧🇷 => Dólar 🇺🇸            ║");
            System.out.println("║ 5️⃣  Dólar 🇺🇸  => Peso colombiano 🇨🇴           ║");
            System.out.println("║ 6️⃣  Peso colombiano 🇨🇴 => Dólar 🇺🇸            ║");
            System.out.println("║ 7️⃣  ❌ Sair                                  ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            System.out.print("👉 Escolha uma opção válida: ");


            option = scanner.nextInt();

            if (option >= 1 && option <= 6) {
                String[] currencies = getCurrenciesByOption(option);
                System.out.print("Digite o valor que deseja converter: ");
                double amount = scanner.nextDouble();
                System.out.printf("Você quer converter %.2f de %s para %s%n", amount, currencies[0], currencies[1]);


                System.out.println();
                System.out.println("╔═══════════════════════════════════════════════╗");
                System.out.println("║         ✅ Opção selecionada: " + option + "                           ║");
                System.out.println("╠═══════════════════════════════════════════════╣");
                System.out.println("║ Aguarde enquanto processamos a conversão...   ║");
                System.out.println("╚═══════════════════════════════════════════════╝");
                System.out.println();
            } else if (option == 7) {
                System.out.println();
                System.out.println("╔═══════════════════════════════════════════════╗");
                System.out.println("║      👋 Obrigado por usar o conversor!        ║");
                System.out.println("╚═══════════════════════════════════════════════╝");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("╔═══════════════════════════════════════════════╗");
                System.out.println("║      ⚠️  Opção inválida. Tente novamente.     ║");
                System.out.println("╚═══════════════════════════════════════════════╝");
                System.out.println();
            }

        } while (option != 7);

        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║     ✅ Programa encerrado. Obrigado por usar! ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        scanner.close();
    }

    public static String[] getCurrenciesByOption(int option) {
        return switch(option) {
            case 1 -> new String[]{"USD", "ARS"};
            case 2 -> new String[]{"ARS", "USD"};
            case 3 -> new String[]{"USD", "BRL"};
            case 4 -> new String[]{"BRL", "USD"};
            case 5 -> new String[]{"USD", "COP"};
            case 6 -> new String[]{"COP", "USD"};
            default -> null;
        };
    }

}