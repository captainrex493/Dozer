import java.util.Comparator;

import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ListenerAdapterWithHelp extends ListenerAdapter {
	
	protected String name = null;
	protected String arguments = null;
	protected String help = "no help found";
	
	public String getName() {
		return name;
	}
	
	public String getArguments() {
		return arguments;
	}
	
	public String getHelp() {
		return help;
	}
	
	
		

}
