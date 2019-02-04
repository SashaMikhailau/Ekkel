package ekkel_exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        while (true) {
            try {

                if (i == 5) {
                    break;
                }
            } finally {
                System.out.println(i);
            }
        }
    }
}
