package solve_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("돈의 액수를 입력하세요>>");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		//돈 단위
		int [] money = {50000,10000,5000,1000,500,100,50,10,1};
		int [] count = new int[money.length];
		String [] moneyName = {"오만원","만원","오천원","천원","오백원","백원","오십원","십원","일원"};
		//돈 액수 입력
		int inputMoney = Integer.parseInt(st.nextToken());
		//나머지 값 저장 변수
		int result = inputMoney;
		
		for(int i=0;i<money.length;i++)
		{
			count[i] = result / money[i];
			result = result % money[i];
		}
		
		for(int i = 0; i<money.length;i++) {
			if(i==money.length-1)
				System.out.printf("%s%d개",moneyName[i],count[i]);
			else
				System.out.printf("%s%d개, ",moneyName[i],count[i]);
		}

	}

}
