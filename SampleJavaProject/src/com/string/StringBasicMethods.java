package com.string;

public class StringBasicMethods {

	public static void main(String[] args) {
		
		String s="sachin tendulkar"; //set of character
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.length());
		
		char c=s.charAt(0); //'s'
		
		String st=String.valueOf(c);//"s"
		st=st.toUpperCase();
		s=s.replace("s", st);
		
		System.out.println(s);
		
		String[] str=s.split(" "); //{"sachin","tendulkar"}
		String sss="";
		for(String ss:str) {
			st=String.valueOf(ss.charAt(0)).toUpperCase();
			s=s.replace(String.valueOf(ss.charAt(0)), st);
			sss=sss+" "+s;
		}
		System.out.println("Result :"+sss);
		
		System.out.println(s.substring(7));
		System.out.println(s.substring(0,6));
		
	}
	//String emp="1 ravi pune 145236589, 2 Kamlesh Ambegaon 875451233";


}

