package view;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public interface LayerPanel {

	void paint(Graphics2D g);
	void mouseWheelMoved(MouseWheelEvent e);
	void mouseDragged(MouseEvent e);
}
