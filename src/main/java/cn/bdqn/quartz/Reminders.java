package cn.bdqn.quartz;

public class Reminders {
	public void  showMsg() {
		Plan pl = new Plan("20:30","三楼会议室开会");
		System.out.println(pl.toString());
	}
}
