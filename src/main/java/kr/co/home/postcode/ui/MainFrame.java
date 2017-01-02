package kr.co.home.postcode.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtZipcode;
	private JTextField txtAddress;
	private JTextField txtAddressDetail;
	private JButton btnResearch;
	private JButton btnEnro;
	private JPanel panel;
	private SubPanel1 subPanel;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("우편번호");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(440, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblZipcode = new JLabel("우편번호");
		lblZipcode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZipcode.setBounds(48, 37, 57, 15);
		panel.add(lblZipcode);
		
		JLabel lblAddress = new JLabel("주소");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setBounds(48, 79, 57, 15);
		panel.add(lblAddress);
		
		JLabel lblAddressDetail = new JLabel("세부 주소");
		lblAddressDetail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddressDetail.setBounds(48, 119, 57, 15);
		panel.add(lblAddressDetail);
		
		txtZipcode = new JTextField();
		txtZipcode.setBounds(133, 34, 116, 21);
		panel.add(txtZipcode);
		txtZipcode.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(133, 76, 244, 21);
		panel.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtAddressDetail = new JTextField();
		txtAddressDetail.setBounds(133, 116, 116, 21);
		panel.add(txtAddressDetail);
		txtAddressDetail.setColumns(10);
		
		btnResearch = new JButton("우편번호 검색");
		btnResearch.addActionListener(this);
		btnResearch.setBounds(261, 33, 116, 23);
		panel.add(btnResearch);
		
		btnEnro = new JButton("등록");
		btnEnro.addActionListener(this);
		btnEnro.setBounds(133, 157, 244, 23);
		panel.add(btnEnro);
		
		setLocationRelativeTo(null);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnro) {
			btnEnroActionPerformed(e);
		}
		if (e.getSource() == btnResearch) {
			btnResearchActionPerformed(e);
		}
	}
	protected void btnResearchActionPerformed(ActionEvent e) {
		
		subPanel = new SubPanel1(this);
		panel.setVisible(false);
		//revalidate();
		getContentPane().add(subPanel, BorderLayout.CENTER);
		revalidate();
		
		setSize(800, 600);
		setLocationRelativeTo(null);
		repaint();
		
		
		
		
		
	}
	protected void btnEnroActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, getTxtZipcode().getText()+" "+getTxtAddress().getText()+", "+getTxtAddressDetail().getText());
	}

	
	public JTextField getTxtAddressDetail() {
		return txtAddressDetail;
	}

	public JTextField getTxtZipcode() {
		return txtZipcode;
	}

	public JTextField getTxtAddress() {
		return txtAddress;
	}


	public JPanel getPanel() {
		return panel;
	}


	
}
