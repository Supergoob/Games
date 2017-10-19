package Chess;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {
	public static void main(String[] args) {
		JFrame theBoard = new JFrame();
		theBoard.setTitle("chess Board");
		theBoard.setSize(1200,700);
		theBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = theBoard.getContentPane();
		pane.setLayout(new GridLayout(8,8));
		JPanel[] grid=new JPanel[64];
		for(int i=0;i<64;i++){
			JPanel panel=new JPanel();
			grid[i]=panel;
			if(i<8||i>=16&&i<24||i>=32&&i<40||i>=48&&i<56){
				if(i%2!=0){
			panel.setBackground(Color.BLACK);
				}else{
					panel.setBackground(Color.WHITE);
				}
			}else{
				if(i%2!=0){
				panel.setBackground(Color.WHITE);
				}else{
					panel.setBackground(Color.BLACK);
				}
			}
			pane.add(panel);
		}
		theBoard.setVisible(true);
		
	}
}
