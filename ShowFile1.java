
package shivaafoundation.javatutorial;
import java.io.*;

public class ShowFile1 {
     public static void main(String args[]){
int i;
//first confirm that both files have been specified
if(args.length !=1){
System.out.println("Usage : ShowFile filename");
return;
    }
try {FileInputStream fin = new FileInputStream(args[0]){

    do{
        i = fin.read();
        if(i !=-1) System.out.println((char));

    } while(i !=-1);
} catch (FileNotFoundException e){
    System.out.println("File NotFound");
} catch (IOException e){
 
        System.out.println("I/O error Occurred");
    }
}
    
    }
/*try{
fin = new FileInputStream(args[0]);
do{
i = fin.read();
if (i !=-1) System.out.println((char)i);
)while(i!=-1)
System.out.println("I/O Error:" +e);
)finally{
if(fin i=null fin.close();
}catch{IOException e) {
System.out.println("Error closing file");
}
}

  /*
package shivaafoundation.javatutorial;
import java.io.*;
public class ShowFile {
    public static void main (String args[]){
        int i;
        FileInputStream fin;
        // first confirm the file has been specified
        if(args.length !=1){
          System.out.println("Usage : Show filename") ;
          return;
        }
        //Attempt to open the file
        try{
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("Cannot Open File");
            return;
        }
        //At this point, file is open and can be read
        //The following reads characters until EOF is encountered
        try{
            do{
                i = fin.read();
                if (i!=-1);
            }while (i!=-1);
        }catch (IOException e){
             System.out.println("Error in reading File");
            }
       // close the file
      try{System.out.println("error in reading file");

           fin.close();
                   }catch (IOException e){

            System.out.println("error in closing  File");
        }
    }
    
}
//file close try with finally 
/*try {
do{
i = fin.read();
if(i != -1)System.out.println((char)i);
}while(i != -1);
} catch(IOException e){
} finally {
//close the file on thecway out of try block
try{
fin.close();
} catch(IOException e){
System.out.println("error closing  file");
}
}
    
}
