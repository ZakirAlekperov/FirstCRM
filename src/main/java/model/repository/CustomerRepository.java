package model.repository;

import model.Customer;

import javax.swing.*;
import java.sql.ResultSet;

public interface CustomerRepository {
    boolean addCustomer(Customer customer);

    ResultSet getResultSet(int id);

    boolean updateCustomer(Customer customer);
    String[][] getCustomers(String selectedItem, String searchFragment);

    String[][] getCustomers();
    String[] getTableTitle();
    boolean deleteCustomer(int id);
    String[][] noConnect();
    boolean addCustomerGroup(JTable table);
}
