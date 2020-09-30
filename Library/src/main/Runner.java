package main;
import items.Item;
import items.Map;
import items.Book;
import items.Magazine;
import library.Library;
import library.Member;

public class Runner {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		library.addItem(new Map("Map of the world", "world"));
		library.addItem(new Book("Sapiens", 30));
		library.addItem(new Magazine("Wizard weekly", "Warner Bros.", 34));
		library.updateItem(new Book("The odyssey", 45));
		library.removeItem(3);
		
		library.registerMember(new Member("Albert"));
		library.registerMember(new Member("Jordan"));
		library.registerMember(new Member("Lewis"));
		library.registerMember(new Member("Alan"));
		library.deleteMember(1);
		System.out.println(library.updateMember(new Member("Lewis")));
		
		System.out.println(library.checkOut(1, 2));
		
		//Returns false because the item has already been checked out to another member with the ID of 2:
		System.out.println(library.checkOut(1, 3));
		System.out.println(library.checkOut(2, 3));
		
		System.out.println(library.getMembers());
		
		System.out.println(library.checkIn(2, 3));
		
		System.out.println(library.getMembers());
		
		//Accesses the book object as an item and then casts to book type to use the readChapter method:
		((Book) library.getItems().get(2)).readChapter();
		
	}
}
