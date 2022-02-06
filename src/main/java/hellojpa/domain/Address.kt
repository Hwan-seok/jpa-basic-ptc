package hellojpa.domain

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Address
    (

    @Column
    val zipCode: String,

    val city: String,
)