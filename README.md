# Day21KC
import java.util.Arrays;
public class Main {


    /*
    Given a string that has nested parenthesis, remove the outer most
    parenthesis. Return the updated string.

    Input: ((425))
    Output: (425)

    Input: ((()))
    Output: (())

   One method will involve converting the string to an array.
     */

        /*
        "((425))"
            - Convert the input to an array //   {"(","(","4","2","5",")",")"}

            {"","(","4","2","5",")",")"}
            - Iterate from beginning of input. If "(" change that element to a "" and break out of loop.

            {"","(","4","2","5",")",""}
            - Iterate from end of input. If ")" change that element to a "" and break out of loop.

            {"","(","4","2","5",")",""}
            - Convert the array to a string by creating a new string
        */

        public static String removeOuterParentheses(String str) {
//      Convert the input to an array  EX: {"(","(","4","2","5",")",")"}
            String[] arrayify = str.split("");

//      Iterate from beginning of input. If "(" change that element to a "" and break out of loop.
            for (int i = 0; i < arrayify.length; i++) {
                if (arrayify[i].equals("(")) {
                    arrayify[i] = "";

//              Iterate from end of input. If ")" change that element to a "" and break out of loop.
                    for (int j = arrayify.length-1; j > 0; j--) {
                        if (arrayify[j].equals(")")) {
                            arrayify[j] = "";
                        }
                        break;
                    }

                    break;
                }
            }

            // Create empty string and loop through the array with outer parentheses removed to
            // concatenate each value to the output string.
            String output = "";
            for (String i: arrayify) {
                output+=i;
            }

            return output;
        }


        public static void main(String[] args) {
            System.out.println(removeOuterParentheses("(425)"));
            System.out.println(removeOuterParentheses1("(((425)))"));



         // Another way of removing outer parentheses

        }
        public static String removeOuterParentheses1(String str) {
            StringBuilder strBuilder = new StringBuilder();
            int count = 0;
            for (char chr : str.toCharArray()) {
                if (chr == '(' && count++ > 0) strBuilder.append(chr);
                if (chr == ')' && count-- > 1) strBuilder.append(chr);
            }
            return strBuilder.toString();

        }

    }

