package items;

public class Book extends Item {
	
	private int chapterNumber = 1;
	private int numOfChapters;

	public Book(String name, int numOfChapters) {
		super(name);
		this.numOfChapters = numOfChapters;
	}

	public int getNumOfChapters() {
		return numOfChapters;
	}

	public void setNumOfChapters(int numOfChapters) {
		this.numOfChapters = numOfChapters;
	}

	@Override
	public String toString() {
		return "Book [numOfChapters = " + numOfChapters + ", Name = " + getName() + "]";
	}
	
	public int readChapter() {
		System.out.println("You read chapter " + chapterNumber + " of the book");
		chapterNumber++;
		return chapterNumber;
	}

}