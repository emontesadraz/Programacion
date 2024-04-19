import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame frame;
    private JTextField nameField;
    private JTextField surnameField;
    private JComboBox<String> courseBox;
    private JButton addButton;
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton modifyButton;
    private JButton deleteButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Main() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("Nome");
        nameLabel.setBounds(10, 11, 46, 14);
        frame.getContentPane().add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(66, 8, 86, 20);
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        JLabel surnameLabel = new JLabel("Apelido");
        surnameLabel.setBounds(10, 36, 46, 14);
        frame.getContentPane().add(surnameLabel);

        surnameField = new JTextField();
        surnameField.setBounds(66, 33, 86, 20);
        frame.getContentPane().add(surnameField);
        surnameField.setColumns(10);

        JLabel courseLabel = new JLabel("Curso");
        courseLabel.setBounds(10, 61, 46, 14);
        frame.getContentPane().add(courseLabel);

        courseBox = new JComboBox<>();
        courseBox.setModel(new DefaultComboBoxModel<>(new String[] {"Curso 1", "Curso 2", "Curso 3"}));
        courseBox.setBounds(66, 58, 86, 20);
        frame.getContentPane().add(courseBox);

        addButton = new JButton("Agregar alumno");
        addButton.setBounds(10, 86, 142, 23);
        frame.getContentPane().add(addButton);

        modifyButton = new JButton("Modificar alumno");
        modifyButton.setBounds(162, 86, 142, 23);
        frame.getContentPane().add(modifyButton);

        deleteButton = new JButton("Eliminar alumno");
        deleteButton.setBounds(314, 86, 142, 23);
        frame.getContentPane().add(deleteButton);

        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Todas las celdas no son editables
                return false;
            }
        };

        tableModel.addColumn("Nome");
        tableModel.addColumn("Apelido");
        tableModel.addColumn("Curso");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 120, 414, 130);
        frame.getContentPane().add(scrollPane);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String surname = surnameField.getText();
                String course = (String) courseBox.getSelectedItem();

                // Verificar si ya existe una fila con el mismo nombre, apellido y curso
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    if (name.equals(tableModel.getValueAt(i, 0)) &&
                            surname.equals(tableModel.getValueAt(i, 1)) &&
                            course.equals(tableModel.getValueAt(i, 2))) {
                        // Si existe, mostrar un mensaje de error y retornar
                        JOptionPane.showMessageDialog(frame, "Ya existe una entrada con el mismo nombre, apellido y curso.");
                        return;
                    }
                }

                // Si no existe, agregar la nueva fila
                tableModel.addRow(new Object[]{name, surname, course});
            }
        });
        modifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String name = JOptionPane.showInputDialog(frame, "Ingrese el nuevo nombre", tableModel.getValueAt(selectedRow, 0));
                    String surname = JOptionPane.showInputDialog(frame, "Ingrese el nuevo apellido", tableModel.getValueAt(selectedRow, 1));

                    tableModel.setValueAt(name, selectedRow, 0);
                    tableModel.setValueAt(surname, selectedRow, 1);
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                }
            }
        });
    }
}