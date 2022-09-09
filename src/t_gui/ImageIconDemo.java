package t_gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo(){
        //获取图片地址
        JLabel label =new JLabel("ImageIcon");
        URL url = ImageIconDemo.class.getResource("C:/Users/31450/Desktop/b82b308cf85b395e808449641f3f332.jpg.png");
        ImageIcon imageIcon = new ImageIcon(url);//命名不要重复
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,200,200);


    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}