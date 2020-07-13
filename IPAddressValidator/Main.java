/*IPv4 address is a 32 bit address separated by a dot "."
  Example : 132.105.43.44 -> each digit should be in the range of 0 to 255
  IPv6 address is a 128 bit address separated by a colon ":"
  Example : 1200:0db8:53a4:82e7:0000:0124:3770:7334 -> each part is a hexadecimal number ranging from 0000 to FFFF
  To validate IP address java donot have any inbuilt class,
  So we will import InetAddressValidator class and it will validate the given address */

import java.util.Scanner;
import org.apache.commons.validator.routines.InetAddressValidator;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    InetAddressValidator validator = InetAddressValidator.getInstance();
    System.out.println("IP ADDRESS VALIDATOR");
    System.out.print("Press 4 to validate IPv4 address or Press 6 to validate IPv6 address");
    int choice = scan.nextInt();
    if(choice == 4){
      System.out.print("Enter an address: ");
      String ipv4 = scan.nextLine();
      if(validator.isValidInet4Address(ipv4)){
        System.out.println("IP Address " +ipv4+ " is a valid address");
      }else{
        System.out.println("IP Address " +ipv4+ " is a invalid address");
      }
    }else if(choice == 6){
      System.out.print("Enter an address: ");
      String ipv6 = scan.nextLine();
      if(validator.isValidInet6Address(ipv6)){
        System.out.println("IP Address " +ipv6+ " is a valid address");
      }else{
        System.out.println("IP Address " +ipv6+ " is a invalid address");
      }
    }
  }
}
