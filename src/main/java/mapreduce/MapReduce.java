import java.util.*;

public class MapReduce {
    public static void main(String[] args) {
        String[] input = input();
        
        List<Mapped> mapped = map(input);
        Map<String, Integer> reduced = reduce(mapped);
        
        System.out.println(reduced);
    }
    
    private static String[] input() {
        String[] input = new String[10];
        input[0] = "what is this";
        input[1] = "where are you from";
        input[2] = "what do you mean";
        input[3] = "why not";
        input[4] = "how are you";
        input[5] = "what time is it now";
        input[6] = "this is it";
        input[7] = "when do you wake up";
        input[8] = "who are you";
        input[9] = "yes we can";
        return input;
    }

    private static List<Mapped> map(String[] input) {
        List<Mapped> mapped = new ArrayList<>();
        // TODO splitしたlistでforループさせる
        for (int i = 0; i < input.length; i++) {
            String sentence = input[i];
            String[] words = sentence.split(" ", 0);
            for (int j = 0; j < words.length; j++) {
                mapped.add(new Mapped(words[j], 1));
            }
        }
        return mapped;
    }

    private static Map<String, Integer> reduce(List<Mapped> mapped) {
        Map<String, Integer> reduced = new HashMap<>();
        for (Mapped map : mapped) {
            Integer i = 0;
            if (reduced.containsKey(map.getKey())) i = reduced.get(map.getKey());
            reduced.put(map.getKey(), i + map.getValue());
        }
        return reduced;
    }
}

class Mapped {
    private String key;
    private Integer value;

    public Mapped(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public Integer getValue() {
        return this.value;
    }
}
