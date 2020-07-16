/*Decryption program will accept a coded message as an input
  It will decrypt the code by replacing special characters with letters
  In this program we will use switch statement to our decrypt coded message*/
import java.util.Scanner;
public class Decrypt{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your code: ");
    String msg = scan.nextLine();
    char[] copymsg = msg.toCharArray();
    for(int i=0; i<copymsg.length; i++){
      switch(copymsg[i]){
        case '+':
          copymsg[i] = 'a';
          break;
        case '-':
          copymsg[i] = 'b';
          break;
        case '*':
          copymsg[i] = 'c';
          break;
        case '/':
          copymsg[i] = 'd';
          break;
        case '\'':
          copymsg[i] = 'e';
          break;
        case '\"':
          copymsg[i] = 'f';
          break;
        case ')':
          copymsg[i] = 'g';
          break;
        case '[':
          copymsg[i] = 'h';
          break;
        case '{':
          copymsg[i] = 'i';
          break;
        case ':':
          copymsg[i] = 'j';
          break;
        case '#':
          copymsg[i] = 'k';
          break;
        case '?':
          copymsg[i] = 'l';
          break;
        case '%':
          copymsg[i] = 'm';
          break;
        case '}':
          copymsg[i] = 'n';
          break;
        case '$':
          copymsg[i] = 'o';
          break;
        case '<':
          copymsg[i] = 'p';
          break;
        case '~':
          copymsg[i] = 'q';
          break;
        case ';':
          copymsg[i] = 'r';
          break;
        case '&':
          copymsg[i] = 's';
          break;
        case '|':
          copymsg[i] = 't';
          break;
        case '€':
          copymsg[i] = 'u';
          break;
        case '¥':
          copymsg[i] = 'v';
          break;
        case '(':
          copymsg[i] = 'w';
          break;
        case '¿':
          copymsg[i] = 'x';
          break;
        case '>':
          copymsg[i] = 'y';
          break;
        case ']':
          copymsg[i] = 'z';
          break;
        default:
        copymsg[i] = ' ';  //for spaces between words
      }
    }
    System.out.println("YOUR DECRYPTED MESSAGE IS: ");
    System.out.println(copymsg);
  }
}
