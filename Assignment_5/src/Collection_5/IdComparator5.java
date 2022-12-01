package Collection_5;

import java.util.Comparator;

public class IdComparator5 implements Comparator<Items5> {

	@Override
	public int compare(Items5 o1, Items5 o2) {

		if (o1.getItemId() == o2.getItemId())
			return 0;
		else if (o1.getItemId() > o2.getItemId())
			return 1;

		else
			return -1;

	}

}
