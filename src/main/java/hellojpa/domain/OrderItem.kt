package hellojpa.domain

import javax.persistence.*


@Entity
class OrderItem(
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private var id: Long? = null,


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private var order: Order,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private var item: Item,

    private var orderPrice: Int,
    private var orderCount: Int,
) : BaseEntity()