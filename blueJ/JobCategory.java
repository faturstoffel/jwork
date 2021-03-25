
/**
 * Enumeration class JobCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum JobCategory
{
    WebDeveloper ("Web Developer"),
    FrontEnd ("Front End"),
    BackEnd ("Back End"),
    UI ("UI"),
    UX ("UX"),
    Devops ("Devops"),
    DataScientist ("Data Scientist"),
    DataAnalyst ("Data Analyst");
    
    private final String category;
    
    private JobCategory(String category){
     this.category = category;   
    }
}
    
