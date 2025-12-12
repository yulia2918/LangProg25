import java.util.List;
import java.util.ArrayList;
class F1b {
	static double avgTime(List<Double> lapTimes) {
		double time = 63.3;//F1.totalTime(lapTimes);
		int laps = lapTimes.size();
		return time/laps;
	}
	public static void main(String[] args) {
		List <Double> lapTimes = new ArrayList<>();
		lapTimes.add(31.0);
		lapTimes.add(20.9);
		lapTimes.add(21.1);
		lapTimes.add(21.3);
		System.out.printf("Общее время: %.1f c\n", F1.totalTime(lapTimes));
		System.out.printf("Среднее время: %.1f c\n", avgTime(lapTimes));

	}
}
