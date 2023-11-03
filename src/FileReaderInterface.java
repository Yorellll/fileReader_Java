import java.nio.Buffer;
import java.util.ArrayList;

public interface FileReaderInterface {

    public abstract ArrayList<String> getContent();

    public abstract ArrayList<String> showFile();

    public abstract void showElif();

    public abstract void showPalin();

    public abstract boolean diff();

}
