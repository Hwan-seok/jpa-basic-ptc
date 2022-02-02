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
    private var id: Long? = null,
    @Column(name = "name")
    private var username: String,

    private var city: String,
    private var street: String,
    private var zipCode: String,
)