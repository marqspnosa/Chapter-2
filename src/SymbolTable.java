import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PascalScanner implements Scanner{
    private Set<String> reservedWords = new HashSet<>();
    private Set<String> operators = new HashSet<>();
    public PascalScanner() {
        reservedWords.add("if");
        reservedWords.add("then");
        reservedWords.add("else");
        reservedWords.add("for");
        reservedWords.add("while");
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        operators.add(">");
        operators.add(">=");
        operators.add("<");
        operators.add("<=");
        operators.add("&");
        operators.add("|");
        operators.add("^");
    }
    @Override

    public List<String> tokenizer(String source) {
        List<String> result = new ArrayList<>();
        StringBuilder token = new StringBuilder();

        boolean isDigit = false;
        boolean isLetter = false;
        for( char c : source.toCharArray()) {
            if( c == ' '){
                if (token.length() > 0) {
                    (token.toString(), result);
                    token.setLength(0);
                }else if{
                    (operators.contains(String.valueOf(c)) {
                        if (token.length() > 0) {
                            (token.toString(), result);
                            token.setLength(0);
                        }
                        result.add(token.toString(c));
                        System.out.println(token + " is an operator");
                    }else if{
                        (Character.isDigit(c)) {
                            token.append(c);
                        }
                if (isDigit) {
                    isDigit = !isDigit;
                } else if( Character.isLetter(c) || c == '_' || c == '-' || c == '.') {
                    token.append(c);
                }
                if( !token.isEmpty() ) {
                    if (reservedWords.contains(token.toString())) {
                        System.out.println(token + " is a reserved word");
                    }if (operators.contains(token.toString())) {
                    System.out.println(token + " is an operator");
                }
                    } else {
                        System.out.println(token + " is an identifier");
                    }
                if (token.length() > 0) {
                    result.add(token.toString(), result);
                    token.setLength(0);
                } else {
                if( Character.isDigit(c)  ) {
                    token.append(c);
                    isDigit = true;
                } else if( Character.isLetter(c)) {
                    token.append(c);
                    isLetter = true;
                }
            }
        }
        return result;
    }