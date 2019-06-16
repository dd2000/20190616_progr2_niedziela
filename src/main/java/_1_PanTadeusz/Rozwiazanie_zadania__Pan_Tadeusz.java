package _1_PanTadeusz;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Map.*;

public class Rozwiazanie_zadania__Pan_Tadeusz {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\resources\\pan-tadeusz.txt");

        Scanner scanner = new Scanner(file);

        // Map<slowo, iloscWystapienSlowa>
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.toLowerCase();
            line = line.replaceAll("[^a-zęóąśłżźćń ]", "");
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.isEmpty()) {
                    continue;
                }
                if (countMap.containsKey(word)) {
                    // to slowo juz znajduje sie w mapie
                    Integer count = countMap.get(word);
                    countMap.put(word, count+1);
                } else {
                    // to nowe slowo, dotychczas go nie bylo!
                    countMap.put(word, 1);
                }
            }
        }
        //System.out.println(countMap);

        List<Map.Entry<String, Integer>> list = countMap.entrySet().stream()
                .sorted(Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(list);

        // "ręczny" sposób na posortowanie mapy
        // przekształcenie jej na listę par słowo+iloscWystapień
//        List<Map.Entry<String, Integer>> entries = new ArrayList<>(countMap.entrySet());
        // posorotwanie za pomocą samodzielnie napisanego comparatora
//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> element1,
//                               Map.Entry<String, Integer> element2) {
        // gdzie okreslamy, jak porównać jedną parę z drugą (a Java zajmie się resztą)
//                return element2.getValue() - element1.getValue();
//            }
//        });

        //System.out.println(entries);

    }
}
