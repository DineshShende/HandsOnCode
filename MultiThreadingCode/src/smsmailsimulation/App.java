package smsmailsimulation;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandleMailSending handleMailSending=new HandleMailSending();
		
		handleMailSending.sendSMS();
		
		handleMailSending.sendEmail();
		
	}

}
