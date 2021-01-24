package javaSE.TestBook.operation;

import javaSE.TestBook.book.Book;
import javaSE.TestBook.book.BookList;

import java.util.Scanner;

/**
 * @program: class
 * @description:借阅图书
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:09
 **/


public class BorrowOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("2.借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字:");
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedSized(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("没有要借阅的那本书");
    }
}
