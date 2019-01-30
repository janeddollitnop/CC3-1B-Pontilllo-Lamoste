
package accounts;




public class Accounts {

   
    public static void main(String[] args) {
          //<class name> <object name> = new <constructor>;
        System.out.println("----------------------------------------------------------------------------------------");
        Information student1 = new Information("CITCS", "2ND TERM 2018-2019");
        
        student1.setFamilyname("Lamoste");
        student1.setFirstname("Jeremiah");
        student1.setAcademicprogram("BSIT");
        student1.setTrack("ERP");
        //<object name>.<method>
        student1.setIdnum("123455");
        student1.College=("\t"+"\t"+"\t"+"\t"+"\t"+"COA");
      
        
          student1.print(); 
        System.out.println("----------------------------------------------------------------------------------------"); 
        System.out.println("\nName:"+student1.getFirstname()+","+student1.getFamilyname());
        System.out.println("\nId Number:"+student1.getIdNum());
        System.out.println("\nAcadamic Program:"+student1.getAcademicprogram());
        System.out.println("\nTrack:"+student1.getTrack());
        
    }
    
}
