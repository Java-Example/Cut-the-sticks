import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Cutthesticks {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no_of_testcase=s.nextInt();
		int values;
		int j;
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(no_of_testcase);
		for(int i=0;i<no_of_testcase;i++)
		{
			values=s.nextInt();
			arrlist.add(values);
		}
		while(arrlist.size()>0){
		j=0;
		System.out.println(arrlist.size());
			int min=Collections.min(arrlist);
			for(int i=0;i<arrlist.size();i++)
			{
				arrlist.set(i,arrlist.get(i)- min);
			}
			//System.out.println(arrlist);
			while(j<arrlist.size())
			{
				if(arrlist.get(j)==0){
					arrlist.remove(j);
					j--;
				}
				j++;
			}
			
    }
}
}