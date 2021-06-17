package it.gioelepannetto.aliennubers;

import java.util.ArrayList;

public class AlienDictionary {
    public final String[] numbers;

    public AlienDictionary(final String[] numbers) {
        this.numbers = numbers;
    }

    public static AlienDictionary fromInput(final String input) {
        final String[] words = input.split("");
        return new AlienDictionary(words);
    }

    public String convert(String number, AlienDictionary to) {
        String currentNumber = numbers[0];

    }
}
