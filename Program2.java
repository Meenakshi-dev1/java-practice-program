import java.util.Arrays;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Program2 {
    public static void main(String[] args)// starting point of execution and jvm entry point

    // words= ["This", "is", "a", "simple", "rule"]
    // 1.print even length words
    {
        String sentence = "This is a simple rule happy";
        String[] words = sentence.split(" ");// a collection of string is called an array []
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
        // 2. Insert a string into another string
        String original = "Hello world";
        String toInsert = "java ";
        int position = 6;
        StringBuilder sb = new StringBuilder(original);// stringbuilder helps to create mutable strings
        sb.insert(position, toInsert);// insert() is a method of string builder to insert text at a
        // specified position
        String modified = sb.toString();// String() convert string builder into normal string
        System.out.println("original string: " + original);
        System.out.println("Modified string: " + modified);
        // 3.check anagram
        String s1 = "listen";
        String s2 = "silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] arr1 = s1.toCharArray();// toCharArray() inbuilt method
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);// Arrays.sort() inbuilt method
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
        // 4.reverse a string

        String str = "Meenakshi";

        StringBuilder s4 = new StringBuilder(str);
        s4.reverse();

        System.out.println("Reversed String: " + s4);

        // 5.add characters to a string

        String str3 = "Meena";

        str3 = str3 + 'k'; // adding character
        str3 = str3 + "shi"; // adding string

        System.out.println(str3);
        // 6.iterate over characters in a string
        String str5 = "Meenakshi";

        for (int i = 0; i < str5.length(); i++) {
            System.out.println(str5.charAt(i));

        }
        // 7.convert enum into string
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY
        }
        Day d = Day.MONDAY;

        String str6 = d.toString();
        System.out.println(str6);
        // 8.get a character from the given string
        String str7 = "Meenakshi";

        char ch = str7.charAt(3); // index starts from 0

        System.out.println("Character at index 3: " + ch);
        // 9.convert string to string array
        String str8 = "Java is easy";

        String[] arr = str8.split(" ");

        for (String word : arr) {
            System.out.println(word);
        }
        // 10.get a character from the given string
        String str9 = "Meenakshi";

        char ch1 = str9.charAt(4); // index starts from 0

        System.out.println("Character: " + ch1);

        // 11.convert string to string array
        String str10 = "Java is very easy";

        String[] arr3 = str10.split(" ");

        for (String word : arr3) {
            System.out.println(word);

        }
        System.out.println(5 / 2.0);
        int x = 5;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        x = 5;
        x++;
        System.out.println(x);
        String s = "Hi";
        s.concat("! ");
        System.out.println(s);
        String m = "Meena";
        String n = new String("meena");
        System.out.println(m.equalsIgnoreCase(n));
        StringBuilder sbn = new StringBuilder("A");
        sbn.append("B");
        System.out.println(sbn);
        String l = "Meenakshis";
        String String2 = "";
        for (int i = l.length() - 1; i >= 0; i--) {
            String2 += l.charAt(i);
        }
        System.out.println(String2);
        if (l.equals(String2)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
        char[] array = l.toCharArray();
        System.out.println();
        System.out.println();
        System.out.println();
        int vowels=0;
        int constant=0;
        for (int i = 0; i < l.length(); i++) {
            System.out.println(array[i]);
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
                vowels++;

            } else {
                constant++;
            }

        }
        System.out.println("Vowels"+ vowels);
        System.out.println("Constant"+ constant);
        String stg="hockey is called our national game";
        String[] array1=stg.split(" ");
        for(int i=0;i<array1.length;i++)
        {
            System.out.println(array1[i]);
        }
        String stn=" hello world ";
        String st=stn.replaceAll("\\s", "");
        System.out.println(st);
        String sd="hello";
        String sn="";
        for(int i=0;i<sd.length();i++){
            if(sn.contains(sn)){
                sn+=sd.charAt(i);
            }
        }
        
    }
}
