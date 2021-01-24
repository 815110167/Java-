package javaSE.TestBook.user;

import javaSE.TestBook.book.BookList;
import javaSE.TestBook.operation.IOperation;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:19
 **/


public abstract class User {
    protected String name;

    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(BookList bookList,int choice){
        this.operations[choice].work(bookList);
    }


}
