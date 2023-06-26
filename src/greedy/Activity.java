package greedy;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class Activity {
    int startTime;
    int endTime;
    Activity(int x, int y) {
        startTime = x;
        endTime = y;
    }
    static List<Activity> activity_selection(Activity[] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a.endTime));
        List<Activity> res = new ArrayList<>();
        res.add(activities[0]);
        int lastSelected = 0;
        for (int i = 0; i < activities.length; i++) {
            if (activities[i].startTime >= activities[lastSelected].endTime) {
                res.add(activities[i]);
                lastSelected=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Activity " + (i+1) + " start time: ");
            int st = sc.nextInt();
            System.out.print("Activity " + (i+1) + " end time: ");
            int et = sc.nextInt();
            System.out.println();
            activities[i] = new Activity(st,et);
        }
        List<Activity> selected = activity_selection(activities);
        System.out.println("No. of Activities = " + selected.size());
        for (Activity act : selected) {
            System.out.println("Start: " + act.startTime + " End: " + act.endTime);
        }
    }
}
