package _2_Streamy;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Zadania 1-4
// 1) Wszystkie nazwiska o długości co najwyżej 4 znaków, zapisane wielkimi literami
//2) Wszystkie nazwiska zaczynające się na literę 'B'
//3) Początkowe trzy litery wszystkich nazwisk, bez powtórzeń, z małych liter
//4) 10 najdłuższych nazwisk, posortowanych malejąco według długości

public class _Streams_1_4 {
    public static void main(String[] args) {

        // 1) Wszystkie nazwiska o długości co najwyżej 4 znaków, zapisane wielkimi literami
            List<String> list = DataCollections.getSurnames().stream()
                .filter(nazwisko -> nazwisko.length()<=4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());   // bardziej zwięzły sposób [z lambdami] by coś zapisać
            System.out.println(list);

            //2) Wszystkie nazwiska zaczynające się na literę 'B'
            List<String> list2 = DataCollections.getSurnames().stream()
                .filter(nazwisko -> nazwisko.startsWith("P"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());   // bardziej zwięzły sposób [z lambdami] by coś zapisać
            System.out.println(list2);

            //3) Początkowe trzy litery wszystkich nazwisk, bez powtórzeń, z małych liter
            Set<String> stringSet = DataCollections.getSurnames().stream()
                    .map(s->s.toLowerCase())
                    .map(s -> s.substring(0,3))
                    .collect(Collectors.toSet());
            System.out.println(stringSet);

// *** do poprawienia !!!
//            //4) 10 najdłuższych nazwisk, posortowanych malejąco według długości
//            List<String> list4 =DataCollections.getSurnames().stream()
//                    .sorted(Comparator<String>()){
//                @Override
//                public int compare(String o1, String o2){
//                    return o2.length()-o1.length();
//                } // compare
//            }
    }// main()
}
