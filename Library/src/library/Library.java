package library;
import java.util.ArrayList;
import java.util.List;
import items.Item;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Library {
	
	private Map<Integer,Item> items = new HashMap<>();
	private Map<Integer,Member> members = new HashMap<>();
	
	public Library() {
		super();
	}
	
	public Map<Integer, Item> getItems() {
		return items;
	}
	
	public Map<Integer, Member> getMembers() {
		return members;
	}

	public void addItem(Item item) {
		this.items.put(item.getItemID(),item);
	}
	
	public void removeItem(int itemID) {
		this.items.remove(itemID);
	}
	
	public boolean updateItem(Item item) {
		for (Entry<Integer,Item> i: this.items.entrySet()) {
			if (i.getValue().getName() == item.getName()) {
				return false;
			}
		}
		this.items.put(item.getItemID(),item);
		return true;
		
	}
	
	public void registerMember(Member member) {
		this.members.put(member.getID(), member);
	}
	
	public void deleteMember(int memberID) {
		this.members.remove(memberID);
	}
	
	public boolean updateMember(Member member) {
		for (Entry<Integer,Member> i: this.members.entrySet()) {
			if (i.getValue().getName() == member.getName()) {
				return false;
			}
		}
		this.members.put(member.getID(),member);
		return true;
		
	}
	
	public boolean checkOut(int itemID, int memberID) {
		Item item = items.get(itemID);
		Member member = members.get(memberID);
		if (item == null || member == null || item.isInStock() == false) {
			return false;
		} else {
			item.setInStock(false);
			member.getItems().add(item);
			return true;
		}
	}
	
	public boolean checkIn(int itemID, int memberID) {
		Item item = items.get(itemID);
		Member member = members.get(memberID);
		if (item == null || member == null || item.isInStock() == true) {
			return false;
		} else {
			item.setInStock(false);
			member.getItems().remove(item);
			return true;
		}
	}

	@Override
	public String toString() {
		return "Library [items=" + items + ", members=" + members + "]";
	}
	
}