package west_2;
import java.util.*;

public class Coconut extends Ingredient
{
//Coconut�����ڶ�Ӧ�ĺ�����
	public static final long saveTimeMillisecond=432000000;
	
//���캯��
	public Coconut(Calendar time)			
	{
		super("Coconut",time,5);
	}
	
//Ĭ�Ϲ��캯��
	public Coconut()
	{
		super();
	}
	
//��дtoString	
	public String toString()				
	{
		return "[name]:{Coconut}"+" [time]:"+"{"+time.get(Calendar.YEAR)+"."+time.get(Calendar.MONTH)+"."
		+time.get(Calendar.DAY_OF_MONTH)+" "+time.get(Calendar.HOUR_OF_DAY)+":"+time.get(Calendar.MINUTE)+":"+time.get(Calendar.SECOND)+"}  [saveTime]:"+"{5}";
	}

//get����
	public String getName()
	{
		return name;
	}
	
	public Calendar getTime()
	{
		return time;
	}
	
	public int getSaveTime()
	{
		return saveTime;
	}
	
//�������
	public void Print()
	{	
		//���������Ϣ���������ڡ������ڣ�
		System.out.printf("Coconut:��������:%s.%s.%s %s:%s:%s   ������:%d��\n",time.get(Calendar.YEAR),time.get(Calendar.MONTH)
		,time.get(Calendar.DAY_OF_MONTH),time.get(Calendar.HOUR_OF_DAY),time.get(Calendar.MINUTE),time.get(Calendar.SECOND),saveTime); //���������Ϣ
	}

//���󹤳�
	public static Coconut newCoconut(int year,int month,int day,int hour,int minute,int second)			//���趨ʱ������
	{
		Calendar cal=Calendar.getInstance();
		cal.set(year, month, day, hour, minute,second);
		return new Coconut(cal);
	}
	
	public static Coconut newCoconut()                                                       	//��ϵͳʱ������
	{
		Calendar cal=Calendar.getInstance();
		return new Coconut(cal);
	}
}
