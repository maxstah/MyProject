package ua.com.juja.sqlcmd.model;

/**
 * Created by oleksandr.baglai on 02.10.2015.
 */
public interface DataSet {
    void put(String name, Object value);

    Object[] getValues();

    String[] getNames();

    Object get(String name);

    void updateFrom(DataSet newValue);
}
