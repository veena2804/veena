package bll;

import java.sql.SQLException;
import java.util.List;

import dto.Book;

public interface Bookbll
{
public List<Book> listAllBooks();
public Book getBook(int id);
public void deleteBook(int id);
public void updateBook(Book book);
public void addBook(Book book) throws SQLException;
}