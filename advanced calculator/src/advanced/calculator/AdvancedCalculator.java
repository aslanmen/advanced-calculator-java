/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.calculator;

import java.util.Scanner;

/**
 *
 * @author aasla
 */
public class AdvancedCalculator {

   public static int çıkarma(int a,int b){
   
    return (a-b);
   
   }
   public static double bölme(double a,double b){
   
    return (a/b);
   
   }
   public static int toplama(int a,int b){
   
    return (a+b);
   
   }
   public static int toplama(int a,int b,int c){
   
    return (a+b+c);
   
   }
   public static int çarpma(int a,int b){
   
    return (a*b);
   
   }
   public static int çarpma(int a,int b,int c){
   
    return (a*b*c);
   
   }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String işlemler="1.toplama işlemi\n"
                + "2.çıkarma işlemin\n"
                + "3.çarma işlemi\n"
                + "4.bölme işlemi\n"
                + "çıkış için enter tuşuna basınız";
        System.out.println("********************");
        System.out.println(işlemler);
         System.out.println("********************");
         while(true){
             System.out.println("işlemi seçiniz :");
             String işlem=input.nextLine();
             if (işlem.equals("")) {
                 System.out.println("programdan çıkılıyor");
                 break;
             }
             else if (işlem.equals("1")) {
                 System.out.println("kaç değer toplaycaksınız");
                 int kacsayi=input.nextInt();
                 if (kacsayi==2) {
                     System.out.println("a :");
                     int a=input.nextInt();
                     System.out.println("b :");
                     int b=input.nextInt();
                     System.out.println("girilen sayıların toplamları :"+toplama(a,b));
                     input.nextLine();
                     
                 }
                 else if (kacsayi==3) {
                      System.out.println("a :");
                     int a=input.nextInt();
                     System.out.println("b :");
                     int b=input.nextInt();
                     System.out.println("c :");
                     int c=input.nextInt();
                     System.out.println("girilen sayıların toplamları :"+toplama(a,b,c));
                     input.nextLine();
                     
                     
                 }
                 else{
                     System.out.println("bunun için işlem bulunamuyor...");
                 }
             }
             else if (işlem.equals("2")) {
                     System.out.println("a :");
                     int a=input.nextInt();
                     System.out.println("b :");
                     int b=input.nextInt();
                     input.nextLine();
                     System.out.println("girilen sayıların farkları"+çıkarma(a,b));
             }
             else if (işlem.equals("3")) {
                 System.out.println("kaç değer çarpacaksınız");
                 int kacsayi=input.nextInt();
                 if (kacsayi==2) {
                     System.out.println("a :");
                     int a=input.nextInt();
                     System.out.println("b :");
                     int b=input.nextInt();
                     System.out.println("girilen sayıların çarpımı :"+çarpma(a,b));
                     input.nextLine();
                    
                 }
                 else if (kacsayi==3) {
                      System.out.println("a :");
                     int a=input.nextInt();
                     System.out.println("b :");
                     int b=input.nextInt();
                     System.out.println("c :");
                     int c=input.nextInt();
                     System.out.println("girilen sayıların çarpımı :"+çarpma(a,b,c));
                     input.nextLine();
                     
                     
                 }
                 else{
                     System.out.println("bunun için işlem bulunamuyor...");
                 }
                 
             }
             else if (işlem.equals("4")) {
                     System.out.println("a :");
                     int a=input.nextInt();
                     System.out.println("b :");
                     int b=input.nextInt();
                     input.nextLine();
                     System.out.println("girilen sayıların bölümü :"+bölme(a,b));
             }
             else{
                 System.out.println("geçersiz işlem");
             }
         }
        
    }
    
    
}
