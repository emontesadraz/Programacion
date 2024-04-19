import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programa");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel nameLabel = new JLabel("Nome");
        JTextField nameField = new JTextField(10);
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel surnameLabel = new JLabel("Apelido");
        JTextField surnameField = new JTextField(10);
        panel.add(surnameLabel);
        panel.add(surnameField);

        JLabel courseLabel = new JLabel("Curso");
        String[] courses = {"Curso 1", "Curso 2", "Curso 3"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        panel.add(courseLabel);
        panel.add(courseBox);

        String[] columnNames = {"Nome", "Apelido", "Curso"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);

        JButton button = new JButton("Agregar Taboa");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String surname = surnameField.getText();
                String course = (String) courseBox.getSelectedItem();
                model.addRow(new Object[]{name, surname, course});
            }
        });
        panel.add(button);

        frame.setVisible(true);
    }
}