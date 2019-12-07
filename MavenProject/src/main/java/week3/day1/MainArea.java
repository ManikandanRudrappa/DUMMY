package week3.day1;

public class MainArea {

	public static void main(String[] args) 
	{
		CalculateArea area =new CalculateArea();
		System.out.println("Area of square:"+area.ComputeArea(10));
		System.out.println("Area of square in float:"+area.ComputeArea(10.7f));
		System.out.println("Area of rectangle:" +area.ComputeArea(10, 5));
		System.out.println("Area of rectangle:" +area.ComputeArea(10.6f, 14.f));
		
				
	}

}
