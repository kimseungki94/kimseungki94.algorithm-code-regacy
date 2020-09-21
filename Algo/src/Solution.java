
public class Solution {
	public static void main(String[] args) {
		 String answer = "fa";
		 answer=answer.toLowerCase();
		 System.out.println(answer);
		 char[] arr = answer.toCharArray();
		 
		 for(int i=0;i<arr.length;i++) {
			 if((int)arr[i]>=97 && (int)arr[i]<=128) {
				 continue;
			 }
			 else if((int)arr[i]>=48 && (int)arr[i]<=57) {
				 continue;
			 }
			 else if(arr[i]=='-' || arr[i]=='_' || arr[i]=='.' ) {
				 continue;
			 }
			 else {
				 arr[i] = 'A';
			 } 
		 }
		 String str = new String(arr);
		 str=str.replaceAll("A", "");
		 
		 arr = str.toCharArray();
		 //3
		 if(arr.length<2){
	        }else{
	            for(int i=1;i<arr.length;i++) {
				 if(arr[i]=='.' && arr[i-1]=='.') {
					 arr[i-1]=' ';
				 }
			    }
			    str = new String(arr);
			    str=str.replaceAll(" ", "");
	        }
		 System.out.println(str);
		 //4
		 arr = str.toCharArray();
	        if(arr.length>0){
	            if(arr[0]=='.') {
				 arr[0]=' ';
			 }
			 if(arr[arr.length-1]=='.') {
				 arr[arr.length-1]=' ';
			 }
			 str = new String(arr);
			 str=str.replaceAll(" ", "");
	        }
		 System.out.println(str);
		 
		 //5
		 if(str.length()==0) {
			 str="a";
		 }
		 //6
		 if(str.length()>=15) {
			 str=str.substring(0, 15);
		 }
		 System.out.println(str);
		 if(str.charAt(str.length()-1)=='.') {
			 arr = str.toCharArray();

			 if(arr[arr.length-1]=='.') {
				 arr[arr.length-1]=' ';
			 }
			 str = new String(arr);
			 str=str.replaceAll(" ", "");
		 }
		 //7
		 if(str.length()==1) {
			 str+="aa";
		 }
		 else if(str.length()==2) {
			 arr = str.toCharArray();
			 char[] temp = new char[3];
			 temp[0] = arr[0];
			 temp[1] = arr[1];
			 temp[2] = arr[1];
			 System.out.println(temp);
			 System.out.println(temp);
			 str = new String(temp);
		 }
		 System.out.println(str);
		 answer = str; 
	}
}
