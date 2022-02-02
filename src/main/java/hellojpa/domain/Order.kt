package hellojpa.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "orders")
class Order(
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private var id: Long? = null,

    
    private var memberId: Long,


    private var orderDate: LocalDateTime,
    @Enumerated(EnumType.STRING)
    private var orderStatus: OrderStatus,
)
