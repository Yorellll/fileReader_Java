import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class JsonFile extends file{

    File feel;

    public JsonFile(File fi){
        super();
        this.feel = fi;
    }

    @Override
    public ArrayList<String> getContent(){
        ArrayList<String> content = new ArrayList<>();

        try{
            FileInputStream strFile = new FileInputStream(this.feel);
            InputStreamReader strRdFile = new InputStreamReader(strFile);
            BufferedReader bfRd = new BufferedReader(strRdFile);

            int i = bfRd.read();
            while (i != -1) {
                content.add(Character.toString((char) i));
                i = bfRd.read();
            }
            bfRd.close();
        }catch (Exception e){
            e.getStackTrace();
        }

        return content;
    } 

    @Override
    public ArrayList<String> showFile(){
        ArrayList<String> show = new ArrayList<>();
        show = this.getContent();
        return show;
    }

    @Override
    public void showElif(){
        ArrayList<String> elif = this.getContent();
        String line = "";

        for(int i = elif.size()-1; i >= 0; i--){
            line += elif.get(i);
            if(elif.get(i).equals(" ")){
                line = new StringBuilder(line).reverse().toString();
                System.out.println(line);
                line = "";
            }
        }
        System.out.println(" "+line);
    }

    @Override
    public void showPalin(){
        ArrayList<String> elif = this.getContent();

        for(int i = elif.size()-1; i >= 0; i--){
            System.out.println(elif.get(i));
        }
    }

    @Override
    public boolean diff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diff'");
    }
    
    /**@Override
    public boolean diff(JsonFile js){
        boolean same = false;

        if(this.getContent() == js.getContent()){
            same = true;
        }else{same = false;}

        return same;
    }**/
}
