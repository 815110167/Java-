package javaSE.TestBook.operation;

import javaSE.TestBook.book.Book;
import javaSE.TestBook.book.BookList;

import java.util.Scanner;

/**
 * @program: class
 * @description:删除图书
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:10
 **/


public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("3.删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字:");
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedSized(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                for (int j = i;i<bookList.getUsedSized()-1;j++){
                    bookList.setBooks(j,bookList.getBook(j+1));
                }
                bookList.setUsedSized(bookList.getUsedSized() - 1);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有这本书");


    }
}
