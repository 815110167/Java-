package javaSE.TestBook.operation;

import javaSE.TestBook.book.Book;
import javaSE.TestBook.book.BookList;

import java.util.Scanner;

/**
 * @program: class
 * @description:归还图书
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:11
 **/


public class ReturnOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("3.归还图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入归还图书的名字:");
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedSized(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("没有这本书");
    }
}

