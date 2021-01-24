package javaSE.TestBook;

import javaSE.TestBook.book.BookList;
import javaSE.TestBook.user.Admin;
import javaSE.TestBook.user.NormUser;
import javaSE.TestBook.user.User;

import java.util.Scanner;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 18:57
 **/


public class TestMain {
    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();

        //登录
        User user = login();

        //选择几，就对应那个方法
        while (true) {
            int choice = user.menu();
            user.doOperation(bookList, choice);
        }
    }


    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1-->管理员，2-->普通用户");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return new Admin(name);
        } else{
            return new NormUser(name);
        }
    }
}
