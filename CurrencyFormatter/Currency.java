/* This program will convert a number into
   US, Indian, Chinese, Italian and french currency
   Indian currency doesn't have any inbuild locale
   So, we will create one using Locale class */

import java.util.Scanner;
import java.text.*;
public class Currency{
public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a number: ");
  double payment = scanner.nextDouble();
  //US currency
  NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
  String us = u.format(payment);

  //Chinese currency
  NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
  String china = c.format(payment);

  //Italian currency
  NumberFormat it = NumberFormat.getCurrencyInstance(Locale.ITALY);
  String italy = it.format(payment);

  //French currency
  NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
  String france = f.format(payment);

  //Indian currency
  Locale locale = new Locale("en" ,"in");
  NumberFormat in = NumberFormat.getCurrencyInstance(Locale);
  String india = in.format(payment);
                                          //if i/p is 12345.13
  System.out.println("US: " +us);         //outputs  US: $12,345.12
  System.out.println("India: " +india);   //outputs India: Rs.12345,12
  System.out.println("China: " +china);   //outputs China: ¥12,345.13
  System.out.println("Italy: " +italy);   //outputs Italy: £12,345,12
  System.out.println("France: " +france); //outputs France: 12 345,12€
 }
}
