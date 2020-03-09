package behavorial.commandpattern;

public class MenuOptions {

	private ActionCommand openCommand;
    private ActionCommand saveCommand;

	public MenuOptions(ActionCommand clickOpen, ActionCommand clickSave) {
		this.openCommand = clickOpen;
        this.saveCommand = clickSave;
	}

	public void clickOpen() {
	       openCommand.execute();

		
	}

	public void clickSave() {
	      saveCommand.execute();
	}

}
