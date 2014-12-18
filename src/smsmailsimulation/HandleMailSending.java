package smsmailsimulation;


public class HandleMailSending {
	
	public void sendSMS()
	{
		SMSThread smsThread=new SMSThread(1L, "");
		
		Thread t1=new Thread(smsThread);
		
		t1.start();
	}
	
	public void sendEmail()
	{
		EmailThread emailThread=new EmailThread("","");
		
		Thread t1=new Thread(emailThread);
		
		t1.start();
		
	}

}
