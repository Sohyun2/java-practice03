package prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		List<Goods> goods = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<COUNT_GOODS; i++) {
			Goods tmpGoods = new Goods();
			
			String line = sc.nextLine();
			String[] tokens = line.split(" ");
			
			tmpGoods.setName(tokens[0]);
			tmpGoods.setPrice(Integer.parseInt(tokens[1]));
			tmpGoods.setStock(Integer.parseInt(tokens[2]));
			
			goods.add(tmpGoods);
		}
		
		for(int i=0; i<goods.size(); i++) {
			System.out.println(goods.get(i).getName()+"(가격 : " + goods.get(i).getPrice() + "원) 이 " 
							+ goods.get(i).getStock()+ "개 입고되었습니다.");
		}
	}
}
