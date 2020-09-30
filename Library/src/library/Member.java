package library;
import java.util.ArrayList;
import java.util.List;
import items.Item;

public class Member {
	
	private int memberID;
	private List<Item> withdrawnItems = new ArrayList<>();
	private String name;
	
	public Member() {
		super();
	}

	public Member(int iD, List<Item> items, String name) {
		super();
		memberID = iD;
		this.withdrawnItems = items;
		this.name = name;
	}

	public int getID() {
		return memberID;
	}

	public void setID(int iD) {
		memberID = iD;
	}

	public List<Item> getItems() {
		return withdrawnItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [ID = " + memberID + ", items = " + withdrawnItems + ", name = " + name + "]";
	}
	
}
