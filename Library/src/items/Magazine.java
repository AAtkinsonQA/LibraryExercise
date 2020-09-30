package items;

public class Magazine extends Item{
	
	private String companyName;
	private int edition;
	
	public Magazine(String name, String companyName, int edition) {
		super(name);
		this.companyName = companyName;
		this.edition = edition;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "Magazine [Company = " + companyName + ", Edition = " + edition + ", Name = " + getName() + "]";
	}
	
}