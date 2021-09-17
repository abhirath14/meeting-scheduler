package meetingScheduler;

import meetingScheduler.Meeting;
import java.util.*;

public class Room {
  public String name;
  public List<Meeting> meetingList;

  public Room(String name) {
    this.name = name;
    this.meetingList = new ArrayList<Meeting>();
  }

  public void addMeetingToRoom(Meeting m) {
    if (m != null) {
      System.out.println(
          "Start Time = " + m.startTime + " End Time = " + m.endTime + " Day = " + m.day + " Room = " + m.roomName);
      this.meetingList.add(m);
    }
  }
}