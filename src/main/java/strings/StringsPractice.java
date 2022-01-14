package strings;

public class StringsPractice {

    public static String reverseString (String word){

        System.out.println("The word is: " +word);

        if (word.length() == 0){
            return "invalid string";
        }
        char[] ch = word.toCharArray();

        int left = 0;
        int right = ch.length -1;

        while (left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left ++;
            right --;
        }

        return String.valueOf(ch);
    }


    public static void main(String[] args)
    {
        System.out.println("The reverse word is: " +reverseString("hello"));

    }
}
