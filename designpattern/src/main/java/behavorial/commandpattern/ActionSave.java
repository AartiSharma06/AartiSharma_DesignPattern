package behavorial.commandpattern;

public class ActionSave implements ActionCommand {
	private Document doc;  
    public ActionSave(Document doc) {  
        this.doc = doc;  
    }  

    public void execute() {  
        doc.save();  
    }  
}
