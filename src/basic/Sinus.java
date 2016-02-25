package basic;

import java.util.Scanner;

/**
 * premier petit programme histoire de se mettre en jambes
 * Created by croquette on 17/02/2016.
 */
public class Sinus {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.println(Math.sin(x));
    }
}
