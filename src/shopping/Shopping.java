package shopping;

public class Shopping {
		public static void main(String[] args) {
			
			Product p1 = new Product();
			Product p2 = new Product();
			Product p3 = new Product();
			Product p4 = new Product();
			Product p5 = new Product();
			Product p6 = new Product();
			
			
			p1.setProduct("�������?");
			p2.setProduct("������");
			p3.setProduct("���¿���");
			p4.setProduct("������Ƭ");
			p5.setProduct("��ʦ��������ţ��");
			p6.setProduct("��̫��ר��ƽ�׹�");
			
			
			Supermarket s1 = new Supermarket();
			Supermarket s2 = new Supermarket();
			Supermarket s3 = new Supermarket();
			
			
			s1.setSupermaketName("���ָ�");
			s1.setProductArr(new Product[] {p1,p2,p3,p4,p5,p6});
			
			s2.setSupermaketName("����");
			s2.setProductArr(new Product[] {p1,p2,p3,p4,p5,p6});
			
			s3.setSupermaketName("�ֶ���");
			s3.setProductArr(new Product[] {p1,p2,p3,p4,p5,p6});
			
			
			Person n1 = new Person();
			Person n2 = new Person();
			Person n3 = new Person();
			
		
			n1.setPersonName("������");
			n2.setPersonName("���»�");
			n3.setPersonName("����");
			
			n3.shopping(s2,"����");
			Product result = s2.sell("��ʦ��������ţ��");
			
			if(result == null) {
				System.out.println("Emmmmmm,"+n3.getPersonName()+"����һȦ"+s2.getSupermaketName()+"���У���ȻʲôҲû��");
			}else {
				System.out.println(n2.getPersonName()+"����һȦ"+s3.getSupermaketName()+"���к����˴�˵�е�"+result.getProductName());
			}
		}
	}


