package hellojpa.domain

import javax.persistence.*

@Entity
@SequenceGenerator(
    name = "member_seq_generator",
    sequenceName = "member_seq",
    initialValue = 1,
    allocationSize = 100,
)
class Member(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_generator")
    @Column(name = "member_id")
    var id: Long? = null,
    @Column(name = "name")
    var username: String,

    @Embedded
    var workPeriod: Period,

    @Embedded
    var address: Address,

    @OneToMany(mappedBy = "member")
    var orders: MutableList<Order> = mutableListOf(),
) : BaseEntity() {
    override fun toString(): String {
        return "Member(id=$id, username='$username', )"
    }
}