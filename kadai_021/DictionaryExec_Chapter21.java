package kadai_021;


public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        
        String[] wordsSearch = {"apple", "banana", "grape", "orange"};
        
        for (String word : wordsSearch) {
            System.out.println(dictionary.getMeaning(word));
        }
    }
}