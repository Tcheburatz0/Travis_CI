/**
  * ����������� ����� ��������� ��������
  * @auhtor alexey
  * &since 16.07.2015
  */
  public abstract class Pet{
/**
  * ��� ���������
  */
	protected  String name;
	
	public Pet(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
  
  }