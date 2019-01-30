
package accounts;




public class Information {
     String University;
    String College;
    String term;
    
    private String idNum;
    private String familyname;
    private String firstname;
    private String academicprogram;
    private String track;
    String getIdnum;
    
    
   
   
    
    //create a constructor that will pass college and term;
    //inside the constructor you must initialize a value for the university
    //<access modifier> <Classname>() { }
    //
    public Information(String college, String term){
                this.University = "\t\t\t\tUniversity of cordilleras";
                this.College = "\t"+"\t"+"\t"+"\t"+"\t"+college;
                this.term = "\t"+"\t"+"\t"+"\t"+term;
                
        }
    void setIdnum(String setidNum){
        this.idNum = setidNum; 
    }
     String getIdNum(){
        return idNum;
    }
     void setFamilyname(String familyname){
        this.familyname = familyname;
    }
     String getFamilyname(){
        return familyname;
    }
     void setFirstname(String firstname){
        this.firstname = firstname;
    }
     String getFirstname(){
        return firstname;
    }
     void setAcademicprogram(String academicprogram){
        this.academicprogram = academicprogram;
    }
     String getAcademicprogram(){
        return academicprogram;
    }
     void setTrack(String track){
        this.track = track;
    }
     String getTrack(){
        return track;
    }
   public void  print(){
        System.out.println(University);
        System.out.println(College);
        System.out.println(term);
   }

  
   
   
    
    }
  





