package com.example.graphqlexample.repository

import com.example.graphqlexample.entity.Book
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface BookRepository : JpaRepository<Book, String> {
}