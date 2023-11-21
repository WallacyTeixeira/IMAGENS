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

import Model.Vendas;

public class VendasPainel extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField vendaData, vendaModelo, vendaCliente, vendaValor;
    private List<Vendas> vendas;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public VendasPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Vendas"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Data"));
        vendaData = new JTextField(20);
        inputPanel.add(vendaData);
        vendaModelo = new JTextField(20);
        inputPanel.add(new JLabel("Modelo"));
        inputPanel.add(vendaModelo);
        inputPanel.add(new JLabel("Cliente"));
        vendaCliente = new JTextField(20);
        inputPanel.add(vendaCliente);
        inputPanel.add(new JLabel("Valor"));
        vendaValor = new JTextField(20);
        inputPanel.add(vendaValor);
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
                new String[] { "Data", "Modelo", "Cliente", "Valor"});
        table = new JTable(tableModel);
        jSPane.setViewportView(table);
    }
}
