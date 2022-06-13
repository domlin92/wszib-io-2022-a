/**
 * To jest program do rozpoznawania trójkąta.
 */

class Trojkaty {

    /**
     * Funkcja zwraca ile par odcinków trójkąta ma jednakową długość.
     * @param {float} a - Długość pierwszego boku.
     * @param {float} b - Długość drugiego boku.
     * @param {float} c - Długość trzeciego boku.
     */
    public static int ileJednakowych(float a, float b, float c){
        int jednakowe = 0; // tutaj zliczamy ile jest jednakowych bokow
        if (a == b) {
            jednakowe++;
        }
        if (b == c) {
            jednakowe++;
        }
        return jednakowe;
    }

    /**
     * Główna funkcja programu
     *
     * @param {float} a - Długość pierwszego boku.
     * @param {float} b - Długość drugiego boku.
     * @param {float} c - Długość trzeciego boku.
     */


    public static void jakiTrojkat(float a, float b, float c) {
        int jednakoweDlugosci = ileJednakowych(a, b, c); // tutaj zliczamy ile jest jednakowych bokow
        if (jednakoweDlugosci > 1) {
            System.out.println("Trójkąt równoboczny");
        } else if (jednakoweDlugosci > 0) {
            System.out.println("Trójkąt równoramienny");
        }
        // TODO: tutaj trzeba bedzie dopisac inne przypadki
    }

    /**
     * Wyświetla ekran pomocy
     */
    public static void pomoc() {
        System.out.println("Acme INC. (C) 2022");
        System.out.println("Program do rozpoznawania rodzaju trójkąta");
        System.out.println("Uruchom z trzema argumentami liczbowymi - długość boków trójkąta");
    }

    /**
     * Główna funkcja
     */
    public static void main(String... args) {
        if (args.length != 3) {
                pomoc();
                System.exit(1);
        }
        float a = Float.valueOf(args[0]);
        float b = Float.valueOf(args[1]);
        float c = Float.valueOf(args[2]);

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Długości boków trójkąta muszą być nieujemne!");
            System.exit(2);
        }

        if (!czyIstniejeTrojkat(a, b, c)) {
            System.out.println("Z podanych długości boków nie da się zbudować trójkąta");
            System.exit(3);
        }

        jakiTrojkat(a, b, c);
    }
}
