package classwork;

import java.util.Random;

public class Random_letters {
    public static String gen_random(Random rb, int length, String characters) {
        char[] txt = new char[characters.length()];
        for (int i = 0; i < length; i++) {

            txt[i] = characters.charAt(rb.nextInt(characters.length()));
        }

        return new String(txt);

    }

    public static void main(String[] args) {
        String str = "";
        for (int i = 65; i <= 122; i++) {
            if (i > 90 && i < 97) {
                continue;
            }
            str += (char) i;
        }


        //System.out.println(str);
        String s = gen_random(new Random(), 20, str);
        System.out.println(s);
    }
}
