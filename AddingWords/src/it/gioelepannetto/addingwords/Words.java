package it.gioelepannetto.addingwords;

import java.util.HashMap;
import java.util.Map;

public class Words {
    public HashMap<String,Integer> words = new HashMap<>();

    public void addWord(String word, int value) {
        words.put(word, value);
    }

    public void clear() {
        words = new HashMap<>();
    }

    public String calculate(String[] input) {
        Integer left = null;
        Operation operation = Operation.add;
        Integer right = null;

        for (String s : input) {
            if (s.equals("+")) {
                operation = Operation.add;
            } else if (s.equals("-")) {
                operation = Operation.sub;
            } else {
                if (left == null) {
                    left = words.get(s);
                    if (left == null) return "unknown";
                } else {
                    right = words.get(s);
                    if (right == null) return "unknown";

                    if(operation == Operation.add) {
                        left = left + right;
                    } else {
                        left = left - right;
                    }
                    right = null;
                }
            }
        }

        assert left != null;
        return getName(left);
    }

    private String getName(int value) {
        for (Map.Entry<String,Integer> entry: words.entrySet()) {
            if(entry.getValue() == value) {
                return entry.getKey();
            }
        }

        return "unknown";
    }

    private enum Operation {
        add, sub
    }
}
