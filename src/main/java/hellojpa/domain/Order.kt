package hellojpa.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "orders")
class Order(
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    var id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    var member: Member,

    var orderDate: LocalDateTime,

    @Enumerated(EnumType.STRING)
    var orderStatus: OrderStatus,

    @OneToMany(mappedBy = "order")
    var orderItem: MutableList<OrderItem> = mutableListOf(),
) : BaseEntity() {

    @OneToOne
    @JoinColumn(name = "delivery_id")
    lateinit var delivery: Delivery


    override fun toString(): String {
        return "Order(id=$id, member=$member, orderDate=$orderDate, orderStatus=$orderStatus)"
    }
}
