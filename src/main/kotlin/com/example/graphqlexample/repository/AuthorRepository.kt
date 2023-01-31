package com.example.graphqlexample.repository

import com.example.graphqlexample.entity.Author
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
@Repository
interface AuthorRepository:JpaRepository<Author, String> {
}