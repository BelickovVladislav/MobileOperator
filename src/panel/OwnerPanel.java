package panel;

import javax.swing.*;

/**
 * Created by Vladislav on 17.02.2017.
 */
public class OwnerPanel extends JPanel {
    String[][] header = new String[][]{
            {"Клиент", "Номер телефона", ""}
    };
    Object[][] content = new Object[][]{
            {"Клиент1", "Номер телефона1", new JButton("Подробнее")},
            {"Клиент2", "Номер телефона2", new JButton("Подробнее")}
    };

    private JTable ownerTable;
    public OwnerPanel() {
        super();
        ownerTable = new JTable(header,content);

        this.add(ownerTable);
    }
}
