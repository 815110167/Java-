package javaSE.TestBook.operation;

import javaSE.TestBook.book.Book;
import javaSE.TestBook.book.BookList;

/**
 * @program: class
 * @description:显示图书
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:10
 **/


public class DisplayOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("4.显示图书");
        int size = bookList.getUsedSized();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
