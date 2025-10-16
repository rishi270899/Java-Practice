package mapsExample;

public class Person {
   private String name;
   private String email;

   public Person(String name, String email){
       this.name = name;
       this.email = email;
   }
   public void setName(String name){
       this.name = name;
   }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Name : " + name + " Email : "+ email;
    }
}
