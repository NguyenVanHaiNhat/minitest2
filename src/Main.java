public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = {
                new ProgrammingBook(1, "Java Concurrency in Practice", 212000, "Brian Goetz", "Java", "JVM"),
                new ProgrammingBook(2, "Java Performance", 873.180, "James Gosling", "Java", "JVM"),
                new ProgrammingBook(3, "Giáo trình kỹ thuật lập trình C căn bản và nâng cao", 157500, "Phạm Văn Ất", "C", "C"),
                new ProgrammingBook(4, "Head First C", 3502033, "David Griffiths", "C", "a"),
                new ProgrammingBook(5, "Thinking in Java", 1818882, "Bruce Eckel", "Java", "JVM"),
        };

        FictionBook[] fictionBooks = {
                new FictionBook(6, "The Mystery Guest", 650000, "Nita Prose", "Viễn tưởng 1"),
                new FictionBook(7, "The Future", 520000, "Naomi Alderman", "Viễn tưởng 1"),
                new FictionBook(8, "Good Girls Don’t Die", 3300000, "Christina Henry", "Mystery Thriller"),
                new FictionBook(9, "Last Night at the Hollywood Canteen", 79, "nhat", "Sarah James"),
                    new FictionBook(10, "Godly Heathens", 10, "H.E. Edgmon", "Viễn tưởng 1"),
        };

        double totalPrice = 0;
        for (Book book : programmingBooks) {
            totalPrice += book.getPrice();
        }
        for (Book book : fictionBooks) {
            totalPrice += book.getPrice();
        }

        int javaBooksCount = 0;
        for (ProgrammingBook book : programmingBooks) {
            if ("Java".equals(book.getLauguage())) {
                javaBooksCount++;
            }
        }
        int scifiBooksCount = 0;
        for (FictionBook book : fictionBooks) {
            if ("Viễn tưởng 1".equals(book.getCategory())) {
                scifiBooksCount++;
            }
        }
        int cheapFictionBooksCount = 0;
        for (FictionBook book : fictionBooks) {
            if (book.getPrice() < 100) {
                cheapFictionBooksCount++;
            }
        }
        System.out.println("Total Price of all books: " + totalPrice + "$");
        System.out.println("The number of books in the language is Java: " + javaBooksCount);
        System.out.println("The number of books has the category of Fiction 1: " + scifiBooksCount);
        System.out.println("The number of fiction books priced less than 100 is: " + cheapFictionBooksCount);
    }
}