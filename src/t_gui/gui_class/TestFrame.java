package t_gui.gui_class;

import java.awt.*;
import java.awt.event.*;

import org.w3c.dom.events.MouseEvent;

public class TestFrame {
    public static void main(String[] args){
        Frame f = new Frame("test");
        f.setSize(500, 500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                Window w = e.getWindow();
                w.dispose();
            }

            public void windowClosed(WindowEvent e){
                System.out.println("close");
            }

            
        });
        /*事件源.addXXXListener(new XXXAdapter(){
            public void ###(XXXEvent e){

            }
        }) */
        Button btn =new Button("确定");
        btn.setSize(10,23);
        btn.setLocation(100,100);
        f.setLayout(null);
        f.add(btn);
        btn.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e){
                System.out.println("mousePressed");
            }
            
        });
    }
}
