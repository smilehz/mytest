package luping;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JWindow;

public class CutPicture extends JWindow {
	/**
	 * ��ʼ����x,y;��������x,y������ͼƬ�������ͼƬ
	 */
	private int orgx;
	private int orgy;
	private int endx;
	private int endy;
	private BufferedImage image;
	private BufferedImage saveimage;
	public CutPicture() throws AWTException {
		//��ȡ��Ļ�ߴ�(Dimension����ͼƬ�ĳߴ�,Toolkit �����һЩ������ֱ�Ӳ�ѯ��������ϵͳ)
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screensize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//iuhiuiyoioui
			}
		});
	}
	
	
	

}
