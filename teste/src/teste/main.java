package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class main {  
   public static void main (String args[])throws Exception{  
        String numerosArray[] = new String[61];  
        int[] arrayInt = new int[61];  
        String aux;  
        try      //Abertura do tratamento de erros  
        {  
            File myFile = new File ("/Users/axelfahel/Desktop/ler.txt");  
            FileReader my = new FileReader(myFile);  
            BufferedReader reader = new BufferedReader(my);  
            String line = null;  
            int z = 0;    
            while ((numerosArray[z] = reader.readLine()) !=null)  
            {  
                    z++;  
            }  
            reader.close();  
              
            for (int i = 0;i < 60; i++)  
            {  
                numerosArray[i] = numerosArray[i].replace(";"," ");  
                System.out.println(numerosArray[i]);  
                //arrayInt<i> = Integer.parseInt(numerosArray<i>);       
            }  
          
                         
        }catch(Exception ex)  
        {                         
            ex.printStackTrace();   
        }  
           
   }  
}  