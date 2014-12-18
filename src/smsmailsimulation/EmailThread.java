package smsmailsimulation;

public class EmailThread implements Runnable {

	private String email;
	
	private String message;
	
	public EmailThread(String email, String message) {
		super();
		this.email = email;
		this.message = message;
	}

	@Override
	public void run() {
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Simulated Email Sent");

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
