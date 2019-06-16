package _1_PanTadeusz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class PanTadeusz {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "C:\\JAVA_SDA\\plsda209160616_niedziela_programowanie2\\src\\main\\resources\\PanTadeusz.txt";
        Scanner scanner = new Scanner(new File(filePath));



        while (scanner.hasNextLine()){
            String linia = scanner.nextLine();
            String[] slowa = linia.split(" ");
            for (String word: slowa
                 ) {
                // Dodaje słowo do mapy
//                if (wordCount.containsKey(word)) // Jeżeli słowo już istnieje
//                {
//                    Integer ileRazy = wordCount.get(word);
//                    ileRazy++;
//                    wordCount.put(word, ileRazy); // Dodaj 1 do ilości wystąpień
//                }
//                else wordCount.put(word, 1); // Dodaj nowe słowo i ustaw 1 jako ilość wystąpień
//            }
            }
        } //while

        System.out.println(wordCount);

    } //main

//    private static HashMap<String, Integer> wordCount = new HashMap<>();

    // Dodaje słowo do mapy

    private static HashMap<String, Integer> wordCount = new HashMap<>();

    private static void dodaj_slowo(String nslowo) {
            if (wordCount.containsKey(nslowo)) // Jeżeli słowo już istnieje
                {
                    Integer ileRazy = wordCount.get(nslowo);
                    ileRazy++;
                    wordCount.put(nslowo, ileRazy); // Dodaj 1 do ilości wystąpień
                }
                else wordCount.put(nslowo, 1); // Dodaj nowe słowo i ustaw 1 jako ilość wystąpień
    }


} //class
