package edu.cnm.deepdive;

public class PartOneOfStringMethods {

  public static void main(String[] args) {
    String str = "Java is fun";

    //length
    System.out.println("length = " + str.length());

    //charAt()
    System.out.println();
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(2));
    System.out.println(str.charAt(6));
    //System.out.println(str.charAt(12));Exception in thread "main" java.lang.StringIndexOutOfBoundsException

    //indexOf()
    System.out.println();
    System.out.println(str.indexOf('a'));//index of the first 'a' gives 1
    System.out.println(str.indexOf('a', 2));//first letter a starting from index 2 gives 3
    System.out.println(str.indexOf("fun"));//gives 8 as first index of the String fun
    System.out
        .println(str.indexOf("fun", 10));//looking for the String fun starting from index 10 gives
    //-1 as not found

    //substring
    System.out.println();
    System.out.println(str.substring(8));//will print everything from index 8 onwards.
    System.out.println(str.substring(0, 5));//from 0 to 5 but not including 5. Prints "Java "
    System.out.println(str.substring(4, 4));//prints an empty String
    //System.out.println(str.substring(4, 2));will throw a StringIndexOutOfBoundsException
    //System.out.println(str.substring(8, 14));will throw a StringIndexOutOfBoundsException

    //toLowerCase() and toUpperCase()
    System.out.println();
    System.out.println("AbCd".toLowerCase());//prints abcd
    System.out.println(str.toUpperCase());//prints Java is fun
    System.out
        .println(str);//still prints the original Java is fun because Strings are immutable and
    //we did not assign the new String in uppercase to str.

    System.out.println();
    str = str.toUpperCase();//now we assign the uppercase String to str
    System.out.println(str);//prints JAVA IS FUN

    System.out.println();
    String dog = "Lucky";
    dog.toUpperCase();
    System.out.println(dog);//prints Lucky because of String immutability

  }

}
