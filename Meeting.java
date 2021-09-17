package meetingScheduler;

public class Meeting {
  int startTime;
  int endTime;
  int day;
  String roomName;

  public Meeting(int startTime, int endTime, int day, String roomName) {
    this.startTime = startTime;
    this.endTime = endTime;
    this.day = day;
    this.roomName = roomName;
  }
}