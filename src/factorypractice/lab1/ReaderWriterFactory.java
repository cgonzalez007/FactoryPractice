package factorypractice.lab1;

/**
 * (This class really should be separated into separate factory classes) 
 * @author cgonz
 */
public class ReaderWriterFactory {
    private static ReaderWriterFactory instance;
    
    public static ReaderWriterFactory getInstance(){
        if( instance== null){
            instance = new ReaderWriterFactory();
        }
        return instance;
    }
    private ReaderWriterFactory (){}
    
    public final Reader getReader(ReaderType readerType){
        Reader reader = null; 
        switch(readerType){
            case KEYBOARD:
                reader = new KeyboardReader();
                break;
            case FILE:
                reader = new FileReader();
                break;
        }
        return reader;
    }
    public final Writer getWriter(WriterType writerType){
        Writer writer = null; 
        switch(writerType){
            case CONSOLE:
                writer = new ConsoleWriter();
                break;
            case FILE:
                writer = new FileWriter();
                break;
        }
        return writer;
    }
}
