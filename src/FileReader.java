import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {

        File fi = new File("C:/Users/Yorelll/Documents/Projet/Java/LecteurDeFichiers/src/test.txt");
        File fi2 = new File("C:/Users/Yorelll/Documents/Projet/Java/LecteurDeFichiers/src/test2.txt");
        
        JsonFile test = new JsonFile(fi);
        JsonFile test2 = new JsonFile(fi2);

        //Test des fonctions sur les fichiers JSON:

        //Test de la méthode Show file:
        System.out.println(test.showFile());

        //Test de la méthode Show elif (elif = file à l'envers):
        test.showElif();

        //Test de la méthode Show palin:
        test.showPalin();

        //Test de la méthode diff (de manière hasardeuse, ce n'est pas une méthode):
        ArrayList<String> file1 = test.getContent();
        ArrayList<String> file2 = test.getContent();
        boolean same;

        if(file1 == file2){
            same = true;
            System.out.println("Les 2 fichiers sont les même");
        }else{
            same = false;
            System.out.println("Les fichiers ne sont pas les même");
        }
    }
        
}