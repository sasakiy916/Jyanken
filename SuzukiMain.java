import java.util.*;
public class SuzukiMain{
	public static void main(String[] args){
		/*
		 *
		 * 手を入力(グー:0,チョキ:1,パー:2)>>1
		 * あなたはチョキ、PCはパー
		 * あなたの勝ちです。(負け、あいこ)
		 */
		System.out.print("手を入力");
		int myHand = new Scanner(System.in).nextInt();
		int pc =new Random().nextInt(3);	
		if(myHand==0){
			if(pc==0){
				System.out.println("あいこです");
			}
			else if(pc==1){
				System.out.println("かちです");
			}else{
				System.out.println("まけです");
			}

		}else if(myHand==1){
			if(pc==0){
				System.out.println("まけです");
			}else if(pc==1){
				System.out.println("あいこです");
			}else{
				System.out.println("かちです");
			}


		}else{
			if(pc==0){
				System.out.println("かちです");
			}else if(pc==1){
				System.out.println("まけです");
			}else{
				System.out.println("あいこです");
			}
		}
	}
}	
