package west_2;

public interface Shop 
{
	Ingredient addIng(Ingredient ing); 		   																		//�������
	MilkTea sell(String milkteaName,String ingName) 	throws IngredientTypeException,SoldOutException;			//�����̲�
}
