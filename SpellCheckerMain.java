package Collectionss_SpellChecker;

import java.util.*;

public class SpellCheckerMain {
    public static void main(String[] args) {
//        Set<String> knownWordsList = new HashSet<>();
//
//        knownWordsList.add("ana");
//        knownWordsList.add("are");
//        knownWordsList.add("mere");
//        knownWordsList.add("pune");
//        knownWordsList.add("joc");
//
//        Set<String> wordsFromText = new HashSet<>();
//        wordsFromText.add("ana");
//        wordsFromText.add("sadfasf");
//        for(String word : wordsFromText){
// //           System.out.println(word);
//        }
////        System.out.println(knownWordsList);
////        System.out.println(knownWordsList.size());
//        System.out.println(knownWordsList.contains("ana"));

        //todo reload


        //   Set<String> dictionary = Set.of("aa", "bb", "cc");    //immutabil set.of
        Set<String> dictionary = new HashSet<>();
        //   List<String> wordsFromText = Arrays.asList("aa", "dd", "gg");    //immutabil set.of
        List<String> wordsFromText = new ArrayList<>();    //immutabil set.of
        System.out.println(findBadWords(dictionary, wordsFromText));
//citirea dictionarului
        Scanner console = new Scanner(System.in);
        System.out.println("Introduceti numarul de cuvinte din dictionar");
        int number = Integer.parseInt(console.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Introduceti urmatorul cuvant: ");
            String word = console.nextLine();
            dictionary.add(word);
        }
        System.out.println(dictionary);

        //citirea textului
        System.out.println("Introduceti numarul de linii: ");
        int numberOfLines = Integer.parseInt(console.nextLine());
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Introduceti urmatoarea linie: ");
            String line = console.nextLine();
            String[] words = line.split(" ");
            for (int j = 0; j < words.length; j++) {
                wordsFromText.add(words[j]);
            }
        }
        System.out.println(wordsFromText);
        //verificarea textului pt cuvinte eronate
        System.out.println(findBadWords(dictionary, wordsFromText));
    }

    public static Set<String> findBadWords(Set<String> dictionary, List<String> wordsFromText) {
        Set<String> badWords = new HashSet<>();
        for (String word : wordsFromText) {
            if (!dictionary.contains(word)) {
                badWords.add(word);
            }
        }
        return badWords;
    }
}

