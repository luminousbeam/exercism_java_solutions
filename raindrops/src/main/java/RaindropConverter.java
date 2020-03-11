class RaindropConverter {
    String convert(int number) {
        String returnString="";
        if(number % 3 == 0) returnString+="Pling";
        if(number % 5 == 0) returnString+="Plang";
        if(number % 7 == 0) returnString+="Plong";
        return (returnString.isEmpty()) ? Integer.toString(number) : returnString;
    }  
}
