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

		boolean flg = true;

		//軍艦が沈むまで同じ処理を繰り返す
		while(flg) {

			String userTyped;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			try {
				userTyped = br.readLine();

				if(userTyped.length()==0) {
					System.out.println("終了します");
					break;
				}

				System.out.println("you typed ... "+ userTyped);

				String userGuess = userTyped;
				String buttleResult = dot1.checkYourself(userGuess);
				System.out.println(buttleResult);

				if(buttleResult.equals("kill")){
					//System.out.println("you win" + " you typed " + dot1.getNumOfHits() + " times");
					flg = false;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
