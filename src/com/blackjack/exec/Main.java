package com.blackjack.exec;

import java.util.Scanner;

import com.blackjack.service.CardService;
import com.blackjack.service.RuleService;

public class Main {
	public static void main(String[] args) {
		CardService cService = new CardService();
		RuleService rService = new RuleService();
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			flag = rService.stratGame();
			flag = rService.dealTurn();
			flag = rService.userTurn();
		}
//		rService.stratGame();
//		rService.dealTurn();
//		rService.userTurn();
//		rService.socreCompare();


		rService.stratGame();
		
//		String text = "";
//		while(true) {
//			cService.printCard();
//			System.out.println("카드를 뽑으시겠습니까? (player/뽑는다)");
//			System.out.print(">>>");
//			text = scan.nextLine();
//			if(text.equals("유저/뽑는다")) {
//				cService.addCard("user");
//			}else if(text.equals("딜러/뽑는다")) {
//				cService.addCard("deal");
//			}else{
//				continue;
//			}
//		}
	}
>>>>>>> cc8cca8ca8353ecb1484d46db47fdc3b56fc670f

}
}