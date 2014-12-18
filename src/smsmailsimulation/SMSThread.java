package smsmailsimulation;

public class SMSThread implements Runnable {

	
	private Long mobile;
	
	private String message;
	
	
	
	public SMSThread(Long mobile, String message) {
		super();
		this.mobile = mobile;
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
		
		System.out.println("Simulated SMS send");

	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
