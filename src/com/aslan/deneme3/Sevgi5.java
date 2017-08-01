package com.aslan.deneme3;
import java.util.Scanner;

public class Sevgi5 {
	     public static void main(String Arg[]) {
double vize, finl,ort;
Scanner oku= new Scanner(System.in);
        System.out.println("Vizeyi giriniz:");
		vize=oku.nextInt();
		System.out.println("Finali giriniz:");
		finl=oku.nextInt();
		ort=vize*0.4+finl*0.6;
		System.out.println("Ortalama="+ort);
		if(ort<45)
			System.out.println("KALDI");
		else
			System.out.println("GEÇTÝ");
	     
		
	}

}
