package hellojpa.domain

import javax.persistence.*

@Entity

class Category(
    @Id @GeneratedValue
    var id: Long? = null,

    var name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    var parent: Category,

    @OneToMany(mappedBy = "parent")
    var childCategories: MutableList<Category> = mutableListOf(),

    @ManyToMany
    @JoinTable(
        name = "category_item",
        joinColumns = [JoinColumn(name = "item_id")],
        inverseJoinColumns = [JoinColumn(name = "category_id")]
    )
    var items: MutableList<Item> = mutableListOf(),
) : BaseEntity()