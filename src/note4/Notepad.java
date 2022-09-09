package note4;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad {
 //类的成员位置，定义出需要的容器和组件
 private Frame frm;
 private TextArea ta;
 private MenuBar bar;
 private Menu file ;
 private MenuItem open,save;
 private FileDialog fd;
 private File f;
 //需要两个静态成员，表示屏幕的分辨率
 private static int w = Toolkit.getDefaultToolkit().getScreenSize().width;
 private static int h = Toolkit.getDefaultToolkit().getScreenSize().height;
 
 public Notepad(){
  init();
 }
 
 //定义方法完成界面的制作效果
 private void init(){
  //对窗体设置
  frm = new Frame("记事本");
  frm.setSize(600, 400);
  frm.setLocation((w-600)/2, (h-400)/2);
  frm.setVisible(true);
  frm.setLayout(null);
  
  
  //初始化菜单
  bar = new MenuBar();
  file = new Menu("文件");
  open = new MenuItem("打开");
  save = new MenuItem("保存");
  
  frm.setMenuBar(bar);
  bar.add(file);
  file.add(open);
  file.add(save);
  
  //设置多行文本
  ta = new TextArea();
  ta.setSize(590,344);
  ta.setLocation(5, 50);
  frm.add(ta);
  event();
 }
 
 //定义方法，写菜单事件监听
 private void event(){
  //窗体关闭事件
  frm.addWindowListener(new WindowAdapter() {
   public void windowClosing(WindowEvent e){
    System.exit(0);
   }
  });
  //保存菜单事件
  save.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    //出不出对话框，前提，只要文件曾经打开过，就不出
    if(f==null){
    //创建文件对话框
    fd = new FileDialog(frm,"保存文件",FileDialog.SAVE);
    fd.setVisible(true);
    }
    //获取选择的路径和文件名
    String dir = fd.getDirectory();
    String fileName = fd.getFile();
    if(dir == null || fileName == null)
     return ;
    File f = new File(dir,fileName);
    saveFile(f);
   }
  });
  
  ta.addKeyListener(new KeyAdapter() {
   public void keyPressed(KeyEvent e ){
    
    }
   }
 );
  //打开菜单事件
  open.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) { 
    //创建文件对话框对象
    fd = new FileDialog(frm,"打开文件");
    fd.setVisible(true);
    //获取到用户选择的文件
    // String getDirectory() String getFile() 
    String dir = fd.getDirectory();
    String fileName = fd.getFile();
    if(dir == null || fileName == null)
     return ;
    //用户点击了一个确切文件，和打开
    f = new File(dir,fileName);
    //IO流读取文件，读取一行，向多行文本中，添加一行
    openFile(f);
    
   }
  });
 }
 //定义方法，实现IO流写文件，将多行文本中的内容写到文件中
 private void saveFile(File f){
  PrintWriter pw  = null;
  try{
   pw = new PrintWriter(new FileWriter(f),true);
   pw.println(ta.getText());
  }catch(IOException e){
   
  }finally{
   if(pw!=null)
    pw.close();
  }
 }
 
 
 //定义方法，实现IO流读取指定文件，添加到多行文本中
 private void openFile(File f){
  BufferedReader bfr = null;
  try{
   bfr = new BufferedReader(new FileReader(f));
   String line = null;
   //清空原有多行文本中的数据
   ta.setText("");
   while((line = bfr.readLine())!=null){
    ta.append(line+"\r\n");
   }
  }catch(IOException e){
   
  }finally{
   try{
    if(bfr!=null)
     bfr.close();
   }catch(IOException e){
    
   }
  }
 }
}
