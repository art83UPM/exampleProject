package spike._dataReaders;

import readers.TestDataReader;
import spike.Example;

public class ExampleTestDataReader2 extends TestDataReader {

    private Example example;

    private final static int CONSTRUCTOR_QUANTITY = 3;

    public ExampleTestDataReader2(String excelFile) {
        super("C:\\Users\\nyuron\\workspace\\exampleProject\\src\\test\\resources\\Example.xlsx");

    }

    public boolean hasNext() {
        return this.getDataReader().hasNext();
    }

    public boolean hasNext(int constructMode) {
        do {
            this.getDataReader().next();
        } while (this.getDataReader().hasNext() && !this.existsConstructor(constructMode));
        return this.getDataReader().hasNext();
    }

    public void next() {
        this.getDataReader().next();
        int i = 0;
        this.example = null;
        while (this.example == null && i < CONSTRUCTOR_QUANTITY) {
            this.construct(i++);
        }
    }

    public void next(int construcMode) {
        this.example = null;
        this.construct(construcMode);
    }

    private boolean existsConstructor(int constructMode) {
        // TODO Comprueba si las celdas del constructor seleccionado estan rellenas
        return false;
    }
    
    private void construct(int i) {
        // TODO Fijarse en los trycase y hacerlo aqui en un switch
    }
}
