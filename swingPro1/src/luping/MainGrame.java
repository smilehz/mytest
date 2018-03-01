package luping;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGrame extends JFrame {

	public MainGrame() {
		this.setTitle("µÇÂ¼");
		this.setSize(900, 800);
		// ¾ÓÖÐ²¼¾Ö
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// frameÌí¼ÓÍ¼±ê
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.createImage("D:/360Downloads/images/pig.gif");
		// Image image=kit.createImage("image/login.gif");
		this.setIconImage(image);
		inin();
	}

	public void inin() {
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		this.add(jp);
		
		JButton lu = new JButton();
		lu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Â¼Ïñ
				Luxiang luxiang = new Luxiang();
				
			}
		});
		lu.setIcon(new ImageIcon("D:/360Downloads/images/luxiang.png"));
		lu.setBounds(200, 200, 48, 48);
		jp.add(lu);
		JButton pai = new JButton();
		pai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//½ØÍ¼
				
				
					//CutPicture cutpic = new CutPicture();
				
			}
		});
		pai.setIcon(new ImageIcon("D:/360Downloads/images/paizhao.png"));
		pai.setBounds(500, 200, 48, 48);
		jp.add(pai);
		
	}

}
