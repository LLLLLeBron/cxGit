package west_2;
import java.util.*;

public class MilkTea 
{
	private String name;			//�̲������
	private Ingredient ing;			//����
	
	
//���캯��	
	public MilkTea(String name,Ingredient ing)		
	{
		this.name=name;
		this.ing=ing;
	}
	
	
//get����
	public String getName()
	{
		return name;
	}
	
	public Ingredient getIng()
	{
		return ing;
	}
	
	
//set����
	public String setName(String name)
	{
		this.name=name;
		return name;
	}
	
	public Ingredient setBurden(Ingredient ing)
	{
		this.ing=ing;
		return ing;
	}
	
	
//��дtoString	
	public String toString()
	{
		return "[name]:"+"{"+name+"}"+" [ing]:"+"{"+ing.toString()+"}";
	}

//�������
	public void Print()
	{
		Calendar time=Calendar.getInstance();
		System.out.printf("�̲���:%s ����:%s ��������:%s.%s.%s %s:%s:%s\n",name,ing.getName(),time.get(Calendar.YEAR),time.get(Calendar.MONTH)
		,time.get(Calendar.DAY_OF_MONTH),time.get(Calendar.HOUR_OF_DAY),time.get(Calendar.MINUTE),time.get(Calendar.SECOND));
	}
}
