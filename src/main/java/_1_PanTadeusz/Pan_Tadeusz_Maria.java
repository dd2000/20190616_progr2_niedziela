package _1_PanTadeusz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Pan_Tadeusz_Maria {

        public static void main(String[] args) throws FileNotFoundException {

            String filePath = "src\\main\\resources\\pan-tadeusz.txt";

            Scanner scanner = new Scanner(new File(filePath));

            while( scanner.hasNextLine()) {
                String zdanie = scanner.nextLine();
                String[] slowa = zdanie.split(" ");



                for (String word : slowa) {
                    word = word.toLowerCase();
                    word = word.replaceAll("[-;!?.,:]", "");
                    dodaj(word);
                }
            }
            System.out.println(licznikslow);

        }
        private static TreeMap<String, Integer> licznikslow = new TreeMap<String, Integer>();

        private static void dodaj (String slowo){
            if(licznikslow.containsKey(slowo)){
                Integer ileRazy = licznikslow.get(slowo);
                ileRazy++;
                licznikslow.put(slowo, ileRazy);
            } else {
                licznikslow.put(slowo, 1);
            }
        }

}
