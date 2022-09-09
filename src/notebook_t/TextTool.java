package notebook_t;

import java.awt.image.BufferedImage;
import java.io.*;

import javax.swing.JOptionPane;

public class TextTool {

	public static String read(String fileName) {

		try (Reader reader = new FileReader(fileName); BufferedReader buff = new BufferedReader(reader);) {
			String str;
			StringBuilder sb = new StringBuilder();
			while ((str = buff.readLine()) != null) {
				str = decoding(str);
				sb.append(str + "\n");
			}

			return sb.toString();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "找不到文件路径" + fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void write(String fileName, String content) {

		try (Writer writer = new FileWriter(fileName);) {
			content = encoding(content);
			writer.write(content);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String encoding(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='\n')
			{
				temp+=str.charAt(i);
			}
			else if (0 <= str.charAt(i) && str.charAt(i) <= 255)
				temp += (char) ((str.charAt(i) - '0' + 10) % 255);
			else
				temp += str.charAt(i);
		}
		return temp;
	}

	public static String decoding(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='\n')
			{
				temp+=str.charAt(i);
			}
			else if (0 <= str.charAt(i) && str.charAt(i) <= 255)
				temp += (char) ((str.charAt(i) + '0' - 10 + 255) % 255);
			else
				temp += str.charAt(i);
		}
		return temp;
	}

	

}


