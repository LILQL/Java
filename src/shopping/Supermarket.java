package shopping;

public class Supermarket {
		
		private String supermaketName;

		public String getSupermaketName() {
			return supermaketName;
		}

		public void setSupermaketName(String supermaketName) {
			this.supermaketName = supermaketName;
		}
		
		
		private Product[] productArr;
		
		public Product[] getProductArr() {
			return productArr;
		}

		public void setProductArr(Product[] productArr) {
			this.productArr = productArr;
		}
		
		
		Product sell(String name) {
			for(int i=0; i<productArr.length; i++) {
				if(productArr[i].getProductName()==name) {
					return productArr[i];
				}
			}
			return null;
		}
	}

