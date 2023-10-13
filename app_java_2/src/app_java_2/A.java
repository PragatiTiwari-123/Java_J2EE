package app_java_2;


//public class A {
////2D array
//	public static void main(String[] args) {
//              int [][] arr = new int [2][3];
//              System.out.println(arr.length);//2
//              System.out.println(arr[0].length);//3
//	}
//
//}

//public class A{
//	public static void main(String[] args) {
//      int [][] arr = new int [2][3];
//      arr [0][0]=10;
//      arr [0][1]=20;
//      arr [0][2]=30;
//      arr [1][0]=40;
//      arr [1][1]=50;
//      arr [1][2]=60;
//      for (int i = 0; i <  arr.length; i++) {//0to1
//    	  for (int j = 0; j < arr[0].length; j++) {//0to2
//    		  System.out.println(arr[i][j]);
//    	  }
//      }
//
//	}
//}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//File
//FiileReader
//FileWriter
//BufferdReader
//BufferWriter
//FileInputStream
//FileOutputStream

//import java.io.File;
     //file handling in java 
//public class A{
//	public static void main(String[] args) {
//		File f = new File("E://files//A.txt");
//		System.out.println(f);
//	}
//}

//import java.io.File;
//    //file handling in java
//public class A{
//	public static void main(String[] args) {
//		File f = new File("E://files//C.txt");
//        boolean val = f.exists();
//        System.out.println(val);
//	}
//	
//} 

//import java.io.File;
//public class A{
//	public static void main(String[] args) {
//		File f = new File("E://files//A.txt");
//		boolean val = f.delete();
//        System.out.println(val);
//	}//error
//}

//Note: Regardless exception is occured or not incase of check  exception it is mandatory to handle that using try & catch block.
//import java.io.File;
////file handling in java//how to make file
//public class A{
//	public static void main(String[] args) {
//		try {
//		File f = new File("E://files//C.txt");
//		f.createNewFile();
//		}catch(Exception e) {
//			e.printStackTrace();		
//		}
//	}
//}

//import java.io.File;
////file handling in java // how to make folder
//public class A{
//	public static void main(String[] args) {
//		File f = new File("E://files//p1");
//		boolean val = f.mkdir();
//		System.out.println(val);
//	}
//}

//import java.io.File;
//public class A{
//	public static void main(String[] args) {
//		File f = new File("E://files//p1");
//	    boolean val = f.delete();
//	    System.out.println(val);
//	}
//}

//import java.io.File;
//// shows all stored name like folder and file
//public class A{
//	public static void main(String[] args) {
//		File f = new File("E://files");
//	    String[] names = f.list();
//	    for(String s : names) {
//	    System.out.println(s);
//	    }
//	}
//}

// How to count no. of character
//import java.io.File;
//public class A{
//	public static void main(String[] args) {
//		File f = new File("E:/files//A.txt");
//	    long val = f.length();
//	    System.out.println(val);
//	}
//}

// How read the file?
//import java.io.File;
//import java.io.FileReader;
//public class A{
//	public static void main(String[] args) {
//		try {
//		    File f = new File("E://files//A.txt");
//		    FileReader fr = new FileReader(f);
//		    for (int i = 0; i < f.length(); i++) {
//			System.out.print((char)fr.read());
//		     }
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	} 
//}

//import java.io.File;
//import java.io.FileReader;
//public class A{
//	public static void main(String[] args) {
//		try {
//		    File f = new File("E://files//A.txt");
//		    FileReader fr = new FileReader(f);
//		     
//		    char[] ch = new char[(int)f.length()];
//		    fr.read(ch);
//		    
//		    for (char c : ch) {
//		      System.out.print(c);  	
//		     }
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	} 
//}

//import java.io.FileWriter;
//public class A{
//	public static void main(String[] args) {
//		try {
//		    FileWriter fw = new FileWriter("E://files//A.txt");
//		    fw.write(100);
//		    fw.close();//save  the file
//		}catch(Exception e) {
//			e.printStackTrace();
//		}	
//		
//		
//	}
//}

//import java.io.FileWriter;
//public class A{
//	public static void main(String[] args) {
//		try {
//		    FileWriter fw = new FileWriter("E://files//A.txt");
//		    fw.write("mike");
//		    fw.write("100");
//		    fw.close();//save  the file
//		}catch(Exception e) {
//			e.printStackTrace();
//		}	
//		
//		
//	}
//}

//import java.io.FileWriter;
//public class A{
//	public static void main(String[] args) {
//		try {
//		    FileWriter fw = new FileWriter("E://files//A.txt");
//		    char[] ch = {'a','b','c'};
//		    fw.write(ch);
//		    fw.close();//save  the file
//		}catch(Exception e) {
//			e.printStackTrace();
//		}	
//		
//		
//	}
//}

//import java.io.FileWriter;
//public class A{
//	public static void main(String[] args) {
//		try {
//		    FileWriter fw = new FileWriter("E://files//A.txt",true );
//		    char[] ch = {'a','b','c'};
//		    fw.flush();
//		    fw.close();//save  the file
//		}catch(Exception e) {
//			e.printStackTrace();
//		}	
//		
//		
//	}
//}

//import java.io.FileWriter;
//public class A{
//    public static void main(String [] args){
//        try{
//          FileWriter fw = new FileWriter("E://A.txt");  
//          fw.write("Hello World !");
//          fw.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//    }
//}
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//public class A{
//    public static void main(String [] args){
//        try{
//            File f1 = new File("E://A.txt");
//            FileReader fr1 = new FileReader(f1);
//            char[] ch1 = new char[(int)f1.length()];
//            fr1.read(ch1);
//            
//            File f2 = new File("E://B.txt");
//            FileReader fr2 = new FileReader(f2);
//            char[] ch2 = new char[(int)f2.length()];
//            fr2.read(ch2);
//            
//            
//            FileWriter fw = new FileWriter("E://C.txt");
//            
//            for (char c1 : ch1){
//                fw.write(c1);
//            }
//            for (char c2 : ch2){
//                fw.write(c2);
//            }
//            
//            fw.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//    }
//}

//import java.io.FileWriter;
//public class A{
//    public static void main(String [] args){
//        try{
//            FileWriter fw = new FileWriter("E://A.txt");
//
//        	String str = "stamina";
//        	for(int i = str.length()-1; i>=0; i--) {
//                fw.write(str.charAt(i));
//	
//        	}
//            fw.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//    }
//}

//public class A{
//	public static void main(String[] args) {
//		String str = "my name is mike";
//		String[] s = str.trim().split(" ");
//		System.out.println(s.length);
//		for(String x:s) {
//			System.out.println(x);
//		}
//	}
//}













