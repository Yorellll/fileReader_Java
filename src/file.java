import java.io.File;
import java.util.ArrayList;

public abstract class file {

    protected File theFile;
    private ArrayList<String> contentFile;


    public abstract ArrayList<String> getContent();

    public abstract ArrayList<String> showFile();

    public abstract void showElif();

    public abstract void showPalin();

    public abstract boolean diff();

    public void setTheFile(File fi){
        this.theFile = fi;
    }

    public File getFile(){
        return this.theFile;
    }


    
}
