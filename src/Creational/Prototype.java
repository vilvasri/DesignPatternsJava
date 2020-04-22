package Creational;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    public static void main(String[] args) {
        String sql = "Select * from user where username = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("aaa");
        Statement st = new Statement(sql, parameters, new Record());

        System.out.println(st.getSql());
        System.out.println(st.getParameters());
        System.out.println(st.getRecord());

        Statement stClone = st.clone();
        System.out.println("After Shallow Copy!!!");
        System.out.println(st.getSql());
        System.out.println(st.getParameters());
        System.out.println(st.getRecord()); // same object (check same address)
    }
}

class Statement implements Cloneable {
    private String sql;
    private List<String> parameters;
    private Record record;

    Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    @Override
    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    String getSql() {
        return sql;
    }

    List<String> getParameters() {
        return parameters;
    }

    Record getRecord() {
        return record;
    }
}

//Empty class
class Record {

}
