
/**
  * ����� ��������� �������
  * @auhtor alexey
  * &since 16.07.2015
  */
  public class Clinic{
	/**
	  * ������ ��������
	  */
	private final Client[] clients;
	
	public Clinic (final int size){
		this.clients = new Client[size];
	}
	
	public void createClient(){
		
	}
	/**
	  * �������� �������
	  * @param �������
	  * &param ������
	  */
	  public void addClient(final int position, final Client client){
		while (clients[position] != null){
			System.out.println("Position " + position + " is already exist. Please, enter other position");
		}
		this.clients[position] = client;
	  }
	/**
	  * ������� ������� �� id
	  * @param �������
	  */
	  public void removeClientById(final int position){
		clients[position] = null;
	  }
	/**
	  * ������� ������� �� �����
	  * @param �������
	  */
	  public void removeClientByName(final String name){	
		int j = 0;
		for (int i = 0; i < clients.length; i++){
			if (clients[i] != null && clients[i].getId().equals(name)){
				clients[i] = null;
				j = j + 1;
			}
		}
		if (j != 0){
			System.out.println("�������� ������� ������ �������");
		}else {
			System.out.println("������ ������� ��� � ����");
		}
	  }
	/**
	  * ����� �������� �� ����� ���������
	  * @param ��� ���������
	  */
	  public Client[] findClientsByPetName(final String name){
		Client[] foundedClients = new Client[clients.length];
		for (int i = 0; i < clients.length; i++){
			if(clients[i] != null && clients[i].getPet().getName().equals(name)){
				foundedClients[i] = clients[i];
			}
		}
		return foundedClients;
	  }
	/**
	  * ������ ��������, ��������� �� ����� ���������
	  * @param ��� ���������
	  */
	  public void printClientsByPetName(final String name){
		Client[] foundedClients = findClientsByPetName(name);
		int j = 0;
			for (int i = 0; i < foundedClients.length; i++){
				if(foundedClients[i] != null){
					System.out.println(foundedClients[i].getId());
					j = j + 1;
				}
		}
		if (j == 0){
			System.out.println("������ ��������� �� ����������");
		}
	  }
	/**
	  * ����� �������� �� ����� �������
	  * @param ��� �������
	  */
	  public Pet[] findPetsByClient(final String client){
		Pet[] foundedPets = new Pet[clients.length];
		for (int i = 0; i < clients.length; i++){
			if(clients[i] != null && clients[i].getId().equals(client)){
				foundedPets[i] = clients[i].getPet();
			}
		}
		return foundedPets;
	  }
	/**
	  * ������ ���� �������� �� ����� �������
	  * @param ��� �������
	  */
	  public void printPetsByClient(final String client){
		Pet[] foundedPets = findPetsByClient(client);
		int j = 0;
		for (int i = 0; i < foundedPets.length; i++){
			if(foundedPets[i] != null){
				System.out.println(foundedPets[i].getName());
				j = j + 1;
			}
		}
		if (j == 0){
			System.out.println("������ ������� �� ����������");
		}
	  }
	/**
	  * ������ ���� �������� ������� � �� �������� ��������
	  */
	  public void printAllClients(){		
		for (int i = 0; i < clients.length; i++){
			if(clients[i] != null){
				System.out.println(clients[i].getId() + " - " + clients[i].getPet().getName());
			}
		}
	  }
  }