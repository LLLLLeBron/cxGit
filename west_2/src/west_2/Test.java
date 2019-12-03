package west_2;

public class Test
{
	public static void main(String[] args)
	{
		TeaShop teashop=new TeaShop();
		//����
		for(int cnt=0;cnt<10;cnt++)					//����25�����飬����2��Ҭ��
		{
			teashop.addIng(Bubble.newBubble(2019, 11, 26, 13, 39, 55));
			teashop.addIng(Bubble.newBubble(2019, 11, 29, 23, 40,12));
		}
		for(int cnt=0;cnt<5;cnt++)
		{
			teashop.addIng(Bubble.newBubble()); 
		}
		teashop.addIng(Coconut.newCoconut(2019, 11, 30, 13, 39, 55));
		teashop.addIng(Coconut.newCoconut());
		System.out.printf("�����ɹ�!!!\n");
		try
		{
			teashop.sell("love", "Bubble");    			//����һ����Ϊlove�������̲�
			teashop.sell("hate", "Coconut");			//����һ����Ϊhate��Ҭ���̲�
			teashop.sell("happiness","Coconut");		//����һ����Ϊhappiness��Ҭ���̲�
			teashop.sell("fear", "Coconut");			//����һ����Ϊfear��Ҭ���̲�
		}
		catch(IngredientTypeException |SoldOutException SOE)
		{
			System.out.print(SOE.getMessage());
		}
		try
		{
			teashop.sell("peace", "Bubbel");    			//�����һ����Ϊpeace�������̲�,���ǰ���������˵����
		}
		catch(IngredientTypeException |SoldOutException SOE)
		{
			System.out.print(SOE.getMessage());
		}
		
		
		//����toString ����
		System.out.printf("\n��ʼ����toString����:\n");
		Ingredient ing1=Bubble.newBubble();
		Ingredient ing2=Coconut.newCoconut();
		System.out.println(ing1.toString());
		System.out.println(ing2.toString());
		
		MilkTea milktea1=new MilkTea("xixixi",ing1);
		MilkTea milktea2=new MilkTea("lalala",ing2);
		System.out.println(milktea1.toString());
		System.out.println(milktea2.toString());
	}
}
