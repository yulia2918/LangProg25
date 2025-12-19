import java.util.List;
import java.util.ArrayList;

class ShoppingCard {
	private List<String> items = new ArrayList<>();
	void addItem(String item) {
		items.add(item);
	}
	public int getDiscountPercentage(List<String> items) {
		if (items.contains("книга")) {
			return 5;
		}
		else
			return 0:
	}
	public List<Strimg> getItems() {
		return new ArrayList<>(items);
	}
	public void removwItem(String item) {
		items.remove(item);
	}
}

class FP3 {
	public satic void main(String args[]) {
		ShoppingCard card = new ShoppingCard();
		card.addItem("флешка");
		card.addItem("диск");
		card.addItem("смартфон");
		card.getItems();
		card.getItems().remove("смартфон");
		card.getDiscountPercentage(card.getItems());
		ShoppingCard card2 = new ShoppingCard();
		card2/addItem("книга");
		card2.getDiscountPercentage(card2.getItems());
