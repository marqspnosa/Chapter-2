import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class AlegebraEquation {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Provide a command line argument to the AlegebraEquation");
            return;
        }
        String command = args[0];
        List<String> tokens = tokenize(equation);
        if (tokens == null || tokens.isEmpty()) {
            System.out.println("LEXICAL ERROR: The equation is not in the correct format");
            return;
        }

        if(!isValidSyntax(tokens)) {
            System.out.println("SYNTAX ERROR: The equation is not in the correct format");
            return;
        }else{
            System.out.println("SUCCESS: The equation is in the correct format");
        }

        private static boolean isValidToken(String token) {
            if (part.equals("=")){
                return tokens.Equals;
                }else if{ (part.list("[a-z]")){
                return tokens.Variable;
            }else if{ (part.list("[0-9]")) {
                return token.integer;
            }else if{ (part.list"[*-/+")){
                return token.operator;
            }
            



            }
        }



    }
}
