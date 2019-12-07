package week1.dayy1;

public class MyMobile {

	public static void main(String[] args) 
	{
	 Mobile mob =new Mobile();
	System.out.println(mob.getIMEI());
	mob.takePictures();
	System.out.println("The msg is :"+mob.getMessage());
	System.out.println("The mob type is touch? :" +mob.isTouchScreen);
	System.out.println("The mob model is:" +mob.mobileMake);
	System.out.println("Contact number:" +mob.contactNumber());
	System.out.println(mob.recVideo());
	System.out.println("Balance:" +mob.mobBalance());
	mob.mobColor("green");
	

	}

}
