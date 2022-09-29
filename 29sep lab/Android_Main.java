package array;

public class Android_Main {

	public static void main(String[] args) {

				
				Android a1 = new Android(4.6, 16 ,"red");
				Android a2 = new Android(7.6, 8 ,"pink");
				Android a3= new Android(8.6, 4 ,"black");
				
				Android[] arr = new Android[3];
				
				arr[0]= a1;
				arr[1]= a2;
				arr[2]= a3;
				
				for(Android a : arr)
				{
					System.out.println("Display Size:"+a.display + " and Android RAM : "+a.ram);
				}
				
				
			}
		}

	


