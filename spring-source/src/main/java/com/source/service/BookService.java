package com.source.service;

import com.source.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Admin
 * @create: 2020/10/18 18:58
 */
@Service
public class BookService {

    //@Qualifier("bookDao")
    //@Autowired(required = false)
    //@Resource(name = "bookDao2")
    //@Inject
    private BookDao bookDao;

    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
