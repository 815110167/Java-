package javaSE.TestBook.operation;

import javaSE.TestBook.book.Book;
import javaSE.TestBook.book.BookList;

import java.util.Scanner;

/**
 * @program: class
 * @description:新增图书
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:09
 **/


public class AddOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("2.新增图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字:");
        String name = scanner.nextLine();
        System.out.println("请输入作者的名字:");
        String author = scanner.nextLine();
        System.out.println("请输入价格:");
        int price = scanner.nextInt();
        System.out.println("请输入类型:");
        String type = scanner.next();

        Book book = new Book(name, author, price, type);
        int size = bookList.getUsedSized();
        bookList.setBooks(size, book);
        bookList.setUsedSized(size + 1);
        System.out.println("新增成功");
    }
}
