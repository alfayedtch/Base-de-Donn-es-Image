import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JSpinner;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Informations de l'image");
		panel.setBounds(437, 13, 733, 533);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(169, 169, 169));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(295, 52, 400, 400);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4_1 = new JButton("-");
		btnNewButton_4_1.setBounds(345, 345, 41, 40);
		panel_2.add(btnNewButton_4_1);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setBounds(345, 275, 41, 40);
		panel_2.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(0, 0, 400, 400);
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(211, 211, 211));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(23, 69, 231, 282);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("InfoImage 1");
		lblNewLabel_2_1.setBounds(0, 0, 142, 30);
		panel_5.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("InfoImage 2");
		lblNewLabel_2_1_1.setBounds(0, 61, 142, 30);
		panel_5.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("InfoImage 3");
		lblNewLabel_2_1_2.setBounds(0, 120, 142, 30);
		panel_5.add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("InfoImage 4");
		lblNewLabel_2_1_3.setBounds(0, 183, 142, 30);
		panel_5.add(lblNewLabel_2_1_3);
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("InfoImage 5");
		lblNewLabel_2_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_3_1.setBounds(0, 239, 142, 30);
		panel_5.add(lblNewLabel_2_1_3_1);
		
		JButton btnNewButton_1 = new JButton("Suivant");
		btnNewButton_1.setBounds(364, 495, 129, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Pr\u00E9c\u00E9dent");
		btnNewButton.setBounds(184, 495, 129, 25);
		panel.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 13, 413, 533);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 105, 413, 428);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("New label");
		scrollPane.setColumnHeaderView(label);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 274, 40);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("New button");
		button.setBounds(349, 42, 11, -53);
		panel_3.add(button);
		
		JButton btnNewButton_2 = new JButton("Parcourir");
		btnNewButton_2.setBounds(298, 21, 97, 25);
		panel_3.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Liste des images");
		lblNewLabel_1.setBounds(123, 78, 108, 25);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(32, 559, 1124, 60);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Filtre 1");
		btnNewButton_3.setBounds(0, 0, 102, 60);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Filtre 2");
		btnNewButton_3_1.setBounds(102, 0, 102, 60);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Filtre 3");
		btnNewButton_3_2.setBounds(203, 0, 102, 60);
		panel_1.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("Filtre 4");
		btnNewButton_3_3.setBounds(304, 0, 102, 60);
		panel_1.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("Filtre 5");
		btnNewButton_3_4.setBounds(406, 0, 102, 60);
		panel_1.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("Filtre 6");
		btnNewButton_3_5.setBounds(509, 0, 102, 60);
		panel_1.add(btnNewButton_3_5);
		
		JButton btnNewButton_3_6 = new JButton("Filtre 7");
		btnNewButton_3_6.setBounds(612, 0, 102, 60);
		panel_1.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("Filtre 9");
		btnNewButton_3_7.setBounds(715, 0, 102, 60);
		panel_1.add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton("Filtre 10");
		btnNewButton_3_8.setBounds(817, 0, 102, 60);
		panel_1.add(btnNewButton_3_8);
		
		JButton btnNewButton_3_9 = new JButton("Filtre 11");
		btnNewButton_3_9.setBounds(919, 0, 102, 60);
		panel_1.add(btnNewButton_3_9);
		
		JButton btnNewButton_3_10 = new JButton("Filtre 12");
		btnNewButton_3_10.setBounds(1021, 0, 102, 60);
		panel_1.add(btnNewButton_3_10);
	}
}
