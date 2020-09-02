import java.util.*;

class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        int res = b.score - a.score;
        if(res==0){
            return a.name.compareTo(b.name);
        }else{
            return res;
        }
    }
}
