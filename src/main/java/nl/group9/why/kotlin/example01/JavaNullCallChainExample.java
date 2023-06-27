package nl.group9.why.kotlin.example01;

import kotlin.ranges.IntRange;

import static java.lang.System.out;

public final class JavaNullCallChainExample {
    public static void main(String[] args) {

        new IntRange(1, 2).forEach((i -> {
            final Order order = findOrder(i);

            out.println("Use show invoice address: " +
                    (order == null ? null : (order.invoiceAddress == null ? null : order.invoiceAddress.district))
            );
            out.println("Use shipment district if no invoice address: " +
                    (order == null ? null : (order.invoiceAddress == null ? order.shipmentAddress.district : order.invoiceAddress.district))
            );
        }));
    }


    /*
     * PLUMBING
     */

    public static Order findOrder(int id) {
        if (id == 1) {
            return new Order(
                    1,
                    new Address("Somestreet", "20", "12345ABC", "Somedistrict", "Somecity"),
                    null
            );
        } else {
            return null;
        }
    }

    static class Order {
        public int id;
        public Address shipmentAddress;
        public Address invoiceAddress;

        public Order(int id, Address shipmentAddress, Address invoiceAddress) {
            this.id = id;
            this.shipmentAddress = shipmentAddress;
            this.invoiceAddress = invoiceAddress;
        }
    }

    static class Address {
        public String street;
        public String houseNumber;
        public String zipCode;
        public String district;
        public String city;

        public Address(String street, String houseNumber, String zipCode, String district, String city) {
            this.street = street;
            this.houseNumber = houseNumber;
            this.zipCode = zipCode;
            this.district = district;
            this.city = city;
        }
    }
}


