package west_2;

public class SoldOutException  extends Exception	//�����ۿ�
{
	private static final long serialVersionUID = 1L;
	private String message;				//������Ϣ
	
//���캯��
	public SoldOutException(String message)
	{
		super(message);
		this.message=message;
	}
		
//����쳣����
	public void ExceptionOutput()
	{
		System.out.print(message);
	}
	
//get����
	public String getMessage()
	{
		return message;
	}
}
