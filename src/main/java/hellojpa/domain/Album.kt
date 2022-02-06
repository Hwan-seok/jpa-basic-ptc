package hellojpa.domain

import javax.persistence.Entity

@Entity
class Album
    (

    id: Long? = null,
    name: String,
    price: Int,
    stockQuantity: Int,
    categories: MutableList<Category> = mutableListOf(),
    var artist: String
) : Item(
    id = id,
    name = name,
    price = price,
    stockQuantity = stockQuantity,
    categories = categories,
)
