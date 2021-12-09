import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
import java.util.*;  
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CS1702_Lab_6 {


	public static void main (String Args[]) throws IOException 
	{
		Preliminaries_6_2();
		Strings_6_3();
		Mathematical_Functions_6_4();
		System_Commands_6_5();
		Random_Number_Generation_6_6();
		File_Handling_6_7();
		Reading_Data_6_7_1();
	}



	public static  void  Preliminaries_6_2()
	{
		System.out.println("Create a project in Eclipse called CS1702_Lab6 and create a corresponding class (say CS1702_Lab6). Try and organise your work (from the following exercises) into separate methods as we did in the previous worksheet.");
	}


	public static void Strings_6_3()
	{

		double x;
		double z;
		x= 123.456;
		String a,b;
		a="Hello";
		b= "World";
		z= Math.sqrt(2);
		double y =  (17d/3d); // Casted as double


		System.out.println("");
		System.out.println("Question1) Display y to three decimal places:");
		String y_string = String.valueOf(y);
		int y_length = y_string.length();
		int y_decimal = y_string.indexOf(".");
		System.out.println((y_decimal) + " digits before and " + (y_length - y_decimal -1) + " digits after");
		System.out.println("");
		System.out.println("MY CODE BELOW");
		System.out.println("Question1) Display y to three decimal places:");
		System.out.println(String.format("Display"+"("+ y +")"+ "to three decimal places = %.3f", y));

		System.out.println("Second Method of Displaying a number to 3.dp and rounds aswell ");
		DecimalFormat three = new DecimalFormat("0.000");
	
		DecimalFormat three1 = new DecimalFormat("#,##0.000");
		
		System.out.println(three.format(4.6529343));


		System.out.println("Question2) Display how many digits come before the decimal point and how many comes after a number. Test this program on x, y and z");    
		System.out.println("The number("+x+")"+"has"+","+noOfDigits(x));
		System.out.println("The number("+y+")"+"has"+","+noOfDigits(y));
		System.out.println("The number("+z+")"+"has"+","+noOfDigits(z));



		System.out.println("Question3) Create a string c that consists of a in reverse concatenated with b, including a space between them");
		String c = reverse1( b + "," + a);
		System.out.println(c);


		System.out.println("Question4) Search for the substring �ll� in c and replace it for �ppp�");
		String Searchforword = c.replace("ll", "ppp"); 
		System.out.println(Searchforword); 
		System.out.println("");
	}

	//----------------------------------------QUESTION 2 FUNCTION BELOW------------------------------------
	public static String noOfDigits(double d) {
		int n1=0,n2=0;
		String s=String.valueOf(d);
		StringTokenizer t=new StringTokenizer(s,".");
		String s1=t.nextToken();
		String s2=t.nextToken();
		n1=s1.length();
		n2=s2.length();
		if(s1.charAt(0)=='0')
			n1=s1.length()-1;
		if(n2!=1)
			if(s2.charAt(s2.length()-1)=='0')
				n2=s2.length()-1;
		String s3="this many digits before decimal point"+":"+String.valueOf(n1);
		String s4=","+"and this many digits after the decimal point"+":"+String.valueOf(n2);
		String s5= ","+"IN TOTAL EQUAL TOO"+"," +String.valueOf(n1)+":"+String.valueOf(n2);
		return s3 + s4+ "-----------" + s5;
	}
	//----------------------------------------QUESTION 3 FUNCTION BELOW------------------------------------
	public static String reverse1(String word) 
	{  
		char[] letters = new char[word.length()];

		int letterIndex = 0;
		for(int i = word.length() - 1; i >= 0; i--) {
			letters[letterIndex] = word.charAt(i);
			letterIndex++;
		}

		String reverse = "";
		for(int i = 0; i < word.length(); i++) {
			reverse = reverse + letters[i];
		}

		return reverse;
	}


	public static void Mathematical_Functions_6_4()
	{
		System.out.println("Simpler way of doing it");
		double aMain  = -100.1;
		double bMain  = -100.49;
		double cMain = -100.5 , dMain  = -100.51 , eMain  = -100.9 , fMain  =  0 , gMain  = 100.1 ,hMain  =100.1, iMain  = 100.5;
		String sMain  = String.format("b = %2$.2f a = %1$.3f",cMain ,dMain ); //
		System.out.println(sMain );

		System.out.println("Mathematical Function example");
		double j1;
		j1=10.2;
		System.out.println(Math.floor(j1));
		System.out.println(Math.ceil(j1));
		System.out.println("");

		System.out.println("Question0---Testing 2 numbers: 10,15.789");
		int a =10;
		double b = 15.789;
		String s = String.format("b= %2$.2f a= %1$d",a,b);
		System.out.println(s);
		System.out.println(Math.floor(a));
		System.out.println(Math.ceil(b));

		System.out.println("Question1---Test your program on the following number: -100.1");
		int c1= (int) 100.1;
		double c = -100.1;
		String s1 = String.format("c= %2$.2f c= %1$d",c1,c);
		System.out.println(s1);
		System.out.println("Floor is:"+Math.floor(c));
		System.out.println("Ceil is:"+Math.ceil(c));
		System.out.println();
		System.out.println("Question2---Test your program on the following number: -100.49");
		double d= -100.49;
		String s2 = String.format("d= %2$.2f d= %1$d",0,d);
		System.out.println(s2);
		System.out.println("Floor is:"+Math.floor(d));
		System.out.println("Ceil is:"+Math.ceil(d));

		System.out.println("Question3---Test your program on the following number: -100.5");
		double e= -100.5;
		String s3 = String.format("e= %2$.2f e= %1$d",0,e);
		System.out.println(s3);
		System.out.println("Floor is:"+Math.floor(e));
		System.out.println("Ceil is:"+Math.ceil(e));

		System.out.println("Question4---Test your program on the following number: -100.51");
		double f=  -100.51;
		String s4 = String.format("f= %2$.2f f= %1$d",0,f);
		System.out.println(s4);
		System.out.println("Floor is:"+Math.floor(f));
		System.out.println("Ceil is:"+Math.ceil(f));

		System.out.println("Question5---Test your program on the following number: -100.9");
		double g= -100.9;
		String s5 = String.format("g= %2$.2f g= %1$d",0,g);
		System.out.println(s5);
		System.out.println("Floor is:"+Math.floor(g));
		System.out.println("Ceil is:"+Math.ceil(g));

		System.out.println("Question6---Test your program on the following number: 0");
		double h= 0;
		String s6 = String.format("h= %2$.2f h= %1$d",0,h);
		System.out.println(s6);
		System.out.println("Floor is:"+Math.floor(h));
		System.out.println("Ceil is:"+Math.ceil(h));

		System.out.println("Question7---Test your program on the following number: 100.1");
		double i= 100.1;
		String s7 = String.format("i= %2$.2f i= %1$d",0,i);
		System.out.println(s7);
		System.out.println("Floor is:"+Math.floor(i));
		System.out.println("Ceil is:"+Math.ceil(i));

		System.out.println("Question8---Test your program on the following number: 100.49");
		int j2=2;
		double j= 100.49;
		String s8 = String.format("j= %2$.2f j= %1$d",j2,j);
		System.out.println(s8);
		System.out.println("Floor is:"+Math.floor(j));
		System.out.println("Ceil is:"+Math.ceil(j));

		System.out.println("Question9---Test your program on the following number: 100.5");
		double k= 100.5;
		String s9 = String.format("j= %2$.2f j= %1$d",0,k);
		System.out.println(s9);
		System.out.println("Floor is:"+Math.floor(k));
		System.out.println("Ceil is:"+Math.ceil(k));
		System.out.println("Question10---Test your program on the following number: 100.51");
		double l= 100.51;
		String s10 = String.format("j= %2$.2f j= %1$d",0,l);
		System.out.println(s10);
		System.out.println("Floor is:"+Math.floor(l));
		System.out.println("Ceil is:"+Math.ceil(l));
		System.out.println("Question11---Test your program on the following number:100.9");
		double n= 100.51;
		String s11 = String.format("j= %2$.2f j= %1$d",0,n);
		System.out.println(s11);
		System.out.println("Floor is:"+Math.floor(n));
		System.out.println("Ceil is:"+Math.ceil(n));
	}






	public static void System_Commands_6_5()
	{
		System.out.println("");
		System.out.println("==============================Reading files from Computer Directory==============================");
		// try-catch block to handle exceptions 
		try { 

			// Create a file object 
			File FileDirectoryPath = new File("D:\\Brunel University\\1st Year Computer Science");    

			// Get all the names of the files present 
			// in the given directory 
			File[] files = FileDirectoryPath.listFiles(); 

			System.out.println("The Files are:"); 

			// Display the names of the files 
			for (int i = 1; i < files.length; i++) 
			{ 
				System.out.println(files[i].getName()); 
			} 
		} 
		catch (Exception e) { 
			System.err.println(e.getMessage()); 
		} 
	}


	public static void Random_Number_Generation_6_6()
	{

		System.out.println("Question1) Generate random integers between -100 and +100.");
		int min= -100;
		int max=100;
		System.out.println("Random value in int from "+min+" to "+max+ ":");
		int random_int = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(random_int);

		System.out.println();
		System.out.println("Question2) Generate random INTEGERS between limits (pre-specified) a and b..");

		boolean check= false;
		Scanner InputScan = new Scanner(System.in);
		while (check== false)  
		{	
			System.out.print("Input Number a:");
			int a =InputScan.nextInt();
			System.out.print("Input Number b:");
			int b = InputScan.nextInt();

			if (b>a && a<b)  
			{
				check = true;
			}
			else 
			{
				System.out.println("INVALID input!!");
			}

			System.out.println("Random value in int from "+a+" to "+b+ ":");
			int random_int1 = (int)(Math.random() * (a - b + 1) + b);
			System.out.println(random_int1);

		}


		System.out.println("Question3) Generate random doubles.");
		Random r0 = new Random();
		int rangeMin;
		rangeMin=-200;
		int rangeMax;
		rangeMax=200;
		double randomValue = rangeMin + (rangeMax - rangeMin) * r0.nextDouble();
		System.out.println(randomValue);

		System.out.println("Question4) Generate random doubles between zero and one.");
		Random r1 = new Random();
		int rangeMin1;
		rangeMin=0;
		int rangeMax1;
		rangeMax=1;
		double randomValue1 = rangeMin + (rangeMax - rangeMin) * r1.nextDouble();
		System.out.println(randomValue1);

		System.out.println("Question5) Generate random DOUBLES between limits (pre-specified) a and b.");
		boolean check1= false;
		Scanner InputScan1 = new Scanner(System.in);
		while (check1== false)  
		{	
			System.out.print("Input Number a:");
			int min2 =InputScan1.nextInt();
			System.out.print("Input Number b:");
			int max2 = InputScan1.nextInt();

			if (max2>min2&& min2<max2)  
			{
				check1 = true;
			}
			else 
			{
				System.out.println("INVALID input!!");

			}
			System.out.println("Random value in double from "+min2+" to "+max2+ ":");
			double random_double = Math.random() * (min2 - max2 + 1) + max2; 
			System.out.println(random_double);
		}	
		System.out.println("Generating a Random number between-100 and 100");
		System.out.println(Randomizer.generate(-100,100)); 
	}
	public static class Randomizer 
	{
		public static int generate(int min,int max) 
		{
			return min + (int)(Math.random() * ((max - min) + 1));
		}
	}


	public static void File_Handling_6_7()
	{
		
		System.out.println("");
		System.out.println("Implement the two programs that read and write to a text file from the lecture notes. Test them to see if they work. Base your solutions to the following two exercises on these programs.");
		System.out.println("File Reader!");
		try 
		{
			FileReader reader = new FileReader("REPLACE WITH FILE PATH"); 
			int character;

			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File Writer!");

		try {
			FileWriter writer = new FileWriter("REPLACE WITH FILE PATH", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write("Hello World");
			bufferedWriter.newLine();
			bufferedWriter.write("See You Again!"); // adds new words to the txt file
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();


		}
	}





	public static void Reading_Data_6_7_1() throws IOException
	{
		System.out.println("");
		System.out.println("From the text in Appendix A, create a text file called �Billy Goats.txt�. Write a program that takes as a parameter the name of a file and returns an integer containing the number of words in that file. Test your program on several of your own test files and the file you have created from the Appendix. Note that you can use Microsoft Word to count the number of words in a text file. The text in Appendix A contains 348 words (I think�).");

		System.out.println ("Appendix 'A' Lab 6 words within text file");       
		FileReader fr = new FileReader ("REPLACE WITH FILE PATH");        
		BufferedReader br = new BufferedReader (fr);     
		String line = br.readLine();
		int count = 0;
		while (line != null) {
			String []parts = line.split(" ");
			for( String w : parts)
			{
				count++;        
			}
			line = br.readLine();
		}         
		System.out.println("There are ("+count+")words within this text file");
	}
}























































