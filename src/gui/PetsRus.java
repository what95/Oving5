package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import medlemmer.Leverandor;
import varelager.Fisk;
import varelager.LevendeProdukt;
import varelager.Matartikel;
import varelager.Pattedyr;
import varelager.Produkt;
import varelager.Reptil;

public class PetsRus extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6028610435643579053L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel antProder;
	private JLabel matArter;
	private JLabel levProder;
	private JLabel fesker;
	private JLabel rapdyrer;
	private JLabel patdyrer;
	private JLabel antLever;
	private JComboBox<Leverandor> prodLevCB;
	private JComboBox<Leverandor> matLevCB;
	private JComboBox<Produkt> produktCB;
	private JRadioButton rdFisk;
	private JRadioButton rdReptil;
	private JRadioButton rdPat;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetsRus frame = new PetsRus();
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
	public PetsRus() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 542);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFil = new JMenu("Fil");
		menuBar.add(mnFil);
		
		JMenuItem mntmLagre = new JMenuItem("Lagre");
		mnFil.add(mntmLagre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 22, 357, 236);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(120, 11, 126, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 42, 126, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 73, 126, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 137, 126, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 168, 126, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(26, 14, 46, 14);
		panel.add(lblName);
		
		JLabel lblInnkjpsPris = new JLabel("Innkj\u00F8ps Pris:");
		lblInnkjpsPris.setBounds(26, 45, 84, 14);
		panel.add(lblInnkjpsPris);
		
		JLabel lblUtPris = new JLabel("Ut Pris:");
		lblUtPris.setBounds(26, 73, 46, 14);
		panel.add(lblUtPris);
		
		JLabel lblLeverandr = new JLabel("Leverand\u00F8r:");
		lblLeverandr.setBounds(26, 107, 84, 14);
		panel.add(lblLeverandr);
		
		JLabel lblSlektsnavn = new JLabel("Slektsnavn: ");
		lblSlektsnavn.setBounds(26, 137, 84, 14);
		panel.add(lblSlektsnavn);
		
		JLabel lblArtsnavn = new JLabel("Artsnavn:");
		lblArtsnavn.setBounds(26, 168, 73, 14);
		panel.add(lblArtsnavn);
		
		prodLevCB = new JComboBox<>();
		prodLevCB.setBounds(120, 106, 126, 20);
		panel.add(prodLevCB);
		
		JButton btnLeggTil = new JButton("Legg til");
		btnLeggTil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nytt Produkt
				Leverandor loclev = (Leverandor) prodLevCB.getSelectedItem();
				String field1 = textField.getText();
				Double field2 = Double.parseDouble(textField_1.getText());
				Double field3 = Double.parseDouble(textField_2.getText());
				String field4 = textField_4.getText();
				String field5 = textField_5.getText();
				
				if(rdFisk.isSelected()){
					new Fisk(field1, field2, field3, loclev, field4, field5);
				}
				else if(rdPat.isSelected()){
					new Pattedyr(field1, field2, field3, loclev,field4, field5);
				}
				else{
					new Reptil(field1, field2, field3, loclev,field4, field5);
				}
				//oppdatere antall
				oppdaterTall();
				oppdaterLev();
				oppdaterProdselg();
			}
		});
		btnLeggTil.setBounds(21, 202, 89, 23);
		panel.add(btnLeggTil);
		
		rdFisk = new JRadioButton("Fisk");
		rdFisk.setSelected(true);
		buttonGroup.add(rdFisk);
		rdFisk.setBounds(274, 11, 109, 23);
		panel.add(rdFisk);
		
		rdReptil = new JRadioButton("Reptil");
		buttonGroup.add(rdReptil);
		rdReptil.setBounds(274, 41, 109, 23);
		panel.add(rdReptil);
		
		rdPat = new JRadioButton("Pattedyr");
		buttonGroup.add(rdPat);
		rdPat.setBounds(274, 72, 109, 23);
		panel.add(rdPat);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(377, 22, 235, 236);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(99, 80, 126, 20);
		panel_1.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(99, 115, 126, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(99, 11, 126, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(99, 149, 126, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(99, 46, 126, 20);
		panel_1.add(textField_9);
		
		JLabel lblNavn = new JLabel("Navn:");
		lblNavn.setBounds(10, 14, 46, 14);
		panel_1.add(lblNavn);
		
		JLabel lblEpost = new JLabel("Epost:");
		lblEpost.setBounds(10, 49, 46, 14);
		panel_1.add(lblEpost);
		
		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setBounds(10, 83, 46, 14);
		panel_1.add(lblAdresse);
		
		JLabel lblPostSted = new JLabel("Post Sted:");
		lblPostSted.setBounds(10, 152, 79, 14);
		panel_1.add(lblPostSted);
		
		JLabel lblPostNummer = new JLabel("Post nummer:");
		lblPostNummer.setBounds(10, 119, 79, 14);
		panel_1.add(lblPostNummer);
		
		textField_10 = new JTextField();
		textField_10.setBounds(99, 180, 126, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblTlf = new JLabel("Tlf:");
		lblTlf.setBounds(10, 183, 46, 14);
		panel_1.add(lblTlf);
		
		JButton btnLeggTil_1 = new JButton("Legg til");
		btnLeggTil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ny leverandør
				String field1 = textField_7.getText();
				String field2 = textField_9.getText();
				String field3 = textField_3.getText();
				String field4 = textField_6.getText();
				String field5 = textField_8.getText();
				String field6 = textField_10.getText();
				new Leverandor(field1, field2, field3, field4, field5, field6);
				//oppdatere antall
				oppdaterTall();
				//oppdatere levrandør
				oppdaterLev();
			}
		});
		btnLeggTil_1.setBounds(10, 202, 89, 23);
		panel_1.add(btnLeggTil_1);
		
		JLabel lblNyLeverandr = new JLabel("Ny Leverand\u00F8r");
		lblNyLeverandr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNyLeverandr.setBounds(459, 0, 102, 14);
		contentPane.add(lblNyLeverandr);
		
		JLabel lblNyttProdukt = new JLabel("Nytt Produkt");
		lblNyttProdukt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNyttProdukt.setBounds(148, 0, 93, 14);
		contentPane.add(lblNyttProdukt);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 269, 357, 202);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNyMatArtikkel = new JLabel("Ny Mat Artikkel:");
		lblNyMatArtikkel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNyMatArtikkel.setBounds(191, 11, 116, 14);
		panel_2.add(lblNyMatArtikkel);
		
		textField_11 = new JTextField();
		textField_11.setBounds(201, 67, 127, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(201, 98, 127, 20);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(201, 36, 127, 20);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(201, 160, 127, 20);
		panel_2.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNavn_1 = new JLabel("Navn:");
		lblNavn_1.setBounds(99, 42, 72, 14);
		panel_2.add(lblNavn_1);
		
		JLabel lblInnkjpsPris_1 = new JLabel("Innkj\u00F8ps Pris:");
		lblInnkjpsPris_1.setBounds(99, 73, 72, 14);
		panel_2.add(lblInnkjpsPris_1);
		
		JLabel lblUtPris_1 = new JLabel("Ut Pris:");
		lblUtPris_1.setBounds(99, 104, 72, 14);
		panel_2.add(lblUtPris_1);
		
		JLabel lblLeverandr_1 = new JLabel("Leverand\u00F8r:");
		lblLeverandr_1.setBounds(99, 135, 72, 14);
		panel_2.add(lblLeverandr_1);
		
		JLabel lblUtlpsdato = new JLabel("Utl\u00F8psdato:");
		lblUtlpsdato.setBounds(99, 166, 72, 14);
		panel_2.add(lblUtlpsdato);
		
		matLevCB = new JComboBox<>();
		matLevCB.setBounds(201, 129, 126, 20);
		panel_2.add(matLevCB);
		
		JButton btnLeggTil_2 = new JButton("Legg til");
		btnLeggTil_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ny matartikkel
				Leverandor loclev = (Leverandor) matLevCB.getSelectedItem();
				String field1 = textField_14.getText();
				double field2 = Double.parseDouble(textField_11.getText());
				double field3 = Double.parseDouble(textField_12.getText());
				String field5 = textField_15.getText();
				String[] splitField5 = field5.split("-");
				int days = Integer.parseInt(splitField5[0]);
				int month = Integer.parseInt(splitField5[1]);
				int year = Integer.parseInt(splitField5[2]);
				
				GregorianCalendar cal = new GregorianCalendar(days, month, year);
				System.out.println(cal);
				
				new Matartikel(field1, field2, field3, loclev, cal);
				//oppdatere antall
				oppdaterTall();
				oppdaterLev();
				oppdaterProdselg();
				
			}
		});
		btnLeggTil_2.setBounds(0, 97, 89, 23);
		panel_2.add(btnLeggTil_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(377, 269, 235, 203);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblVarelager = new JLabel("Varelager:");
		lblVarelager.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVarelager.setBounds(79, 11, 88, 14);
		panel_3.add(lblVarelager);
		
		JLabel lblProdukter = new JLabel("Produkter:");
		lblProdukter.setBounds(27, 36, 98, 14);
		panel_3.add(lblProdukter);
		
		JLabel lblMatArtikkler = new JLabel("Mat Artikkler:");
		lblMatArtikkler.setBounds(27, 61, 98, 14);
		panel_3.add(lblMatArtikkler);
		
		JLabel lblLevendeProdukter = new JLabel("Levende Produkter:");
		lblLevendeProdukter.setBounds(27, 86, 98, 14);
		panel_3.add(lblLevendeProdukter);
		
		JLabel lblFisk = new JLabel("Fisk:");
		lblFisk.setBounds(27, 111, 98, 14);
		panel_3.add(lblFisk);
		
		JLabel lblReptiler = new JLabel("Reptiler:");
		lblReptiler.setBounds(27, 136, 98, 14);
		panel_3.add(lblReptiler);
		
		JLabel lblPattedyr = new JLabel("Pattedyr:");
		lblPattedyr.setBounds(27, 161, 98, 14);
		panel_3.add(lblPattedyr);
		
		antProder = new JLabel("0");
		antProder.setBounds(145, 36, 46, 14);
		panel_3.add(antProder);
		
		matArter = new JLabel("0");
		matArter.setBounds(145, 61, 46, 14);
		panel_3.add(matArter);
		
		levProder = new JLabel("0");
		levProder.setBounds(145, 86, 46, 14);
		panel_3.add(levProder);
		
		fesker = new JLabel("0");
		fesker.setBounds(145, 111, 46, 14);
		panel_3.add(fesker);
		
		rapdyrer = new JLabel("0");
		rapdyrer.setBounds(145, 136, 46, 14);
		panel_3.add(rapdyrer);
		
		patdyrer = new JLabel("0");
		patdyrer.setBounds(145, 161, 46, 14);
		panel_3.add(patdyrer);
		
		antLever = new JLabel("0");
		antLever.setBounds(201, 86, 46, 14);
		panel_3.add(antLever);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(622, 22, 105, 236);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnSelg = new JButton("Selg");
		btnSelg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//selg Produukt
				Produkt prod = (Produkt) produktCB.getSelectedItem();
				prod.selg();
				
				oppdaterProdselg();
				oppdaterLev();
				oppdaterTall();
			}
		});
		btnSelg.setBounds(10, 202, 89, 23);
		panel_4.add(btnSelg);
		
		produktCB = new JComboBox<>();
		produktCB.setBounds(10, 11, 89, 50);
		panel_4.add(produktCB);
		
		JLabel lblSelgProdukter = new JLabel("Selg Produkter:");
		lblSelgProdukter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelgProdukter.setBounds(622, 2, 105, 14);
		contentPane.add(lblSelgProdukter);
		
		
	}
	private void oppdaterTall(){
		antLever.setText(""+Leverandor.getAntLev());
		antProder.setText(Produkt.getAntProd()+"");
		matArter.setText(Matartikel.getAntMatArt()+"");
		levProder.setText(LevendeProdukt.getAntLevProd()+"");
		rapdyrer.setText(Reptil.getAntReptiler()+"");
		fesker.setText(Fisk.getAntFisk()+"");
		patdyrer.setText(Pattedyr.getAntPattedyr()+"");
	}
	private void oppdaterLev(){
		prodLevCB.removeAllItems();
		matLevCB.removeAllItems();
		for(Leverandor k: Leverandor.getLeverandorliste()){
			prodLevCB.addItem(k);
			matLevCB.addItem(k);
		}
	}
	private void oppdaterProdselg(){
		produktCB.removeAllItems();
		for(Produkt p: LevendeProdukt.getLevendeProduktliste()){
			produktCB.addItem(p);
		}
		for(Produkt p: Matartikel.getMatartikelliste()){
			produktCB.addItem(p);
		}
	}
}
