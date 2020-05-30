package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.ControllerConverter;

public class View {
	static ControllerConverter controller;
	public static void main(String[] args) {
		new Thread(T).start();
		
	}
	
	private static Runnable T = new Runnable() {
		
		@Override
		public void run() {
			controller = new ControllerConverter();
			
			JFrame frame = new JFrame();
			
			
			
			JTextField textBin = new JTextField();
			JTextField textDec = new JTextField();
			JTextField textHex = new JTextField();
			
			JButton btnBin = new JButton();
			JButton btnDec = new JButton();
			JButton btnHex = new JButton();
			
			Font font = new Font("Arial", Font.PLAIN, 30);
			Font fontBtn = new Font("Arial", Font.PLAIN, 20);
			
			textBin.setBounds(10, 20, 500, 50);
			textBin.setFont(font);
			
			textDec.setBounds(10, 100, 500, 50);
			textDec.setFont(font);
			
			textHex.setBounds(10, 180, 500, 50);
			textHex.setFont(font);
			
			btnBin.setText("Binary Converter");
			btnBin.setBounds(550, 20, 200, 50);
			btnBin.setFont(fontBtn);
			btnBin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textDec.setText(Integer.toString(controller.BinaryToDecimal(textBin.getText())));
					textHex.setText(controller.BinaryToHexa(textBin.getText()));
				}
			});
			
			btnDec.setText("Decimal Converter");
			btnDec.setBounds(550, 100, 200, 50);
			btnDec.setFont(fontBtn);
			btnDec.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textBin.setText(controller.DecimalToBinary(Integer.parseInt(textDec.getText())));
					textHex.setText(controller.DecimalToHexa(Integer.parseInt(textDec.getText())));
				}
			});
			
			btnHex.setText("Hex Converter");
			btnHex.setBounds(550, 180, 200, 50);
			btnHex.setFont(fontBtn);
			btnHex.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textBin.setText(controller.HexaToBinary(textHex.getText()));
					textDec.setText(Integer.toString(controller.HexaToDecimal(textHex.getText())));
				}
			});
			
			frame.setSize(800, 300);
			frame.setTitle("Converter");
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			frame.getContentPane().setBackground(Color.GRAY);
			frame.add(textBin);
			frame.add(textDec);
			frame.add(textHex);
			frame.add(btnBin);
			frame.add(btnDec);
			frame.add(btnHex);
			frame.setLayout(null);
			frame.setVisible(true);
			
		}
	};
}
