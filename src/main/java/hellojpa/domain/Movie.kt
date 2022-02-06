package hellojpa.domain

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("mo")
class Movie(

    id: Long? = null,
    name: String,
    price: Int,
    stockQuantity: Int,
    categories: MutableList<Category> = mutableListOf(),
    var director: String, var actor: String
) : Item(
    id = id,
    name = name,
    price = price,
    stockQuantity = stockQuantity,
    categories = categories,
)