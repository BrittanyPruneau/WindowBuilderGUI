package windowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoWindowBuilder extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoWindowBuilder frame = new DemoWindowBuilder();
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
	public DemoWindowBuilder() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Button 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("Button 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setActionCommand("Button 2");
		contentPane.add(btnNewButton_1, BorderLayout.NORTH);
		
		JPanel mainPanel = new JPanel(); 
		contentPane.add(mainPanel, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("Content 1");
		mainPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Content 2");
		mainPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Content with a long name 3");
		mainPanel.add(btnNewButton_4);
		
	}
}
