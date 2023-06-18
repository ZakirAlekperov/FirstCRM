package model.repository;

import model.Contact;

import java.sql.ResultSet;

public interface ContactRepository {

    boolean addContact(Contact contact);
    boolean deleteContact(int id);
    ResultSet getResultSet(int id);
    String[][] selectContact(String[] select, String where, Object id);
    String[][] getContacts(int id);
    String[] getTableTitle();
}
