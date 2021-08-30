package com.company;

public class StringExample {
    public static void main(String[] args) {

        //Working of split
        String string = "string_is_a_string";
        String[] stringArray = string.split("_");
        for(String a : stringArray){
            System.out.println(a);
        }

        System.out.println("==========================");

        //When limit>0 split will be applied at most limit-1 times
        //Even if limit is higher value, zero or negative value it will work
        String[] stringArray2 = string.split("_",3);
        for (String a : stringArray2){
            System.out.println(a);
        }

        System.out.println("==========================");

        //get each and every word
        String string2 = "Yes, I am not that extra-offended.";
        String[] stringArray3 = string2.split("[, -.]+");
        for (String a : stringArray3) {
            System.out.println(a);
        }
        //Words are separated when the characters specified in the regex set is encountered

    }
}
