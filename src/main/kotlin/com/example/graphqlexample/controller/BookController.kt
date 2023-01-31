package com.example.graphqlexample.controller

import com.example.graphqlexample.entity.Author
import com.example.graphqlexample.entity.Book
import com.example.graphqlexample.repository.AuthorRepository
import com.example.graphqlexample.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller


@Controller
class BookController {

    @Autowired
    private final val bookRepository: BookRepository? = null

    @Autowired
    private final val authorRepository: AuthorRepository? = null

    @QueryMapping
    fun books(): Iterable<Book>? {
        return bookRepository?.findAll()
    }

    @QueryMapping
    fun bookById(@Argument id: String): Book? {
        return bookRepository?.findById(id)?.get()
    }

    @SchemaMapping
    fun author(book: Book): Author? {
        return authorRepository?.findById(book.authorId!!)?.get()
    }
}