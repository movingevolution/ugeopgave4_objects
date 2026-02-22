public class Main {

    // opg.1
    /*
    public static Student searchOldest(Student[] students) {
        Student oldest = students[0];
        for(Student s : students) {
            if(s.age > oldest.age) {
                oldest = s;
            }
        }
        return oldest;
    }*/

    //opg.2
    /*
    public static Product searchMostExpensive(Product[] products) {
        Product most_expensive = products[0];
        for(Product p : products) {
            if(p.price > most_expensive.price) {
                most_expensive = p;
            }
        }
        return most_expensive;
    }*/

    public static void main(String[] args){

        // opg. 1
        /*
        Student student_one = new Student("Rip", 18);
        Student student_two = new Student("Rap", 19);
        Student student_three = new Student("Rup", 20);

        Student[] students = {student_one, student_two, student_three};

        for(Student s : students) {
            s.printInfo();
            System.out.println(" ");

        }

        Student oldest = searchOldest(students);
        System.out.println("Oldest Student");
        oldest.printInfo();*/

        // opg. 2
        /*
        Product product_one = new Product("Phone", 100, new String[] {"electronics", "sale", "apple", "silver", "non-food"});
        Product product_two = new Product("Pillow", 25, new String[] {"soft products", "sale", "white", "non-food" });
        Product product_three = new Product("Couch", 1500, new String[]{"furniture", "grey", "non-food"});
        Product product_four = new Product("banana", 1, new String[]{"food", "yellow"});

        Product[] products = {product_one, product_two, product_three, product_four};

        System.out.println("Sale" + " ");
        for(Product p : products) {
            if(p.hasTag("sale")) {
                p.printInfo();
                System.out.println(" ");
            }
        }

        Product most_expensive = searchMostExpensive(products);
        System.out.println("Most expensive");
        most_expensive.printInfo();*/

        //opg 5.
        //Initialize new library
        Library library = new Library("Diamanten");

        //add books to library
        library.addBook(new Book("Moby Dick", "Herman Melville"));
        library.addBook(new Book("Oliver Twist", "Charles Dickens"));
        library.addBook(new Book("Isprinsessen", "Camilla Läckberg"));
        library.addBook(new Book("Hundehoved", "Morten Ramsland"));
        library.addBook(new Book("Hypnotisøren", "Lars Kepler"));

        //print all books in library
        library.printAllBooks();

        //rent some books
        System.out.println("Books Rented: ");
        Book rentBook1 = library.findBookByTitle("Moby Dick");
        rentBook1.borrowBook();
        Book rentBook2 = library.findBookByTitle("oliver twist");
        rentBook2.borrowBook();

        //print available books
        library.printAvailableBooks();

        //deliver books back
        rentBook1.returnBook();

        //print available books
        library.printAvailableBooks();










        





    }
}
