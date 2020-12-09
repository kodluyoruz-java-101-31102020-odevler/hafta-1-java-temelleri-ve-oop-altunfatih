package question06;

public class Main {

	public static void main(String[] args) {
		Test.run();
		
	}
}

class Test {
	public static void run() {
		Printer.printPDFDocument("pdf");
		Printer.printWordDocument("word");
	}
}

class PDFDocument {
	public String body = "";

	public PDFDocument(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}
	
}

class WordDocument {
	public String body = "";

	public WordDocument(String body) {
		this.body = body;
	}
	
	public String getBody() {
		return body;
	}
}

class Printer {
	// sınıf dışında çağırdığımız için statik kullandık
	public static void printWordDocument(String body) {
		WordDocument word = new WordDocument(body);
		System.out.println(word.getBody());
	}
	
	public static void printPDFDocument(String body) {
		PDFDocument pdf = new PDFDocument(body);
		System.out.println(pdf.getBody());
	}
}