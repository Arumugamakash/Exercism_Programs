package Exercism;

public class BirdWatcher {
	private final int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public int[] getLastWeek() {
		return birdsPerDay;
	}

	public int getToday() {
		if (birdsPerDay.length > 0) {
			return birdsPerDay[birdsPerDay.length - 1];
		} else {
			return -1;
		}
	}

	public void incrementTodaysCount() {
		int TODAY = getToday();
		for (int i = 0; i < birdsPerDay.length; i++) {
			if (TODAY == birdsPerDay[i]) {
				birdsPerDay[i]++;
			}
		}
	}

	public boolean hasDayWithoutBirds() {
		for (int i = 0; i < birdsPerDay.length; i++) {
			if (birdsPerDay[i] == 0) {
				return true;
			}
		}
		return false;
	}

	public int getCountForFirstDays(int numberOfDays) {
		int count = 0;
		if (numberOfDays > birdsPerDay.length) {
			for (int i = 0; i < birdsPerDay.length; i++) {
				count += birdsPerDay[i];
			}
		} else {
			for (int i = 0; i < numberOfDays; i++) {
				count += birdsPerDay[i];
			}
		}
		return count;
	}

	public int getBusyDays() {
		int count = 0;
		for (int i = 0; i < birdsPerDay.length; i++) {
			if (birdsPerDay[i] >= 5) {
				count++;
			}
		}
		return count;
	}
}
