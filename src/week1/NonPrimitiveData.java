package week1;

public class NonPrimitiveData {
    public static void main(String[] args)  {
        String name = "Adam";
        System.out.println("NAME : " + name );
        System.out.println("name variables length is " + name.length() + ".");
        int nameLength = name.length();
        System.out.println("name's length : " + nameLength);

        /**
         * Java counts position from zero.
         * 0 is the first position in a string, 1 is the second, 2 is the third...
         * if ther eis no such a text it's going to return -1
         */

        // 012345


        String txt = "Clarusway sdet course.";
        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("way"));
        System.out.println("A"));

        name = "Jack";

    }

}
