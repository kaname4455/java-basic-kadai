package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        dictionary = new HashMap<String, String>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    public String getMeaning(String word) {
        String result = dictionary.get(word);
        if (result == null) {
            return word + "は辞書に存在しません";
        } else {
            return word + "の意味は" + result;
        }
    }
}