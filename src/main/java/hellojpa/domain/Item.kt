package hellojpa.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Item(

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private var id: Long? = null,

    private var name: String,

    private var price: Int,

    private var stockQuantity: Int,
)