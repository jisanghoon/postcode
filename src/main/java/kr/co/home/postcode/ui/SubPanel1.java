package kr.co.home.postcode.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.table.DefaultTableModel;

import kr.co.home.postcode.dto.Postcode;
import kr.co.home.postcode.service.PostcodeService;

public class SubPanel1 extends JPanel implements ActionListener {
	
	private JTextField textField;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JPanel contentPanel;
	private MainFrame frame;
	private int cnt = 0;
	private JTable table;
	private JScrollPane scrollPane;
	
	public SubPanel1(MainFrame frame) {
		this.frame = frame;
		setLayout(new BorderLayout(0, 0));

		contentPanel = new JPanel();
		add(contentPanel, BorderLayout.CENTER);

		JPanel inputPanel = new JPanel();
		add(inputPanel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("시도");
		inputPanel.add(lblNewLabel);

		comboBox = new JComboBox();
		comboBox.setMaximumRowCount(20);
		inputPanel.add(comboBox);
		

		JLabel lblNewLabel_1 = new JLabel("도로명");
		inputPanel.add(lblNewLabel_1);

		textField = new JTextField();
		inputPanel.add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(this);
		inputPanel.add(btnNewButton);
		
		setCmbList();
	}

	//콤보박스 리스트 input
	public void setCmbList() {
		List<String> list=PostcodeService.getInstance().selectSido();
		for (int i = 0; i < list.size(); i++) {
			comboBox.addItem(list.get(i).trim());	
		}
		
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			btnNewButtonActionPerformed(arg0);
		}
	}


	protected void btnNewButtonActionPerformed(ActionEvent arg0) {
		
		String sido = comboBox.getSelectedItem().toString().trim();
		String doro = textField.getText().trim();

		if (cnt == 0) {
			
			
			scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			
			Postcode temp = new Postcode();
			temp.setSido(sido);
			temp.setDoro(doro);

			List<Postcode> listItem = PostcodeService.getInstance().selectCodeWithAddressBySidoAndDoro(temp);

			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);

			table = new JTable();
			scrollPane.setViewportView(table);

			String[][] datas = new String[listItem.size()][];
			for (int i = 0; i < listItem.size(); i++) {
				datas[i] = listItem.get(i).toArray();
			}

			DefaultTableModel model = new DefaultTableModel(datas, new String[] { "우편번호", "주소" });
			table.setModel(model);
			
			revalidate();
			cnt++;

		} else if (cnt == 1) {
			int selectRow = table.getSelectedRow();
			int columnCnt = table.getColumnCount();

			String[] temps = new String[columnCnt];
			for (int i = 0; i < columnCnt; i++) {
				temps[i] = (String)(table.getValueAt(selectRow, i));
			}

			this.setVisible(false);
			frame.getPanel().setVisible(true);
			frame.setSize(440, 255);
			frame.setLocationRelativeTo(null);
			revalidate();
			
			frame.getTxtZipcode().setText(temps[0]);
			frame.getTxtAddress().setText(temps[1]);
			
			cnt++;
			if (cnt == 2) {
				cnt = 0;
			}
		}
	}
}
