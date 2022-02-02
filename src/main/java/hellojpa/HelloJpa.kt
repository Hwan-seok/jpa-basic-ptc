package hellojpa

import javax.persistence.Persistence

fun main() {

    val managerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = managerFactory.createEntityManager()


    val tx = entityManager.transaction
    tx.begin()
    try {
        val member = entityManager.find(Member::class.java, 3L)
        member.name = "pasodkf"

        tx.commit()
    } catch (e: Exception) {
        e.printStackTrace()
        tx.rollback()
    } finally {

        entityManager.close()
        managerFactory.close()
    }

}