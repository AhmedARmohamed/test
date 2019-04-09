package com.company;

public class Main {

    public static void main(String[] args) {
    Hun hunobj = new Hun();
    Hun hunobj2 = new Hun(5);
    Hun hunobj3 = new Hun(5,13);
    Hun hunobj4 = new Hun(5,13,45);
    System.out.printf("%s\n", hunobj.toMilitary());
    System.out.printf("%s\n", hunobj2.toMilitary());
    System.out.printf("%s\n", hunobj3.toMilitary());
    System.out.printf("%s\n", hunobj4.toMilitary());
}
}
