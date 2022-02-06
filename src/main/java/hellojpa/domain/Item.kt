package hellojpa.domain

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "data_type")
class Item(

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    var id: Long? = null,

    var name: String,

    var price: Int,

    var stockQuantity: Int,

    @ManyToMany(mappedBy = "items")
    var categories: MutableList<Category> = mutableListOf(),

    ) : BaseEntity()