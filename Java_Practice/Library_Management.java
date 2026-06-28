class library{
    String []AvailableBooks = new String[100];
    String []IssuedBooks = new String [100];
    int Availablecount = 0;
    int issuescount = 0;
    void addBook(String bookname){
        AvailableBooks[Availablecount] = bookname;
        Availablecount++;
    }
    void showBooks(){
        for (int i = 0 ; i<Availablecount ; i++){
            System.out.println(AvailableBooks[i]);
        }
    }
    void issueBooks(String bookname){
        for (int i = 0 ; i<Availablecount ; i++){
            if (AvailableBooks[i]!= null && AvailableBooks[i].equalsIgnoreCase(bookname)){
                IssuedBooks[issuescount] = bookname;
                issuescount++;
                AvailableBooks[i] = null;
                System.out.println(bookname+" Has Been Issued");
                return;
            }
        }
    }
}
public class Library_Management {
    public static void main(String [] args){
        library lib = new library();
        lib.addBook("Java");
        lib.addBook("C++");
        lib.addBook("Code with harry");
        lib.showBooks();

        lib.issueBooks("java");

    }
}
