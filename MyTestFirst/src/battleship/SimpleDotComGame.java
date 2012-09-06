package battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author numa
 *HeadFirstJavaに載ってたバトルシッププログラムです
 *
 */
public class SimpleDotComGame {

	public static void main(String[] args) {

		SimpleDotCom dot1 = new SimpleDotCom();

//		for(int i:dot1.getLocationCells()){
//			System.out.println(i);
//		}

		boolean flg = true;

		//軍艦が沈むまで同じ処理を繰り返す
		while(flg) {
			String s;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			try {
				s = br.readLine();
				System.out.println("you typed ... "+ s);

				if(s.equals("exit")){
					System.out.println("ok");
					flg = false;
				}

				String userGuess = s;
				String buttleResult = dot1.checkYourself(userGuess);
				System.out.println(buttleResult);

				if(buttleResult.equals("kill")){
					System.out.println("you win" + " you typed " + dot1.getNumOfHits() + " times");
					flg = false;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
