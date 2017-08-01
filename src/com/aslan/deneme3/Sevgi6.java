package com.aslan.deneme3;

import java.util.Scanner;

public class Sevgi6 {
         public static void main (String Arg[]) {
        	 int n,gun,s;
        	 double ort,toplam;
        	 ort=toplam=0;
        	          Scanner oku = new Scanner(System.in);
        	          System.out.println("Adedi giriniz=");
        	          n=oku.nextInt();
        	          for(s=0;s<n;s++)
        	          {
        	        	  System.out.println((s+1)+". günü giriniz=");
        	        	  gun=oku.nextInt();
        	        	  toplam+=gun;
        	        	 
        	          }
         ort=toplam/n;
         System.out.println(n+" günün ortalama sýcaklýðý="+ort);
         
         
         }
         
}
