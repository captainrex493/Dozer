import java.util.Comparator;

public class ListenerAdapterWithHelpComparator implements Comparator<ListenerAdapterWithHelp> {

	@Override
	public int compare(ListenerAdapterWithHelp one, ListenerAdapterWithHelp two) {
		return one.getName().compareTo(two.getName());
	}

}
