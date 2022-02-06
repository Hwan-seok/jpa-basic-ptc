package hellojpa.domain

import java.time.LocalDateTime
import javax.persistence.MappedSuperclass


@MappedSuperclass
abstract class BaseEntity() {

    val createdAt: LocalDateTime = LocalDateTime.now()
    val updatedAt: LocalDateTime = LocalDateTime.now()

}