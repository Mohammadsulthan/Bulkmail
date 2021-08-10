package com.lcs;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class secondApp
{
	App nn=new App();
    public static void main(String[] args) 
    {	
    secondApp n=new secondApp();
    App n1=new App();
    //1.step created a String and store a recipient email address
    n1.authentication();
    String emailList="resipient_email_address_with_coma_adding";
 
	Set<String> nn=new TreeSet<String>();
	
	
	String mail[]=emailList.split(",");
	for(String str:mail)
	{
		nn.add(str);
	}	
	
	
	Iterator<String> mo=nn.iterator();
	while(mo.hasNext())
	{
		String store=mo.next();
		n1.send(store);
	}
    
	
    }
}

	   //2.step created a set collection to added emaillist value add
//    Set<String> emails=new TreeSet<String>();
//    public void addemail(String emailList)
//    {
//   	 String []email=emailList.split(",");
//   	 for(String str:email)
//   	 {
//   		 this.emails.add(str);
//   	 }
//    }
//    //3.this details add in method
//    public void execute()
//    {
//   	 Iterator it=emails.iterator();
//   	 while(it.hasNext())
//   	 {
//   		 String email;
//   		 email=(String)it.next();
//   		 nn.send(email);
//   	 }


