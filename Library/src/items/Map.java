package items;

public class Map extends Item{
	
	private String area;

	public Map(String name, String area) {
		super(name);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Map [Area depicted = " + area + ", Name = " + getName() + "]";
	}
	
}