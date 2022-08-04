package com.Controller.Book;


import com.Entity.Book;
import com.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class BookController {

    BookRepository repository;

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getBookbyId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/book")
    public Book saveBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long id){
        repository.deleteById(id);
    }

}
