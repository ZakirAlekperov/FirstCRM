package model.repository;

import model.Group;

public interface GroupRepository {

    boolean addGroup(Group group);
    String[][] getGroups();
    String[] getTableTitle();
    boolean deleteGroup(int id);
    String[][] selectGroup(String[] select, String[] from, String where, Object id);
}
