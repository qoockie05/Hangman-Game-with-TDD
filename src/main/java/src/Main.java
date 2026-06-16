package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        boolean czyGraTrwa = true;

        while (czyGraTrwa) {
            int wybor = menu.pobierzPoprawnyWybor(scanner);

            switch(wybor) {
                case 1 -> {
                    System.out.println("\n--- URUCHAMIANIE NOWEJ ROZGRYWKI ---");

                    Gracz gracz = new Gracz();
                    gracz.wczytajNick();

                    Slowa slowa = new Slowa();
                    String tajneSlowo = slowa.losujSlowo();

                    Gra gra = new Gra(tajneSlowo);
                    Wisielec wisielec = new Wisielec();

                    boolean partiaZakonczona = false;

                    while (!partiaZakonczona) {
                        System.out.println(wisielec.rysujWisielca(gra.getLives()));
                        System.out.println("Hasło: ");
                        gra.printCurrentStateForWord();
                        System.out.println("Pozostałe życia: " + gra.getLives());

                        System.out.println("Podaj literę (lub wpisz całe hasło): ");
                        String strzal = scanner.nextLine().trim();

                        if (strzal.isEmpty()) continue;

                        if (strzal.length() > 1) {
                            gra.enterWord(strzal);
                        }
                        else {
                            gra.guessLetter(strzal.charAt(0));
                        }

                        boolean czyOdgatniete = true;
                        for (char c : gra.getGuessedState()) {
                            if (c == '_') {
                                czyOdgatniete = false;
                                break;
                            }
                        }
                        if (czyOdgatniete || gra.isLost()) {
                            partiaZakonczona = true;
                            System.out.println(wisielec.rysujWisielca(gra.getLives()));
                            gra.koniec();
                        }
                    }
                }

                case 2 -> System.out.println("-> (zarządzanie słownikiem)");
                case 3 -> {
                    System.out.println("Zamykanie gry. Do zobaczenia!");
                    czyGraTrwa = false;
                }
            }
        }
        scanner.close();
    }
}
