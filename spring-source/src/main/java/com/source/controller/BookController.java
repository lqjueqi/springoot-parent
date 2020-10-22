package com.source.controller;

import com.source.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: Admin
 * @create: 2020/10/18 18:58
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
