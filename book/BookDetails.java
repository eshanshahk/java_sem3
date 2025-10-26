/*WRITE A JAVA PACKAGE PROGRAM FOR THE CLASS BOOK AND THEN IMPORT THE DATA 
FROM THE PACKAGE AND DISPLAY THE RESULT.*/
package book;
public class BookDetails {

    String Name;
    String Author;
    int price;

    public BookDetails(String Name, String Author, int Price) {
        this.Name = Name;
        this.Author = Author;
        this.price = Price;
    }

    public void display() {
        System.err.println("Name : " + Name);
        System.err.println("Author : " + Author);
        System.err.println("Price : " + price);
    }
}