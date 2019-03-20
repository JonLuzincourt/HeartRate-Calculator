public class HeartRates {

   private String firstName;
   private String lastName;
   private int birthYear;
    
    //method to set the first name in the object
   public void setfName(String firstName){
       this.firstName = firstName;
   }
   //method to get the name from the object and return the name
   public String getfName(){
       return firstName;
   }
   public void setlName(String lastName){
       this.lastName = lastName;
   }
   public String getlName(){
       return lastName;
   }
   //method to set the year in the object
   public void setOld(int birthYear){
       this.birthYear = birthYear;
   }
   //method to retrieve the year and return it
   public int getOld(){
       return birthYear;
   }
}