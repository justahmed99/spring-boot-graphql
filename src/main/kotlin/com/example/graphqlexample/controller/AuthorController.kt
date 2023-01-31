package com.example.graphqlexample.controller

import com.example.graphqlexample.entity.Author
import com.example.graphqlexample.repository.AuthorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class AuthorController {
    @Autowired
    private final val authorRepository: AuthorRepository? = null

    @QueryMapping
    fun authorById(@Argument id: String): Author? {
        return authorRepository?.findById(id)?.get()
    }

}