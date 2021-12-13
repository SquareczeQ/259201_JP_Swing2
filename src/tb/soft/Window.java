package tb.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Window extends JFrame {

    int xmax=920;
    int ymax=600;

    public Window(String title) throws HeadlessException {
        super(title);
        build_UI();
    }

    private void build_UI() {
        setBounds(0,0,1040,720);
        Kanwa panel=new Kanwa();
        panel.setLayout(null);
        panel.setBounds(0,0,1040,720);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1=new JButton("Uciekinier");

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                    super.mouseEntered(e);
                    if (pointed(e.getX()+20,e.getY()+20))
                        run_away(button1);
                    panel.requestFocus(true);
            }
        });
        panel.add(button1);
        JButton reset=new JButton("Reset");
        reset.addActionListener(e -> bReset(reset, button1, panel));
        panel.add(reset);
        bReset(reset, button1, panel);
    }
    private void bReset(JButton reset,JButton run,Kanwa panel) {
        panel.clear();
        panel.requestFocus(true);
        run.setBounds(240,600,120,50);
        reset.setBounds(800,600,120,50);
    }
    private boolean pointed(int x,int y) {
        return x>=20 && x<=137 && y>0;
    }
    private void run_away(JButton run) {
        int randx= (int) Math.floor(Math.random()*(xmax-0+1)+0);
        int randy= (int) Math.floor(Math.random()*(ymax-0+1)+0);
        run.setBounds(randx,randy,120,50);
    }
}
