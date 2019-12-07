package week3.day1;

public class MainMobile {

	public static void main(String[] args)
	{
		SmartMobile smart=new SmartMobile();
		smart.Browse();
		smart.takesnap();
		smart.Playmusic();
		smart.ReceiveCall();
		smart.MakeCalls();
		smart.SendMessage();
		
		AndroidMobile andr = new AndroidMobile();
		andr.MakeCalls();	
	}

}
