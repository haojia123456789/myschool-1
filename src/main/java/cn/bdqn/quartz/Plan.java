package cn.bdqn.quartz;

public class Plan {
	private String tim;//开会时间
	private String addr;//开会地址
	public String getTim() {
		return tim;
	}
	public void setTim(String tim) {
		this.tim = tim;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Plan [tim=" + tim + ", addr=" + addr + "]";
	}
	public Plan() {
		super();
	}
	public Plan(String tim, String addr) {
		super();
		this.tim = tim;
		this.addr = addr;
	}
	
}
