import java.util.Scanner;
/**
  *����� ��� ������� ������������. ������������ ���� ������������.
  */

public class InteractRunner {
	public static void main(String[] args){						
		InteractRunner runner = new InteractRunner();
		runner.go();
	}
	public  Scanner reader = new Scanner(System.in);
	/**
	  *�������� ���������� (add/div/sub/mul).
	  */
	public  String operation = null;
	public  Calculator calc = new Calculator();
	/**
	  *������� ��� ��� �� ��������� y/n.
	  */
	public  String exit = "n";
	/**
	  *���������� ��������� ��� ��� y/n.
	  */
	public  String cleanResult = "";
	/**
	  *������ ��������.
	  */
	public  String first = null;
	/**
	  *������ ��������.
	  */
	public  String second = null;
	
	/**
	  *������
	  */
	public void go(){
	try{														
		while(!exit.equals("y")){
			chooseOperation();
			enterParams();
				
			if (operation != null && operation.equals("add")){
				calc.add(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}
			if (operation != null && operation.equals("sub")){
				calc.sub(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}
			if (operation != null && operation.equals("div")){
				calc.div(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}
			if (operation != null && operation.equals("mul")){
				calc.mul(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}		
			if (operation != null && operation.equals("inv")){
				calc.inv(Double.valueOf(first), Integer.valueOf(second));
				report();
				setExit();
			}	
		}		
		}finally{
			reader.close();
		}
	}
	/**
	  * ����� ��������
	  */
	public  void chooseOperation(){
		System.out.println("Choose your operation: " + "add/div/sub/mul/inv");
			operation = reader.next();
			while (!operation.equals("add") && !operation.equals("div") && !operation.equals("sub") && !operation.equals("mul") && !operation.equals("inv")){
				System.out.println("You should write: " + "add/div/sub/mul/inv");
				operation = reader.next();
			}
	}
	/**
	  * ���� ����������
	  */
	public  void enterParams(){
		System.out.println("Enter first arg: ");
		first = reader.next();
        
		while (first.matches("\\D")){
		System.out.println("You should enter a number!");
		first = reader.next();
		}
		System.out.println("Enter second arg: ");
		second = reader.next();
		while (second.matches("\\D")){
		System.out.println("You should enter a number!");
		second = reader.next();
		}
	}
	/**
	  *����� ���������� � ������ �� �������� ����������
	  */
	public  void report(){
		System.out.println("Result: " + calc.getResult());	
	}
	/**
	  * ���������� ���������
	  */
	public void setClean(){
		System.out.println("clean result: " + "y/n");
		cleanResult = reader.next();
			if(!cleanResult.equals("y") && !cleanResult.equals("n")){
				while(!cleanResult.equals("y") && !cleanResult.equals("n")){
						System.out.println("clean result: " + "y/n");
						cleanResult = reader.next();
				}
			}
			if (cleanResult.equals("y")){
				calc.cleanResult();							
			}
	}
	/**
	  * ���������� �����
	  */
	public void setExit(){
			System.out.println("Exit: y/n");
			exit = reader.next();
			while (!"y".equals(exit) && !"n".equals(exit)){
				System.out.println("You should enter y or n");
				exit = reader.next();
			}
	}

}

