package Calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface {

	public static void main(String[] args) {
		JFrame Interface= new JFrame();
		Interface.setTitle("Calculator");
		Interface.setSize(400,500);
		Interface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = Interface.getContentPane();
		pane.setLayout(new GridLayout(5,4));
		JPanel[] grid=new JPanel[20];
		for (int i=0;i<grid.length;i++){
			JPanel panel=new JPanel();
			grid[i]=panel;
			if(i/4<1){
				panel.setBackground(Color.GRAY);
			}else if(i/4<2){
				if(i%4%2==0){
					panel.setBackground(new Color(99, 255, 133));
				}else{
					panel.setBackground(new Color(19, 255, 15));
				}
			}else if(i/4<3){
				if(i%4%2==0){
					panel.setBackground(new Color(19, 255, 15));
				}else{
					panel.setBackground(new Color(99, 255, 133));
				}
				
			}else if(i/4<4){
				if(i%4%2==0){
					panel.setBackground(new Color(99, 255, 133));
				}else{
					panel.setBackground(new Color(19, 255, 15));
				}
				
			}else{
				if(i==16||i==17){
					panel.setBackground(new Color(66, 134, 244));
				}
				else if(i%4%2==0){
					panel.setBackground(new Color(19, 255, 15));
				}else{
					panel.setBackground(new Color(99, 255, 133));
				}
				
			}
			pane.add(panel);
		}
		Interface.setVisible(true);
	}

}
