import java.util.*;
public class YamadaMain{
	public static void main(String[] args){
		/*
		 *手を入力（グー：0，チョキ：1，パー：2）>>1
　　　あなたのはチョキ、PCはパー
　　　あなたの勝ちです。(負け、あいこ)
		 *
		 */
		System.out.print("手を入力>>");
		int you = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(3);
		String youj;
		String pcj;
		if(you == 0){
			youj = "グー";
		}
		else if(you == 1){
			youj = "チョキ";
		}
		else{
			youj = "パー";
		}
		if(pc == 0){
			pcj = "グー";
		}
		else if(pc == 1){
			pcj = "チョキ";
		}
		else{
			pcj = "パー";
		}
		if((you == 0 && pc == 1) || (you == 1 && pc == 2) || (you == 2 && pc == 0)){
			System.out.println("あなたは" + youj + "、PCは" + pcj );
			System.out.println("あなたの勝ちです。");
		}
		else if((you == 0 && pc == 2) || (you == 1 && pc == 0) || (you == 2 && pc == 1)){
			System.out.println("あなたは" + youj + "、PCは" + pcj );
			System.out.println("あなたの負けです。");
		}
		else{
			System.out.println("あなたは" + youj + "、PCは" + pcj );
			System.out.println("あいこです。");
		}
	}
}
