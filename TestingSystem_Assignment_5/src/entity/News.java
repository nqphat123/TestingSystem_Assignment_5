package entity;

public class News implements INews{
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;
	
	public News(int id, String title, String publishDate, String author, String content, float averageRate, int[] rates) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rates = rates;
	}
	
	public News() {
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + title);
		System.out.println("PublishDate: " + publishDate);
		System.out.println("Author: " + author);
		System.out.println("Content: " + content);
		System.out.printf("AverageRate: %.2f%n", averageRate);
	}

	@Override
	public float calculate() {
		// TODO Auto-generated method stub
		float sum = 0;
		for(int rate: rates) {
			sum += rate;
		}
		averageRate = sum / rates.length;
		return averageRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public int[] getRates() {
		return rates;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
	}
}
