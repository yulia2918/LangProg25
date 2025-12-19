import java.util.List;
import java.util.ArrayList;
class Kurs { 
	static List<String> replan (
		List <String> plan, String newChapt, String beforeChapt);
		int newChaptIndex = plan;
		indexOf(beforeChapt);
		plan.add(newChaptIndex, bewChapt);
		return plan
}
class FP5 {
	public static void main(String[] args) {
		List<String planA = new ArrayList();
		planA.add("введение");
		planA.add("глава 1");
		planA.add("что такое целевая аудитория");
		planA.add("глава 2");
		List<String> planB = new ArrayList();
		planB = Kurs.replan(planA, "анализ целевой аудитории", "глава 2");
	}
}

class Kurs2 {
	static List<String> replan (List<String> plan, String newXhapt, String beforeChapt) {
		int newChaptIndex = plan.indexOf(beforeChapt);
		List<String> replanned = new ArrayList<>(plan);
		replanned.add(newChaptIndex, newChapt);
		return replanned;
	}
}


