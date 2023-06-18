import view.Add;

import javax.swing.*;

/**
 * CRM система на Java Swing
 * @author ZakAlek
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        try {
            Add dialog = new Add();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
