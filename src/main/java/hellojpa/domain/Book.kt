package hellojpa.domain

import javax.persistence.Entity

@Entity
class Book(
    id: Long? = null,
    name: String,
    price: Int,
    stockQuantity: Int,
    categories: MutableList<Category> = mutableListOf(),
    var author: String,
    var isbn: String,
) : Item(
    id = id,
    name = name,
    price = price,
    stockQuantity = stockQuantity,
    categories = categories,
)