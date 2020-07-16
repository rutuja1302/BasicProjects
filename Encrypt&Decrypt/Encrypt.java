/*Encryption program will accept a message as an input
  It will encrypt the message by replacing letters with speacial characters
  In this program we will use switch statement to our encrypt message*/
import java.util.Scanner;
public class Encrypt{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your message: ");
    String msg = scan.nextLine().toLowerCase();
    char[] copymsg = msg.toCharArray();
    for(int i=0; i<copymsg.length; i++){
      switch(copymsg[i]){
        case 'a':
          copymsg[i] = '+';
          break;
        case 'b':
          copymsg[i] = '-';
          break;
        case 'c':
          copymsg[i] = '*';
          break;
        case 'd':
          copymsg[i] = '/';
          break;
        case 'e':
          copymsg[i] = '\'';
          break;
        case 'f':
          copymsg[i] = '\"';
          break;
        case 'g':
          copymsg[i] = ')';
          break;
        case 'h':
          copymsg[i] = '[';
          break;
        case 'i':
          copymsg[i] = '{';
          break;
        case 'j':
          copymsg[i] = ':';
          break;
        case 'k':
          copymsg[i] = '#';
          break;
        case 'l':
          copymsg[i] = '?';
          break;
        case 'm':
          copymsg[i] = '%';
          break;
        case 'n':
          copymsg[i] = '}';
          break;
        case 'o':
          copymsg[i] = '$';
          break;
        case 'p':
          copymsg[i] = '<';
          break;
        case 'q':
          copymsg[i] = '~';
          break;
        case 'r':
          copymsg[i] = ';';
          break;
        case 's':
          copymsg[i] = '&';
          break;
        case 't':
          copymsg[i] = '|';
          break;
        case 'u':
          copymsg[i] = '€';
          break;
        case 'v':
          copymsg[i] = '¥';
          break;
        case 'w':
          copymsg[i] = '(';
          break;
        case 'x':
          copymsg[i] = '¿';
          break;
        case 'y':
          copymsg[i] = '>';
          break;
        case 'z':
          copymsg[i] = ']';
          break;
        default:
        copymsg[i] = ' ';  //for spaces between words
      }
    }
    System.out.println("YOUR ENCRYPTED MESSAGE IS: ");
    System.out.println(copymsg);
  }
}
