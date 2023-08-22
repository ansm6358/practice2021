package 자바_기초;

public class Book {
	int price;
	int page;
	String author;
	
	public Book(int price, int page, String author) {
		this.price = price;
		this.page = page;
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString() {
		return "Book [price="+this.price+", page="+this.page+", author="+this.author+"]";
	}
	public static void main(String[] args) {
		Book book = new Book(1000,100,"홍길동");
		System.out.println(book.toString());
	}

}
