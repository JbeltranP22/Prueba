import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Prueba {

    public static void main(String[] args) {
        File archivo =  new File("prueba.txt");
        
        try {
            FileWriter fileWriterObj = new FileWriter(archivo);
            BufferedWriter bufferedWriterObj = new BufferedWriter(fileWriter);
            
            bufferedWriterObj.write("Jose Beltran");
            
            bufferedWriterObj.close();
        } catch (IOException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
