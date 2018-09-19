package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wma
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    private static String [] records;   
  
    public static boolean chckNames(String frstName, String lstName){
        if(Character.isUpperCase(frstName.charAt(0))){
            for(int i =0; i< frstName.length();i++){
                if(!Character.isLowerCase(frstName.charAt(i)) || !Character.isUpperCase(frstName.charAt(i))){
                    return false;
                   
                }
            }
        }
            if(Character.isUpperCase(lstName.charAt(0))){
                for(int i = 1; i< lstName.length(); i++){
                if(!Character.isLowerCase(frstName.charAt(i)) || !Character.isUpperCase(lstName.charAt(i))){
                   return false;
                }
            }
    }
            return true;
    }
    
    public static void main(String[] args){
       String[]record;
       record = new String[100];
        try{ 
            Scanner reader = new Scanner(new File(args[0]));
            int currentIndex = 0;
            while(reader.hasNext()){
                String [] line =reader.nextLine().split(",");
                String frstName = line[0];
                String lstName = line[1];
                String age = line[2];
                String gender = line[3];
                String phoneNum = line[4];
                String email = line[5];
                
                if(chckNames(frstName, lstName) && chckGender(gender)){
                    
                }
                records[currentIndex] = String.format("%-20s%-20s%-10s%10s%-20s%30s", frstName, lstName , gender,age, phoneNum, email);
                System.out.print(records[currentIndex]);
                currentIndex++;
                
        }
        }
        catch(FileNotFoundException ex){
                    
                  System.err.println("Could not find input file");
                    System.exit(-1);
                    }
                    
                    }
}