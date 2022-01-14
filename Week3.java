package Homework;

public class Week3 {

	public static void main(String[] args) {
//1a		// TODO Auto-generated method stub
int[] ages = {3,9,23,64,2,8,28,93};
//ages[0];
System.out.println(ages[0]);
System.out.println(ages.length);
System.out.println(ages[ages.length-1]);
System.out.println(ages[ages.length-1]- ages[0]);
//1b
int[] ages1 = {3,9,23,64,2,8,28,93,95};
System.out.println(ages1[ages1.length-1]- ages1[0]);
//1c
int sum=0;	


	int len=ages1.length;
for (int i=0; i<len; i++) {
	sum = sum+ages1[i];	
}System.out.println (sum);
	System.out.println(len);
	float avg=sum/len;
	System.out.println(avg);
	
	// Problem No. 2

String[] names= {"Sam","Tommy","Tim","Sally","Buck","Bob"};
int nameLen=0;
{
for(int i=0;i<names.length;i++)
{
	nameLen=nameLen+names[i].length();
	float avgLetters=nameLen/names.length;
	System.out.println(nameLen);
	System.out.println(avgLetters);
}
}


// 2b
String concNames="";
for (int i=0;i<names.length;i++)
{
	concNames=concNames+names[i]+" ";
}
System.out.println(concNames);

//3: element at position length -1 is the last element
System.out.println("Last element of an array: "+names[names.length-1]);

// 4: first element of an array is at position 0
System.out.println("First ELement: "+names[0]);

// 5

int nameLengths[]=new int[names.length];
for (int i=0;i<names.length; i++)
{
	nameLengths[i]=names[i].length();
}

// 6
int sumLengths=0;
for(int i=0;i<names.length; i++)
{
	sumLengths=sumLengths+nameLengths[i];
}
System.out.println("Sum of all lengths: "+sumLengths);

// 7
String repeated=concWord("Hello",3);
System.out.println(repeated);

//8
String fullNm=fullName("Edin","Rosic");
System.out.println(fullNm);

// 9
int[] numbers= {10,20,30,40,50};
System.out.println(total(numbers));

//10
double[] doubleNumbers= {10.4,5.5,12.7,55.5};
System.out.println(doubleAvg(doubleNumbers));

// 11
double[] doubleNumbers2= {11.4,6.5,11.7,50.5};
System.out.println(doubleAvg(doubleNumbers, doubleNumbers2));

// 12
System.out.println(willBuyDrink(true,11));


// 13
System.out.println(bmi(112,1.7));
}	// main method ends
	
	
//7
public static String concWord(String word, int n)
{
	
	String repeatedWord="";
	for (int i=0; i<n; i++)
	{
		repeatedWord+=word;
	}
	return repeatedWord;
	
}
//8
public static String fullName(String firstName, String lastName)
{
	return firstName+" "+lastName;
}
	
// 9
public static boolean total(int[] numbers)
{
	int tot=0;
	for(int i=0;i<numbers.length; i++)
	{
		tot+=numbers[i];
		
	}
	if (tot>100)
	{
		return true;
	}
	else
	{
		return false;
	}
}

// 10
public static double doubleAvg(double[] dbNumbers)
{
	double dbSum=0.0;
	for (int i=0; i<dbNumbers.length;i++)
	{
		dbSum+=dbNumbers[i];
	}
	return dbSum/dbNumbers.length;
}

//11
public static boolean doubleAvg(double[] arr1, double[] arr2)
{
	double arr1Avg=doubleAvg(arr1);
	double arr2Avg=doubleAvg(arr2);
	if (arr1Avg>arr2Avg)
	{
		return true;
	}
	else {
		return false;
	}
}

//12
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) 
{
	if (isHotOutside==true && (moneyInPocket>10.50))
	{
		return true;
	}else {
		return false;
	}
}

// 13 This function calculates the Body mass index taking weight in Kilograms and height in meters as arguments of the function bmi.
public static String bmi(double weight, double height)
{
	double index=weight/(height*height);
	if (index<18.5)
	{
		return "Underweight";
	}
	else if(index<25)
		return "normal";
	else if(index<30)
		return "Overweight";
	else
		return "Obese";
	
}
}
