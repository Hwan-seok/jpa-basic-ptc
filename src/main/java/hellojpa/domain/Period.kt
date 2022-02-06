package hellojpa.domain

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Period(
    @Column
    val startDate: LocalDateTime,

    val endDate: LocalDateTime,
)