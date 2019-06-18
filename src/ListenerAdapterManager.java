import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ListenerAdapterManager extends ListenerAdapterWithHelp {
	
	private ListenerAdapterWithHelp[] listeners;
	
	public ListenerAdapterManager(JDA jda, ListenerAdapterWithHelp[] listeners) {
		this.listeners = listeners;
		for (ListenerAdapterWithHelp listener : this.listeners) {
			jda.addEventListener(listener);
		}
		
		Arrays.sort(this.listeners, new ListenerAdapterWithHelpComparator());
	}
	
	
	
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
	}

}
