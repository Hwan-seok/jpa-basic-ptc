package hellojpa

import hellojpa.domain.*
import java.time.LocalDateTime
import javax.persistence.Persistence

fun main() {

    val managerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = managerFactory.createEntityManager()


    val tx = entityManager.transaction
    tx.begin()
    try {

        val member = Member(
            username = "member name",
            city = "city",
            street = "street",
            zipCode = "zipCode",
        )

        val delivery = Delivery(
            street = "street",
            city = "city",
            status = DeliveryStatus.ONGONING,
            zipCode = "zipCode",
        )
        val delivery2 = Delivery(
            street = "street",
            city = "city",
            status = DeliveryStatus.ONGONING,
            zipCode = "zipCode",
        )

        val item = Movie(
            name = "mo",
            price = 1000,
            actor = "me",
            director = "di",
            stockQuantity = 10,
        )

        entityManager.persist(item)

        val order = Order(
            member = member,
            orderDate = LocalDateTime.now(),
            orderStatus = OrderStatus.ORDER,
        )
        order.delivery = delivery
        val order2 = Order(
            member = member,
            orderDate = LocalDateTime.now(),
            orderStatus = OrderStatus.ORDER,
        )
        order2.delivery = delivery2

        entityManager.persist(member)
        entityManager.persist(delivery)
        entityManager.persist(delivery2)
        entityManager.persist(order)
        entityManager.persist(order2)

//        member.orders.add(order)
//        member.orders.add(order2)
//        entityManager.flush()
//        entityManager.clear()

        val foundMember = entityManager.find(Member::class.java, 1L)

        for (order in foundMember.orders) {
            println(order)
        }

//        println(foundOrder.member)


        tx.commit()
    } catch (e: Exception) {
        e.printStackTrace()
        tx.rollback()
    } finally {

        entityManager.close()
        managerFactory.close()
    }

}