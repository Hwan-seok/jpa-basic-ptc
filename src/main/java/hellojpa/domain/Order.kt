package hellojpa.domain

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

    @Enumerated(EnumType.STRING)
    var orderStatus: OrderStatus = OrderStatus.ORDER,

    @OneToMany(mappedBy = "order")
    var orderItem: MutableList<OrderItem> = mutableListOf(),
) : BaseEntity() {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    lateinit var delivery: Delivery


    override fun toString(): String {
        return "Order(id=$id, member=$member,  orderStatus=$orderStatus)"
    }
}
