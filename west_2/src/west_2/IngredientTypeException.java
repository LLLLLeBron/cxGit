package west_2;

public class IngredientTypeException extends Exception  //�������ʹ���
{
	private static final long serialVersionUID = 1L;
	private String message;				//������Ϣ
	
//���캯��
	public IngredientTypeException(String message)
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
