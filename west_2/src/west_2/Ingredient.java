package west_2;
import java.util.*;

public abstract class Ingredient 
{
	protected String name;			//������
	protected Calendar time;     	//��������
	protected int saveTime;			//�����ڣ��죩
	
//���캯��	
	public Ingredient(String name,Calendar time,int saveTime)	
	{
		this.name=name;
		this.time=time;
		this.saveTime=saveTime;
	}

//Ĭ�Ϲ��캯��
	public Ingredient()
	{
		
	}
	
//���󷽷�	
	public abstract String toString();
	//get����
	public abstract String getName();
	public abstract Calendar getTime();
	public abstract int getSaveTime();
	
	public abstract void Print();		//���������Ϣ���������ڡ������ڣ�	
}
