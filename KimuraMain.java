import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		/*
		 *手を入力(グー;0、チョキ;1、パー:2)>>1
		 あなたはチョキ、PCは、パー
		 あなたの勝ちです。
		 * */
		System.out.print("手を入力(グー:0、チョキ:1、パー:2)>>");
		int your_choice = new Scanner(System.in).nextInt();
		int pc_choice = new Random().nextInt(3);
		int winner_judge;
		String your_choice_name;
		String pc_choice_name;

		if(your_choice == 0){

			your_choice_name = "グー";
			if(pc_choice == 0){
				pc_choice_name = "グー";	
				winner_judge = 1;	
			}else if(pc_choice == 1){
				winner_judge = 0;
				pc_choice_name = "チョキ";	
			}else{
				winner_judge = 2;
				pc_choice_name = "パー";	
			}
		}else if(your_choice == 1){
			your_choice_name = "チョキ";
			if(pc_choice == 0){
				winner_judge = 2;	
				pc_choice_name = "グー";	
			}else if(pc_choice == 1){
				winner_judge = 1;
				pc_choice_name = "チョキ";	
			}else{
				winner_judge = 0;
				pc_choice_name = "パー";	
			}
		}else if(your_choice == 2){
			
			your_choice_name = "パー";
			if(pc_choice == 0){
				winner_judge = 0;	
				pc_choice_name = "グー";	
			}else if(pc_choice == 1){
				winner_judge = 2;
				pc_choice_name = "チョキ";	
			}else{
				winner_judge = 1;
				pc_choice_name = "パー";	
			}
		}else{
			winner_judge = 4;
			your_choice_name ="nothing";
			pc_choice_name ="nothing";
			System.out.println("グー、チョキ、パー以外の手だから反則負けです。");
		}

		if(winner_judge <4){	
			System.out.println("あなたは " + your_choice_name + "、PCは " + pc_choice_name);
		}

		if(winner_judge == 0){
			System.out.println("あなたの勝ちです。");
		}else if(winner_judge ==1){
			System.out.println("あいこです。");
		}else if(winner_judge == 2){
			System.out.println("あなたの負けです。");
		}
	}
}
