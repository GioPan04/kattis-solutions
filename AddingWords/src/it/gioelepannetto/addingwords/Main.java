package it.gioelepannetto.addingwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final Scanner input = new Scanner(System.in);
    	Words words = new Words();

    	while(input.hasNextLine()) {
    		final ArrayList<String> data = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
    		final String cmd = data.get(0);

    		switch (cmd) {
				case "def":
					words.addWord(data.get(1), Integer.parseInt(data.get(2)));
					break;
				case "calc":
					data.remove(0);
					data.remove(data.size() - 1);
					String res = words.calculate(data.toArray(new String[0]));
					res = parseOperations(data.toArray(new String[0]), res);
					System.out.println(res);
					break;
				case "clear":
					words.clear();
					break;
			}
		}
    }

    private static String parseOperations(String[] data, String end) {
    	StringBuilder res = new StringBuilder();
    	for (String d: data) {
    		res.append(d).append(" ");
		}

    	res.append("= ");
    	res.append(end);

    	return res.toString();
	}
}
