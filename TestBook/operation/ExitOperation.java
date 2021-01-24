package javaSE.TestBook.operation;

import javaSE.TestBook.book.BookList;

/**
 * @program: class
 * @description:退出系统
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:10
 **/


public class ExitOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("0.退出系统");
        System.exit(1);
    }
}
