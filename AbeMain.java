import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		/*
		 *手を入力(グー: 0, チョキ: 1, パー: 2)>>1
		 あなたはチョキ、PCはパー
		 あなたの勝ちです。(負け, あいこ)
		 *
		 */
		System.out.println(
		 "手を入力(グー: 0, チョキ: 1, パー: 2)>>");
		int n = new Scanner(System.in).nextInt(); 
		int pc = new Random().nextInt(3);

		if(n == 0){
			System.out.print("あなたはグー、");
		}else{
			if(n== 1){
			System.out.print("あなたはチョキ、");
			}else{
			System.out.print("あなたはパー、");
			}
		}
		
		if(pc == 0){
			System.out.println("PCはグー");
		}else{
			if(pc == 1){
			System.out.println("PCはチョキ");
			}else{
			System.out.println("PCはパー");
			}
		}
		
		if((n == 0 && pc == 1) || (n == 1 && pc == 2) || (n == 2 && pc ==0)){
			System.out.println("あなたの勝ちです。");
		}else{
			if(n == pc){
			System.out.println("あいこです。");
			}else{
			System.out.println("あなたの負けです。");
			}
		}

	}
}
