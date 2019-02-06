/**
 *��������� ����� �����������
 */
public class Calculator{
	/**
	*��������� ����������
	*/
	private double result;
	/**
	*��������� ���������.
	*@param first ������ ���������.
	*@param second ������ ���������.
	*/
	public void add(double first, double second){
		double summ = first + second;
		this.result += summ;
	}
	/**
	*�������� ���������.
	*@param first �����������.
	*@param second ����������.
	*/
	public void sub(double first, double second){	
		double sub = first - second;
		if (this.result == 0){
			this.result = sub;
		}else{
			this.result /= sub;
		}		
	}
	
	/**
	*�������� ���������.
	*@param first ������ ���������.
	*@param second ������ ���������.
	*/
	public void mul(double first, double second){
		double mul = first * second;
		if (this.result == 0){
			this.result = mul;
		}else{
			this.result *= mul;
		}
	}
	/**
	*����� ���������.
	*@param �������.
	*@param ��������.
	*/
	public void div(double first, double second){
		double div = first / second;
		if (this.result == 0){
			this.result = div;
		}else{
			this.result /= div;
		}		
	}
	/**
	*���������� � �������.
	*@param first ��������� �������.
	*@param second ���������� �������. ������ �����������.
	*/
	public void inv(double first, int second){
		double inv = first;
		if (second == 0){
			inv = 1;
		}
		if(second >= 2){
			for (int i = 1; i < second; i++){
				inv = inv * first;
			}
		}
		this.result = inv;
	}
	/**
	*�������� ���������.
	*@return ��������� ����������.
	*/
	public double getResult(){
		return this.result;
	}
	/**
	*�������� ��������� ����������
	*/
	public void cleanResult(){
		this.result = 0;
	}
}
	
	
	
