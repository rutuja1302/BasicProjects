//Fortune cookie teller

import java.util.Random;

public class Cookie{
  public static void main(String [] args){
    System.out.println("<===Fortune Cookies===> \n");
    System.out.println("Your fortune cookie says: \n ");
    String[] fortune = {"Enjoy each day","Cherish your family","Always stay positive","Bring sunshine to others","Enjoy little things!","Strive for sucess","Always work hard","Good things are coming","Honesty is the greatest asset","Do what you love","Never Quit!","Do big!","Live your dream","Faith will get you everywhere","A journey of a thousand miles begins with a single step!","You are the best","Happiness is an activity","If you feel you are right, stand firmly by your convitions","It's now or never!"};
    
    Random obj = new Random();
    int myNum = obj.nextInt(fortune.length)+1;
    
    System.out.println(fortune[myNum]);
  }
}
