import java.util.Scanner;

public class ColorPersonality {
    // ANSI color codes for colorful output
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[37m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("===================================");
        System.out.println("     🌈 COLOR PERSONALITY CHECKER ");
        System.out.println("===================================\n");

        do {
            System.out.print("Enter a color name (e.g., Red, Blue, Green): ");
            String color = scanner.nextLine().trim().toLowerCase();

            switch (color) {
                case "red":
                    System.out.println(RED + "Red → Passion, Energy, Confidence" + RESET);
                    System.out.println("Quote: \"Red is the color of energy and determination.\"");
                    break;
                case "blue":
                    System.out.println(BLUE + "Blue → Calmness, Trust, Intelligence" + RESET);
                    System.out.println("Quote: \"Blue brings peace to the restless mind.\"");
                    break;
                case "green":
                    System.out.println(GREEN + "Green → Growth, Balance, Harmony" + RESET);
                    System.out.println("Quote: \"Green is the prime color of the world, from which its loveliness arises.\"");
                    break;
                case "yellow":
                    System.out.println(YELLOW + "Yellow → Happiness, Optimism, Creativity" + RESET);
                    System.out.println("Quote: \"Yellow is the color of sunshine and smiles.\"");
                    break;
                case "black":
                    System.out.println(BLACK + "Black → Power, Mystery, Elegance" + RESET);
                    System.out.println("Quote: \"Black is modest and arrogant at the same time.\"");
                    break;
                case "white":
                    System.out.println(WHITE + "White → Purity, Simplicity, Peace" + RESET);
                    System.out.println("Quote: \"White is not just a color, it’s the presence of light.\"");
                    break;
                case "purple":
                    System.out.println(PURPLE + "Purple → Royalty, Wisdom, Spirituality" + RESET);
                    System.out.println("Quote: \"Purple combines the calm stability of blue and the fierce energy of red.\"");
                    break;
                case "cyan":
                    System.out.println(CYAN + "Cyan → Freshness, Clarity, Inspiration" + RESET);
                    System.out.println("Quote: \"Cyan brings a refreshing vibe like the ocean breeze.\"");
                    break;
                default:
                    System.out.println("❌ Sorry, the color \"" + color + "\" is not in the list.");
            }

            System.out.print("\nDo you want to check another color? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
            System.out.println();

        } while (choice.equals("yes"));

        System.out.println("✨ Thank you for using Color Personality Checker! Stay colorful! ✨");
        scanner.close();
    }
}
