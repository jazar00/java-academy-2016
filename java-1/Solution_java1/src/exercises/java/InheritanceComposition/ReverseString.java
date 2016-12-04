package exercises.java.InheritanceComposition;

public class ReverseString implements CharSequence {
    private String myString;

    public ReverseString(String theString) {
        this.myString = theString;
    }

    private int finalPosChar(int i) {
        return myString.length()-1-i;
    }

    public char charAt(int i) {
        return myString.charAt(finalPosChar(i));
    }

    public int length() {
        return myString.length();
    }

    public CharSequence subSequence(int start, int end) {
        StringBuilder string = new StringBuilder(myString.subSequence(finalPosChar(end), finalPosChar(start)));
        return string.reverse();
    }

    public String toString() {
        StringBuilder s = new StringBuilder(this.myString);
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString s =
            new ReverseString("This is a test string");

        //exercise toString();
        System.out.println(s);

    }
}