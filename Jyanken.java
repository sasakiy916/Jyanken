import java.util.*;
public class Jyanken{
	public static void main(String[] args){
		System.out.print("手を入力(グー;0,チョキ;1,パー;2)>>");
		int my = new Scanner(System.in).nextInt();
		String myHand;
		if(my == 0){
			myHand = "グー";
		}else if(my == 1){
			myHand = "チョキ";
		}else{
			myHand = "パー";
		}
		int pc = new Random().nextInt(3);
		String pcHand;
		if(pc == 0){
			pcHand = "グー";
		}else if(pc == 1){
			pcHand = "チョキ";
		}else{
			pcHand = "パー";
		}
		
		System.out.println("あなたは"+myHand+"、PCは"+pcHand);
		int diff = (my + 3 -pc) % 3;
		if(my == pc){
			System.out.println("あいこです");
		}else if(diff == 2){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
	}
}
