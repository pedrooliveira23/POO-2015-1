package br.com.microsisinformatica;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.MaskFormatter;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import br.com.microsisinformatica.backend.*;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BoxLayout;

import java.awt.Component;
import java.io.IOException;

import javax.swing.UIManager;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMotorista;
	private Tabela tabela = new Tabela();
	private JScrollPane barraRolagem = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/Icones/Truck-26.png")));
		setResizable(false);
		setTitle("Gerenciador de Frota de Veículos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 435);		

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnVeculos = new JMenu("Veículos");
		menuBar.add(mnVeculos);

		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JPanel panelEntrada = new JPanel();
		panelEntrada.setBackground(UIManager.getColor("Button.focus"));
		contentPane.add(panelEntrada);
		panelEntrada.setLayout(new GridLayout(0, 2, 20, 20));

		JLabel lblMotorista = new JLabel("Motorista:");
		lblMotorista.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panelEntrada.add(lblMotorista);

		textFieldMotorista = new JTextField();
		textFieldMotorista.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		textFieldMotorista.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelEntrada.add(textFieldMotorista);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panelEntrada.add(lblTipo);

		final JComboBox<String> comboBoxTipo = new JComboBox<String>();
		comboBoxTipo.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		comboBoxTipo.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Caminhão", "Carro", "Moto" }));
		panelEntrada.add(comboBoxTipo);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panelEntrada.add(lblPlaca);

		MaskFormatter placa;
		final JFormattedTextField formattedTextFieldPlaca;

		try {			
			placa = new MaskFormatter("???-####");
			formattedTextFieldPlaca = new JFormattedTextField(placa);
			formattedTextFieldPlaca.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			panelEntrada.add(formattedTextFieldPlaca);

			JPanel panelLista = new JPanel();
			panelLista.setBorder(null);
			panelLista.setBackground(UIManager.getColor("Button.focus"));
			panelLista.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			contentPane.add(panelLista);
			panelLista.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

			final JButton btnAdicionar = new JButton("Adicionar");
			btnAdicionar.setBackground(UIManager.getColor("Button.highlight"));
			btnAdicionar.setFont(new Font("Dialog", Font.BOLD, 10));
			btnAdicionar.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Plus-50.png")));
			panelLista.add(btnAdicionar);

			JButton btnEditar = new JButton("Editar");
			btnEditar.setBackground(UIManager.getColor("Button.highlight"));
			btnEditar.setFont(new Font("Dialog", Font.BOLD, 10));
			btnEditar.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Pencil-24.png")));
			btnEditar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					editarAction(formattedTextFieldPlaca, comboBoxTipo,
							textFieldMotorista);
				}
			});
			
						JButton btnPesquisar = new JButton("Pesquisar");
						btnPesquisar.setBackground(UIManager.getColor("Button.highlight"));
						btnPesquisar.setFont(new Font("Dialog", Font.BOLD, 10));
						btnPesquisar.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Search-24.png")));
						btnPesquisar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								pesquisarAction(formattedTextFieldPlaca);
							}
						});
						panelLista.add(btnPesquisar);

			panelLista.add(btnEditar);

			JButton btnRemover = new JButton("Remover");
			btnRemover.setBackground(UIManager.getColor("Button.highlight"));
			btnRemover.setFont(new Font("Dialog", Font.BOLD, 10));
			btnRemover.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Minus-24.png")));
			btnRemover.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					removerAction(formattedTextFieldPlaca);
				}
			});
			panelLista.add(btnRemover);

			btnAdicionar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adicionarAction(formattedTextFieldPlaca, comboBoxTipo,
							textFieldMotorista);
				}
			});

			JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
			mntmAdicionar.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Plus-50.png")));
			mntmAdicionar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adicionarAction(formattedTextFieldPlaca, comboBoxTipo,
							textFieldMotorista);
				}
			});
			mnVeculos.add(mntmAdicionar);

			JMenuItem mntmPesquisar = new JMenuItem("Pesquisar");
			mntmPesquisar.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Search-24.png")));
			mntmPesquisar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pesquisarAction(formattedTextFieldPlaca);
				}
			});
			mnVeculos.add(mntmPesquisar);

			JMenuItem mntmRemover = new JMenuItem("Remover");
			mntmRemover.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Minus-24.png")));
			mntmRemover.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					removerAction(formattedTextFieldPlaca);
				}
			});
			
						JMenuItem mntmEditar = new JMenuItem("Editar");
						mntmEditar.setIcon(new ImageIcon(Principal.class.getResource("/Icones/Pencil-24.png")));
						mntmEditar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								editarAction(formattedTextFieldPlaca, comboBoxTipo,
										textFieldMotorista);
							}
						});
						
									mnVeculos.add(mntmEditar);
			mnVeculos.add(mntmRemover);

			tabela.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent event) {
							textFieldMotorista.setText(tabela.getValueAt(
									tabela.getSelectedRow(), 2).toString());
							switch (tabela.getValueAt(tabela.getSelectedRow(),
									1).toString()) {
							case "Caminhão":
								comboBoxTipo.setSelectedIndex(0);
								break;
							case "Carro":
								comboBoxTipo.setSelectedIndex(1);
								break;
							case "Moto":
								comboBoxTipo.setSelectedIndex(2);
							}
							formattedTextFieldPlaca.setText(tabela.getValueAt(
									tabela.getSelectedRow(), 0).toString());
						}
					});
			barraRolagem.setAlignmentY(Component.BOTTOM_ALIGNMENT);

			barraRolagem.setViewportView(tabela);
			contentPane.add(barraRolagem);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void adicionarAction(JFormattedTextField formattedTextFieldPlaca,
			JComboBox<String> comboBoxTipo, JTextField textFieldMotorista) {
		if (!textFieldMotorista.getText().equals("")) {
			if (!formattedTextFieldPlaca.getText().equals("   -    ")) {
				if (tabela.pesquisar(formattedTextFieldPlaca.getText()
						.toUpperCase()) > -1) {
					JOptionPane
							.showMessageDialog(
									null,
									"Este veículo já existe na tabela! Use o botão editar se desejar fazer alguma alteração.");
					tabela.setRowSelectionInterval(tabela
							.pesquisar(formattedTextFieldPlaca.getText()
									.toUpperCase()), tabela
							.pesquisar(formattedTextFieldPlaca.getText()
									.toUpperCase()));
				} else {
					tabela.inserir(formattedTextFieldPlaca.getText()
							.toUpperCase(), comboBoxTipo.getSelectedItem()
							.toString(), textFieldMotorista.getText());

					formattedTextFieldPlaca.setText("");
					textFieldMotorista.setText(null);
					comboBoxTipo.setSelectedIndex(0);
				}
			} else {
				JOptionPane.showMessageDialog(null,
						"O campo 'Placa' não pode estar em branco!");
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"O campo 'Motorista' não pode estar em branco!");
		}
	}

	public void pesquisarAction(JFormattedTextField formattedTextFieldPlaca) {
		if (!formattedTextFieldPlaca.getText().equals("   -    ")) {
			tabela.setRowSelectionInterval(
					tabela.pesquisar(formattedTextFieldPlaca.getText()
							.toUpperCase()), tabela
							.pesquisar(formattedTextFieldPlaca.getText()
									.toUpperCase()));
		} else {
			JOptionPane
					.showMessageDialog(
							null,
							"A pesquisa deve ser feita a partir da placa do veículo. O campo 'Placa' não pode estar vazio.");
		}
	}

	public void editarAction(JFormattedTextField formattedTextFieldPlaca,
			JComboBox<String> comboBoxTipo, JTextField textFieldMotorista) {
		if (!formattedTextFieldPlaca.getText().equals("   -    ")) {
			if (formattedTextFieldPlaca.getText().equals(
					tabela.getValueAt(tabela.getSelectedRow(), 0))) {
				tabela.editar(formattedTextFieldPlaca.getText(), comboBoxTipo
						.getSelectedItem().toString(), textFieldMotorista
						.getText(), tabela.getSelectedRow());
			} else {
				JOptionPane.showMessageDialog(null,
						"O campo 'Placa' não pode ser editado.");
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Nenhum veículo está selecionado.");
		}
	}

	public void removerAction(JFormattedTextField formattedTextFieldPlaca) {
		if (!formattedTextFieldPlaca.getText().equals("   -    ")) {
			tabela.remover(tabela.getSelectedRow(), formattedTextFieldPlaca.getText());
			barraRolagem.repaint();
		} else {
			JOptionPane.showMessageDialog(null,
					"Nenhum veículo está selecionado.");
		}
	}
}