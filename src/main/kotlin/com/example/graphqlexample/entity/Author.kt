package com.example.graphqlexample.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "author", schema = "public")
class Author {
    @Id
    @Column(name = "id", unique = true)
    var id: String? = null
    var firstName: String? = null
    var lastName: String? = null
}