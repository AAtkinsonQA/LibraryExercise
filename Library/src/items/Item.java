package items;

public abstract class Item {
	
	private static int numOfItems;
	private int itemID;
	private String name;
	private boolean inStock;

	public Item(String name) {
		super();
		numOfItems++;
		this.itemID = numOfItems;
		this.name = name;
		this.inStock = true;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
}
