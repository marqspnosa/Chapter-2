private void processToken(String token, List<String> result) {
    if(reservedWords.contains(token)) {
        System.out.println(token + " is a reserved word");
    }else if (operators.contains(token)) {
        System.out.println(token + " is an operator");
    }else{
        System.out.println(token + " is an identifier");
    }
    result.add(token);
}




