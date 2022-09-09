package notebook_t;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.datatransfer.*;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;

import notebook_t.TextTool; 



public class TextPad {
	JTextArea contentArea;
	
	JFrame frame;

	String fileName;

	public TextPad() {
		frame = new JFrame("记事本");
		frame.setSize(800, 600);
		frame.setLocation(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 添加菜單
		JMenuBar menuBar = new JMenuBar();

		JMenu menu = new JMenu("文件");//文件
		JMenuItem newItem = new JMenuItem("新建");
		newAction(newItem);
		menu.add(newItem);

		JMenuItem openItem = new JMenuItem("打开");
		openAction(openItem);
		menu.add(openItem);

		JMenuItem saveItem = new JMenuItem("保存");
		saveAction(saveItem);
		menu.add(saveItem);

		menuBar.add(menu);

		JMenu menu2 =new JMenu("编辑");//编辑

		JMenuItem selectAllItem =new JMenuItem("全选");
		selectAllAction(selectAllItem);
		menu2.add(selectAllItem);


		JMenuItem copyItem =new JMenuItem("复制");
		copyAction(copyItem);
		menu2.add(copyItem);

		JMenuItem cutItem = new JMenuItem("剪切");
		cutAction(cutItem);
		menu2.add(cutItem);

		JMenuItem pasteItem = new JMenuItem("粘贴");
		pasteAction(pasteItem);
		menu2.add(pasteItem);

		menuBar.add(menu2);

		frame.setJMenuBar(menuBar);

		// 布局
		frame.setLayout(new BorderLayout());

		JToolBar toolBar = new JToolBar();
		JComboBox<String> fontCom = fontAction();
		toolBar.add(fontCom);
		JComboBox<String> fontSize = fontSizeAction();
		toolBar.add(fontSize);

		fontStyleAction(toolBar);
		
		JButton colorbtn = fontColorAction();
		toolBar.add(colorbtn);

		frame.add(toolBar, BorderLayout.NORTH);


		// 添加查找框
		JLabel findText = new JLabel("查找:");
        toolBar.add(findText);
		
		JTextField findTextField = new JTextField();
        toolBar.add(findTextField);

		JButton btn1 = new JButton("查找");
		findTextAction(btn1, findTextField);
        toolBar.add(btn1);  

		

		

        // 添加替换框
        JLabel replaceText = new JLabel("替换:");
        toolBar.add(replaceText);

        JTextField replaceTextField = new JTextField();
        toolBar.add(replaceTextField);

		JButton btn2 = new JButton("替换");
		replaceAction(btn2, replaceTextField, findTextField);
        toolBar.add(btn2);

		// 文件编辑区
		contentArea = new JTextArea();
		JScrollPane pane = new JScrollPane(contentArea);
		frame.add(pane);
		frame.setVisible(true);
		//图标
		ImageIcon ii = new ImageIcon("b82b308cf85b395e808449641f3f332.jpg");
		

	}

	private JButton fontColorAction() {
		JButton colorbtn = new JButton("■");
		colorbtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Color color = colorbtn.getForeground();
				Color co = JColorChooser.showDialog(TextPad.this.frame, "设置字体颜色", color);
                colorbtn.setForeground(co);
                contentArea.setForeground(co);
			}
		});
		return colorbtn;
	}

	//查找
	private void findTextAction(JButton btn1, JTextField findTextField) {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				// 获取文本框中所有内容
                String text = contentArea.getText();
                // 获取查找框的文本内容
                String findWords =  findTextField.getText();
                // 不为空，则进行查找
                if(findWords != null && !findWords.isEmpty()) {
                    // 清空原来的内容
                    contentArea.setText("");
                    contentArea.append(text);
                } else {
                    findTextField.setText("请输入查找内容");
                }
			}
		});
	}
	//替换
	private void replaceAction(JButton btn2, JTextField replaceTextField, JTextField findTextField) {
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				// 获取文本框中所有内容
                String text = contentArea.getText();
                // 获取查找框的文本内容
                String findWords =  findTextField.getText();
                // 获取替换框的文本内容
                String replaceWords = replaceTextField.getText();
                // 不为空，则进行替换
                if(findWords != null && !findWords.isEmpty() && replaceWords != null && !replaceWords.isEmpty()) {
                    System.out.println("text1 = " + text);
                    // 进行替换
                    text = text.replaceAll(findWords, replaceWords);
                    System.out.println("text2 = " + text);
                    // 清空原来的内容
                    contentArea.setText("");
                    contentArea.append(text);
                } else {
                    replaceTextField.setText("请输入替换内容");
                }
			}
		});
	}
	//全选
	private void selectAllAction(JMenuItem selectAllItem){
		selectAllItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				contentArea.selectAll();
			}
		});
	}
	//剪切
	private void cutAction(JMenuItem cutItem){
		cutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();//调用文件工具箱下的系统剪贴板方法
				String text = contentArea.getSelectedText();  //将得到的选择文本内容存入text中
				StringSelection selection= new StringSelection(text);
				clipboard.setContents(selection,null);//将得到的内容放入到剪切板中
			}
		});
	}
	//复制
	private void copyAction(JMenuItem copyItem){
		copyItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				// 把文本设置到剪贴板（复制）
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				String text = contentArea.getSelectedText(); 
				Transferable trans = new StringSelection(text);
				clipboard.setContents(trans, null);
				
			}
		});
	}
	//粘贴
	private void pasteAction(JMenuItem pasteItem){
		pasteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				// 从剪贴板中获取文本（粘贴）
				 // 获取系统剪贴板
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

				 // 获取剪贴板中的内容
				Transferable trans = clipboard.getContents(null);

				if (trans != null) {
					 // 判断剪贴板中的内容是否支持文本
					if (trans.isDataFlavorSupported(DataFlavor.stringFlavor)) {
						try {
							 // 获取剪贴板中的文本内容
							String text = (String) trans.getTransferData(DataFlavor.stringFlavor);
							 // 粘贴
							contentArea.append(text);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				}

			}
		});
	}


	// 记事本，字体格式
	private void fontStyleAction(JToolBar toolBar) {
		JCheckBox boldBox = new JCheckBox("粗体");
		JCheckBox itBox = new JCheckBox("斜体");
		ActionListener actionListener = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				boolean bold = boldBox.isSelected();
				boolean it = itBox.isSelected();
				int style = (bold ? Font.BOLD : Font.PLAIN) | (it ? Font.ITALIC : Font.PLAIN);
				Font font = contentArea.getFont();
				contentArea.setFont(new Font(font.getName(), style, font.getSize()));
				//contentArea.setFont(new Font(font.getName(), style, font.getSize()));
			}
		};
		boldBox.addActionListener(actionListener);
		itBox.addActionListener(actionListener);
		toolBar.add(boldBox);
		toolBar.add(itBox);
	}

	// 记事本，设置字体大小
	private JComboBox<String> fontSizeAction() {
		String[] fontSizes = new String[] { "10", "20", "30", "50" };
		JComboBox<String> fontSize = new JComboBox<>(fontSizes);
		fontSize.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				int size = Integer.valueOf((String) fontSize.getSelectedItem());
				Font font = TextPad.this.contentArea.getFont();
				TextPad.this.contentArea.setFont(new Font(font.getName(), font.getStyle(), size));

			}
		});
		return fontSize;
	}

	// 记事本，设置字体
	private JComboBox<String> fontAction() {
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = environment.getAvailableFontFamilyNames();

		JComboBox<String> fontCom = new JComboBox<>(fontNames);

		fontCom.addActionListener(new ActionListener() {

			//
			public void actionPerformed(ActionEvent e) {
				String fontName = (String) fontCom.getSelectedItem();
				Font font = TextPad.this.contentArea.getFont();
				TextPad.this.contentArea.setFont(new Font(fontName, font.getStyle(), font.getSize()));

			}
		});
		return fontCom;
	}

	// 记事本新建操作
	private void newAction(JMenuItem newItem) {
		newItem.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {

				contentArea.setText("");
				frame.setTitle("新建-记事本");

				fileName = null;
			}
		});
	}

	// 记事本打开文件操作
	private void openAction(JMenuItem openItem) {
		openItem.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Text & dat", "txt", "dat");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(frame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					String fileName = chooser.getSelectedFile().getPath();
					TextPad.this.fileName = fileName;
					String content = TextTool.read(fileName);
					contentArea.setText(content);
					TextPad.this.frame.setTitle(fileName + "- 记事本");
				}

			}
		});
	}

	// 菜单 保存操作
	private void saveAction(JMenuItem saveItem) {
		saveItem.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {

				if (TextPad.this.fileName != null) {
					String content = TextPad.this.contentArea.getText();
					TextTool.write(TextPad.this.fileName, content);
				} else {
					JFileChooser chooser = new JFileChooser();
					FileNameExtensionFilter filter = new FileNameExtensionFilter("Text & dat", "txt", "dat");
					chooser.setFileFilter(filter);
					int returnVal = chooser.showSaveDialog(frame);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						String fileName = chooser.getSelectedFile().getPath();
						TextPad.this.fileName = fileName;
						String content = TextPad.this.contentArea.getText();
						TextTool.write(TextPad.this.fileName, content);
						TextPad.this.frame.setTitle(fileName + "- 记事本");
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		TextPad pad = new TextPad();
	}
}
