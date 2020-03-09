package behavorial.commandpattern;

public class CommandMenu {

	public static void main(String[] args) {  
        Document doc = new Document();  
          
        ActionCommand clickOpen = new ActionOpen(doc);  
        ActionCommand clickSave = new ActionSave(doc);  
          
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
          
        menu.clickOpen();  
        menu.clickSave();  
   }  

}
