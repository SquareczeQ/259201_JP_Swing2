package tb.soft;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Kanwa extends JPanel implements MouseInputListener {
    private int x=0;
    private int y=0;
    private int xpoints[]={0,20,40};
    private int ypoints[]={0,20,40};
    private int draw=0;

    public Kanwa() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyChar()=='s') {
                    draw=1;
                }
                if(e.getKeyChar()=='o') {
                    draw=2;
                }
            }
        });
        addMouseListener(this);
    }
    public void paint(Graphics shape) {
        super.paint(shape);
        if(draw==1) {
            shape.fillRect(x,y,50,50);
        }
        if(draw==2) {
            shape.fillOval(x,y,50,50);
        }
        repaint();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    public void clear() {
        draw=0;
        repaint();
    }
}
