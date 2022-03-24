import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		/*
		 *手を入力(グー:0, チョキ:1, パー:2)>>1
		 あなたはチョキ、PCはパー
		 あなたの勝ちです。（負け,あいこ）
		 */
		System.out.println("手を入力: グー:0, チョキ:1, パー:2");
		int hand = new Scanner(System.in).nextInt();
		int n = new Random().nextInt(3);
		if(hand==0 && n==1){
			System.out.println("あなたはグー、PCはチョキ");
			System.out.println("勝ち");
		}else if((hand==0)&&(n==2)){
			System.out.println("あなたはグー、PCはパー");
			System.out.println("負け");
		}else if((hand==0)&&(n==0)){
			System.out.println("あなたはグー、PCはグー");
			System.out.println("あいこ");
		}else if((hand==1)&&(n==0)){
			System.out.println("あなたはチョキ、PCはグー");
			System.out.println("負け");
		}else if((hand==1)&&(n==1)){
			System.out.println("あなたはチョキ、PCはチョキ");
			System.out.println("あいこ");
		}else if((hand==1)&&(n==2)){
			System.out.println("あなたはチョキ、PCはパー");
			System.out.println("勝ち");
		}else if((hand==2)&&(n==0)){
			System.out.println("あなたはパー、PCはグー");
			System.out.println("勝ち");
		}else if((hand==2)&&(n==1)){
			System.out.println("あなたはパー、PCはチョキ");
			System.out.println("負け");
		}else if((hand==2)&&(n==2)){
			System.out.println("あなたはパー、PCはパー");
			System.out.println("あいこ");
		}

		



	}
}
		




