class Book {
    String title;
    String author;
    int price;
}

public class BookEx01 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "java";
        book1.author = "홍길동";
        book1.price = 1000;

        Book book2 = new Book();
        book2.title = "jsp";
        book2.author = "박문수";
        book2.price = 2000;

        Book book3 = new Book();
        book3.title = "spring";
        book3.author = "이몽룡";
        book3.price = 3000;

        // Book - data type
        Book[] bookArray = new Book[3];
        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        System.out.println(bookArray.length);
        // System.out.println(bookArray[0].title);
        // System.out.println(bookArray[0].author);
        // System.out.println(bookArray[0].price);

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].title);
            System.out.println(bookArray[i].author);
            System.out.println(bookArray[i].price);
        }

        for (Book book : bookArray) {
            System.out.println(book.author);

        }
    }
}
