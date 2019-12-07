package week1.dayy1;

public class Mobile {
	
	boolean isTouchScreen = false;
	String mobileMake = "SAMSUMG";

	//public static void main(String[] args)
	public int getIMEI()
	{
		return 998787050;
	}
	public String getMessage()
	{
		return "Hi";
	}
	public void takePictures()
	{
		System.out.println("I will click pictures");

	}
	public String recVideo()
	{
		return "The video has been recorded";
	}
	public long contactNumber()
	{
		return 998767678876L;
	}
	public float mobBalance()
	{
		return 12.56F;
	}
	public void mobColor(String color)
	{
		System.out.println(color);
	}
}
