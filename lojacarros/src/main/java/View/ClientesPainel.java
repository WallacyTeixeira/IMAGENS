package View;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.CarrosDAO;
import Controller.CarrosControl;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import Model.Clientes;

public class ClientesPainel extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField clientNome, clientEndereço, clientNumeroTelefone, clientCPF;
    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public ClientesPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Cliente"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nome"));
        clientNome = new JTextField(20);
        inputPanel.add(clientNome);
        clientEndereço = new JTextField(20);
        inputPanel.add(new JLabel("Endereço"));
        inputPanel.add(clientEndereço);
        inputPanel.add(new JLabel("Numero de Telefone"));
        clientNumeroTelefone = new JTextField(20);
        inputPanel.add(clientNumeroTelefone);
        inputPanel.add(new JLabel("CPF"));
        clientCPF = new JTextField(20);
        inputPanel.add(clientCPF);
        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));

        add(botoes);
        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Endereço", "Numero de Telefone", "CPF"});
        table = new JTable(tableModel);
        jSPane.setViewportView(table);
    }
}
