package t_gui;


import java.awt.*;

public class ExDmoe {
    public static void main(String[] args) {
        //总的Frame
        Frame frame = new Frame("Ex");
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400,400);
        frame.setLocation(300,300);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);

        //4.四个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        //上面
        p1.add(new Button("East-1"),BorderLayout.EAST);
        p1.add(new Button("West-1"),BorderLayout.WEST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));
        p1.add(p2,BorderLayout.CENTER);

        //下面
        p3.add(new Button("East-2"),BorderLayout.EAST);
        p3.add(new Button("West-2"),BorderLayout.WEST);
        //中间的四个
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("for-"+i));
        }
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);

    }
}
