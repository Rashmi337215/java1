package mypack;
public class MyPackageClass{
  public void displayMessage(){
     System.out.println("This message is from the MyPackageClass inside the mypack package");
}
}
import mypack.MyPackageClass;
public class MainClass{
	public static void main (String[] args) {
		MyPackageClass myPackageObject= new MyPackageClass();
		myPackageObject.displayMessage();
	}
}