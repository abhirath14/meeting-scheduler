package meetingScheduler;

import java.util.List;
import java.util.ArrayList;

public class Scheduler {
  /**
   * Books the room for a given meeting and returns the room name
   * 
   * @return String
   */

  public static String book(Meeting m, List<Room> roomList) {
    int startTime = m.startTime;
    int endTime = m.endTime;
    int day = m.day;
    System.out.println("startTime = " + startTime + " endTime = " + endTime + " day = " + day);
    boolean isOverlap = false;

    for (int i = 0; i < roomList.size(); i++) {
      Room r = roomList.get(i);
      List<Meeting> meetingList = r.meetingList;
      boolean isClash = false;

      for (int j = 0; j < meetingList.size(); j++) {
        if ((startTime >= meetingList.get(j).startTime && startTime <= meetingList.get(j).endTime)
            || (endTime >= meetingList.get(j).startTime && endTime <= meetingList.get(j).endTime)) {
          isClash = true;
        }
      }

      if (isClash == false) {
        System.out.println("Adding the meeting to room " + r.name + " , startTime = " + m.startTime + " endTime = "
            + m.endTime + " day = " + m.day);
        r.meetingList.add(m);
        return r.name;
      }
    }

    System.out.println("No meeting room available for the interval, startTime = " + m.startTime + " endTime = "
        + m.endTime + " day = " + m.day);
    return "";
  }

  public static void main(String[] args) {

    System.out.println("Scheduling Started");
    List<Room> roomList = new ArrayList<Room>();
    roomList.add(new Room("Alpha"));
    roomList.add(new Room("Beta"));
    roomList.add(new Room("Gamma"));
    roomList.add(new Room("Delta"));

    List<Meeting> meetingList = new ArrayList<Meeting>();
    meetingList.add(new Meeting(1, 5, 1, ""));
    meetingList.add(new Meeting(2, 5, 1, ""));
    meetingList.add(new Meeting(2, 5, 1, ""));
    meetingList.add(new Meeting(3, 5, 1, ""));
    meetingList.add(new Meeting(4, 5, 1, ""));
    meetingList.add(new Meeting(5, 6, 1, ""));
    meetingList.add(new Meeting(6, 10, 1, ""));

    for (Meeting m : meetingList) {
      book(m, roomList);
    }
  }
}
