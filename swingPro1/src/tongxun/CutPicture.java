package tongxun;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFileChooser;
import javax.swing.JWindow;

public class CutPicture extends JWindow {
	/**
	 * ��ʼ����x,y;��������x,y
	 */
	private int orgx;
	private int orgy;
	private int endx;
	private int endy;
	private BufferedImage image;
	
	public CutPicture() throws AWTException {
		//��ȡ��Ļ�ߴ�(Dimension����ͼƬ�ĳߴ�,Toolkit �����һЩ������ֱ�Ӳ�ѯ��������ϵͳ)
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screensize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// ��꿪ʼ����
				orgx = e.getX();
				orgy = e.getY();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// ���ͣ��
				JFileChooser jfc = new JFileChooser();
				
			}
			

			@Override
			public void mouseDragged(MouseEvent e) {
				// �����ק����
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseMoved(e);
			}

			
		});
}

	
}