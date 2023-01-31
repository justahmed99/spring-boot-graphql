package com.example.graphqlexample.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "book", schema = "public")
class Book {
    @Id
    @Column(name = "id", unique = true)
    var id: String? = null
    var name: String? = null
    var pageCount: Int? = null
    var authorId: String? = null
}