package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice(){
		  
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう"); 
		 
		  String rock = "r";
		  String scissors = "s";
		  String paper = "p";
		  boolean inputCheck;
		 
	      Scanner scanner = new Scanner(System.in);
	      String myHand= scanner.next();
	      inputCheck = myHand.equals(rock) || myHand.equals(scissors) || myHand.equals(paper);
	      inputCheck = !inputCheck;

	      while (inputCheck) {
	  		System.out.println("入力値が「r・s・p」ではありません。再度入力してください");
		    myHand= scanner.next();
            inputCheck = myHand.equals(rock) || myHand.equals(scissors) || myHand.equals(paper);
	      }
	      
	      scanner.close();
	      
	      return myHand;
	  }

	public String getRandom() {
		String[] handList = {"r","s","p"};
		return handList[(int) Math.floor(Math.random() * 3)];
	}

	public void playGame(String myHand,String oppHand){
		HashMap<String,String> jyankenMap = new HashMap<>();
		  jyankenMap.put("r", "グー");
		  jyankenMap.put("s", "チョキ");
		  jyankenMap.put("p", "パー");
		
		System.out.println("自分の手は" + jyankenMap.get(myHand) + ", 対戦相手の手は" + jyankenMap.get(oppHand));

		switch(myHand + oppHand) {
        case "rr":
        	System.out.println("あいこです");
        	break;
        case "rs":
        	System.out.println("自分の勝ちです");
        	break;
        case "rp":
        	System.out.println("自分の負けです");
        	break;
        case "sr":
        	System.out.println("自分の負けです");
        	break;
        case "ss":
        	System.out.println("あいこです");
        	break;
        case "sp":
           	System.out.println("自分の勝ちです");
        	break;
        case "pr":
           	System.out.println("自分の勝ちです");
        	break;
        case "ps":
        	System.out.println("自分の負けです");
        	break;
        case "pp":
        	System.out.println("あいこです");
        	break;
        default:
        	System.out.println("意図しない結果です");
        	break;
        }
		
	}

}
