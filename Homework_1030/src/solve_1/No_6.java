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
		br.close();
		
		//돈 단위
		int [] money = {50000,10000,5000,1000,500,100,50,10,1};
		String [] moneyName = {"오만원","만원","오천원","천원","오백원","백원","오십원","십원","일원"};
		int count = 0;

		//돈 액수 입력
		int inputMoney = Integer.parseInt(st.nextToken());
		//나머지 값 저장 변수
		
		for(int i=0;i<money.length;i++)
		{
			count = inputMoney / money[i];
			inputMoney = inputMoney % money[i];
			System.out.printf("%s%d개 ",moneyName[i],count);
		}
	}

}
