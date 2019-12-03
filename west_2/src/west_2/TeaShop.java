package west_2;
import java.util.*;

public class TeaShop implements Shop 
{
	private ArrayList<Ingredient> bubble;
	private ArrayList<Ingredient> coconut;

//���캯��
	public TeaShop()
	{
		bubble=new ArrayList<Ingredient>();
		coconut=new ArrayList<Ingredient>();
	}
	
//ʵ��Shop�ӿ��е�addIng����
	public Ingredient addIng(Ingredient ing)
	{
		//�ж���������
		if(ing instanceof Bubble)
			bubble.add(ing);
		else if(ing instanceof Coconut)
			coconut.add(ing);
		return ing;
	}
	
//ʵ��Shop�ӿ��е�sell����  
	public MilkTea sell(String milkteaName,String ingName) throws IngredientTypeException,SoldOutException
	{
		ArrayList<Ingredient> ing;
		MilkTea mt;
		long saveTime;
		//�ж���������
		if(ingName.equals("Bubble"))
		{
			ing=bubble;									//ѡ����Ҫȡ���������ڵ������б�
			saveTime=Bubble.saveTimeMillisecond;		//ѡ�����϶�Ӧ�ı�����
		}
		else if(ingName.equals("Coconut"))
		{
			ing=coconut;								//ѡ����Ҫȡ���������ڵ������б�
			saveTime=Coconut.saveTimeMillisecond;		//ѡ�����϶�Ӧ�ı�����
		}
		else
		{
			throw new IngredientTypeException("�������ʹ���!!!\n");
		}
		mt=fitOut(milkteaName,ing,saveTime);		//����װ�亯��װ���̲�
		System.out.printf("���۳ɹ�!!!\n");
		mt.Print();			//����̲����Ϣ
		return mt;
	}

//װ���̲�
	public MilkTea fitOut(String milkteaName,ArrayList<Ingredient> ing,long saveTime)   throws SoldOutException
	{
		//�����̲�������Ҫȡ���������ڵ������б����϶�Ӧ�ı�����
		Ingredient Ing;
		Calendar time=Calendar.getInstance();
		if(ing.isEmpty())
			throw new SoldOutException("����������!!!\n");
		while(ing.size()!=0)
		{
			Ing=ing.get(0);
			long t=time.getTimeInMillis()-Ing.getTime().getTimeInMillis();
			if(t>saveTime)			//���ڴ���
			{
				ing.remove(0);
			}
			else
			{
				break;
			}
		}
		Ing=ing.get(0);								//ȡ������
		ing.remove(0);								//�����ϴ��б����Ƴ�
		return new MilkTea(milkteaName,Ing);		//������õ��̲�
	}
}
	
	
	
	
	
 