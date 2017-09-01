package com.navin.string;

public class ReplaceAllTest {
	
	public static void main(String args[]) {
		
		 String descNodeName = "NAVInmns-ere";
         descNodeName = descNodeName.replaceAll("[^-a-zA-Z0-9 ]+", "");
         descNodeName = descNodeName.toLowerCase()
                                    .replaceAll("\\s+", "-");
		
         
         System.out.println("descNodeName:"+descNodeName);
		
	}
}
