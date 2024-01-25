import java.util.Scanner;

public class SearchTool {
    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        // Inserting data into the binary tree
        BT.insert("Data Structures and Algorithms (DSA) is a branch of computer science.", new String[]{"DSA", "algorithm"});
        BT.insert("Java is a popular programming language.", new String[]{"Java", "programming"});
        BT.insert("Machine Learning is a subset of artificial intelligence.", new String[]{"Machine Learning", "AI"});
        BT.insert("Web development involves creating websites and web applications.", new String[]{"Web development", "HTML", "CSS"});
        BT.insert("Blockchain is a decentralized and distributed ledger technology.", new String[]{"Blockchain", "technology"});
        BT.insert("Python is known for its simplicity and readability.", new String[]{"Python", "programming"});
        BT.insert("C++ is a powerful programming language often used for system/application software.", new String[]{"C++", "programming"});
        BT.insert("JavaScript is a scripting language used to create interactive web pages.", new String[]{"JavaScript", "web development"});
        BT.insert("RESTful APIs are commonly used for web services communication.", new String[]{"RESTful APIs", "web development"});
        BT.insert("Git is a version control system widely used in software development.", new String[]{"Git", "version control"});
        BT.insert("Object-Oriented Programming (OOP) is a programming paradigm based on the concept of objects.", new String[]{"OOP", "programming"});
        BT.insert("Databases are used to store, manage, and retrieve data.", new String[]{"Databases", "SQL"});
        BT.insert("Linux is an open-source operating system kernel.", new String[]{"Linux", "operating system"});
        BT.insert("Java Spring Framework simplifies Java development and promotes good design practices.", new String[]{"Spring Framework", "Java"});
        BT.insert("HTML is a markup language used for creating web pages.", new String[]{"HTML", "web development"});
        BT.insert("CSS is a style sheet language used for describing the look and formatting of a document written in HTML.", new String[]{"CSS", "web development"});
        BT.insert("Agile methodology emphasizes flexibility and customer satisfaction in software development.", new String[]{"Agile methodology", "software development"});
        BT.insert("React is a JavaScript library for building user interfaces.", new String[]{"React", "JavaScript"});
        BT.insert("Artificial intelligence involves creating intelligent machines that can mimic human behavior.", new String[]{"Artificial Intelligence", "AI"});
        BT.insert("TCP/IP is the foundational suite of protocols for the Internet.", new String[]{"TCP/IP", "networking"});
        BT.insert("Mobile app development involves creating applications for mobile devices.", new String[]{"Mobile app development", "iOS", "Android"});
        BT.insert("Scrum is an agile process framework used for managing complex knowledge work.", new String[]{"Scrum", "agile methodology"});
        BT.insert("Big Data refers to large and complex datasets that cannot be easily processed with traditional data processing applications.", new String[]{"Big Data", "data analytics"});
        BT.insert("Machine vision allows machines to interpret and make decisions based on visual data.", new String[]{"Machine vision", "computer vision"});
        BT.insert("Rust is a programming language designed for performance and safety.", new String[]{"Rust", "programming"});

        System.out.println("**********************************************************************");
        System.out.println("*            Welcome to SearchTool  Using Binary Search Tree         *");
        System.out.println("*                    Explore Information with Ease!                  *"); 
        System.out.println("**********************************************************************");

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Search for information");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            
            // Handle invalid input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("\n==============================================");
                    System.out.print("Enter your question: ");
                    String question = scanner.nextLine();
                    System.out.println("==============================================");
                    BT.search(question);
                    break;
                case 2:
                    System.out.println("\n**********************************************");
                    System.out.println("*             Exiting the program           *");
                    System.out.println("*          Thank you for using SearchTool!  *");
                    System.out.println("**********************************************");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 2);

        scanner.close();
    }
}

