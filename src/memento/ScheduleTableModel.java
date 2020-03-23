package memento;

import javax.swing.table.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//Originator
public class ScheduleTableModel extends DefaultTableModel {
    private List columnIdentifiers;
    private List dataList;

    // DefaultTableModel uses:
    // - a list of column identifiers
    // - a list of lists of Object values
    // This fact is reflected by the Memento class.

    public ScheduleTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
        setState(data, columnNames);
    }

    private void setState(Object[][] data, Object[] columnNames) {
        this.dataList = Arrays.asList(data);
        this.columnIdentifiers = Arrays.asList(columnNames);
    }

    public List getColumnIdentifiers() {
        return columnIdentifiers;
    }

    public List getDataList() {
        return dataList;
    }

    public TableMemento createMemento() {
        return new TableMemento(columnIdentifiers, dataList);
    }

    public void setMemento(TableMemento memento) {
        columnIdentifiers = memento.getColumnIdentifiers();
        dataList = memento.getDataVector();
    }

    // Serialization
    public void saveMementoToFile(TableMemento memento) throws IOException {
            FileOutputStream fileOut = new FileOutputStream("/tmp/table.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(memento);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/table.ser");
    }

    // Deserialization
    public TableMemento restoreMementoFromFile() throws IOException, ClassNotFoundException {
        TableMemento savedMemento;
        FileInputStream fileIn = new FileInputStream("/tmp/table.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        savedMemento = (TableMemento) in.readObject();
        in.close();
        fileIn.close();
        return savedMemento;
    }
}
