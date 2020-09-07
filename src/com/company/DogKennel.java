package com.company;

import java.util.Scanner;

public class DogKennel {
    public void addDog(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Dog [] ken = new Dog[N];
        for(int i=0; i<N; i++){
            String n = scan.nextLine();
            int a = scan.nextInt();
            ken[i] = new Dog(n, a);
        }
    }

}
