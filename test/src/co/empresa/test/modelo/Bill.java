package co.empresa.test.modelo;

public class Bill {
	
	private int id;
	
	private String username;
	
	private int date_bill;
	
	private String user_id;
	
	private Integer type;

	private String observation;

	public Bill(int id, String username, int date_bill, String user_id, Integer type, String observation) {
		super();
		this.id = id;
		this.username = username;
		this.date_bill = date_bill;
		this.user_id = user_id;
		this.type = type;
		this.observation = observation;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public int getDate_bill() {
		return date_bill;
	}

	public String getUser_id() {
		return user_id;
	}

	public Integer getType() {
		return type;
	}

	public String getObservation() {
		return observation;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setDate_bill(int date_bill) {
		this.date_bill = date_bill;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	
	

}
