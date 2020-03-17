package bookmain;

import dto.Book;

import java.sql.*;
import java.util.*;

import dao.BookDao;

public class TestBook {

public static void main(String[] args) throws SQLException
{

BookDao bdao=new BookDao("jdbc:mysql://localhost:3306/cts","root","root");
bdao.connect();

Book book=new Book(1009,"Data Science","mathews",5650);

Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("=========================CRUD operations=====================");

System.out.println("1.Insert Book");
System.out.println("2.Update Book");
System.out.println("3.Delete Book");
System.out.println("4.Show All Book");
System.out.println("5.exit");
System.out.println("Enter ur choice");

int ch=sc.nextInt();

switch(ch)
{
case 1: int id=sc.nextInt();
String name=sc.next();
String auth=sc.next();
Float price =sc.nextFloat();
Book book2 =new Book(id,name,auth,price);
bdao.insertBook(book2);
System.out.println("Book Inserted");
break;
case 2: System.out.println("Enter id u want 2 update:");
int id1=sc.nextInt();
String name1=sc.next();
String auth1=sc.next();
Float price1 =sc.nextFloat();
Book book3 =new Book(id1,name1,auth1,price1);
bdao.updateBook(book3);
System.out.println("Book Updated");
break;
case 3: System.out.println("Enter id u want 2 delete:");
int id2=sc.nextInt();
Book book4 =new Book(id2);
bdao.deleteBook(book4);
        System.out.println("Book deleted");
        break;        
case 4: List<Book> books=bdao.listAllBooks();
      for(Book b:books)
      {
      System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+ " "+b.getPrice());
      }
      break;
case 5: System.exit(0);

default:System.out.println("Enter a avlid option");
      break;

}
}
}

}