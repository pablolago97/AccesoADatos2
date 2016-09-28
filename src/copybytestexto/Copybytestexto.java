package copybytestexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author plago-bergonpazos
 */
public class Copybytestexto {

    public static void main(String[] args) throws IOException {
        File texto = new File("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copybytestexto/texto2.txt");
        texto.createNewFile();
        FileInputStream a = new FileInputStream("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copybytestexto/texto1.txt");
        FileOutputStream b = new FileOutputStream(texto,true);
        int c;
        while((c= a.read())!=-1){
        b.write(c);
        }
        b.close();
        a.close();
        
        
    }
    
}
