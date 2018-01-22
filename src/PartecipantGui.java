
import jade.core.AID;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PartecipantGui extends JFrame {	
	private PartecipantAgent myAgent;
	
	private JTextField dateField;
	
	PartecipantGui(PartecipantAgent partecipantAgent) {
		super(partecipantAgent.getLocalName());
		
		myAgent = partecipantAgent;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 3));
		p.add(new JLabel("Propose date day:"));
		dateField = new JTextField(15);
		p.add(dateField);
		getContentPane().add(p, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Start propose to others");
		addButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					String date = dateField.getText().trim();
					//myAgent.updateCatalogue(title, totalPrice);
					dateField.setText("");
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(PartecipantGui.this, "Invalid values. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		} );
		p = new JPanel();
		p.add(addButton);
		getContentPane().add(p, BorderLayout.SOUTH);
		
		addWindowListener(new	WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				myAgent.doDelete();
			}
		} );
		
		setResizable(false);
	}
	
	public void display() {
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int)screenSize.getWidth() / 2;
		int centerY = (int)screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		setVisible(true);
	}	
}
