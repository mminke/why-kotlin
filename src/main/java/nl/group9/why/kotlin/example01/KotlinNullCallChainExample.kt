package nl.group9.kotlin.vs.java.examples

fun main() {
    for (i in 1..2) {
        val order = findOrder(i)
        println(
            "Use show invoice district: " +
                    order?.invoiceAddress?.district
        )
        println(
            "Use shipment district if no invoice address: " +
                    (order?.invoiceAddress?.district ?: order?.shipmentAddress?.district)
        )
    }
}


/*
 * PLUMBING
 */

fun findOrder(id: Int): Order? {
    return when (id) {
        1 -> Order(
            1,
            Address("Somestreet", "20", "12345ABC", "Somedistrict", "Somecity"),
            null,
        )

        else -> null
    }
}

data class Order(
    val id: Int,
    val shipmentAddress: Address,
    val invoiceAddress: Address?
)

data class Address(
    val street: String,
    val houseNumber: String,
    val zipCode: String,
    val district: String?,
    val city: String,
)
