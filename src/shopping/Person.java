package shopping;

public class Person {

		private String personName;

		public String getPersonName() {
			return personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}
		
		Product shopping(Supermarket market,String name) {
			return market.sell(name);
		}
	}

