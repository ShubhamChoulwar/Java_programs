package Immutable;

 final class Employee {
    private final int id;
    private final String name;
    private final Address address;

     Employee(final int id, final String name, final Address address) {
         this.id = id;
         this.name = name;
         this.address = address;
     }

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     public String setName(String name) {
         return name;
     }

     public Address getAddress() {
         return address;
     }

     @Override
     public String toString(){
         return id + "-" + name + "-" + address;
     }
 }
