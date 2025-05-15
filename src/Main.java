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

            // Por enquanto apenas exibindo a opção selecionada
            if (option >= 1 && option <= 6) {
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
}