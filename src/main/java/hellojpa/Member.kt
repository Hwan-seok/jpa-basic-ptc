package hellojpa

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Member(
    @Id
    var id: Long,
    var name: String,
)