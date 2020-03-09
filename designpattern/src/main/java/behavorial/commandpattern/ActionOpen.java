package behavorial.commandpattern;

public class ActionOpen implements ActionCommand{

	private Document doc;  
    public ActionOpen(Document doc) {  
        this.doc = doc;  
    }  
    
	public void execute() {
		doc.open(); 
		
	}

}
