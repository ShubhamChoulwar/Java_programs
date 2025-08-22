package Immutable;

  class Address {

    private String city;

     public Address(String city) {
         this.city = city;
     }


     public String getCity() {
         return city;
     }

     public void setCity(String city) {

     }

     @Override
     public String toString(){
         return city;
     }
 }
