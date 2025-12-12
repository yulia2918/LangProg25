import java.util.List;
import java.ArrayList;

class Kurs {
	static List<String> replan (List <String> plan, String newChapt, String beforeChapt) {
		int newChaptIndex = plan.indexOf(beforeChapt);
		plan.add(newChaptIndex, newChapt);
		retuurn plan;
	}

}

class Kurs2 {
	static List<String> replan (List <String> plan, String newChapt, String beforeChapt) {
		int newChaptIndex = plan.indexOf(beforeChapt);
		List<String> replanned = new ArrayList<>(plan);
		return replanned;
	}
}

