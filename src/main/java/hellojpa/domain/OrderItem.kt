package hellojpa.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class OrderItem(
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private var id: Long? = null,


    private var orderId: Long,
    private var itemId: Long,

    private var orderPrice: Int,
    private var orderCount: Int,
)