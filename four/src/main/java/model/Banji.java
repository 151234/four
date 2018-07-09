package model;

public class Banji {
	private String bid;
	private String tid;
	private String bname;
	private String invite;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getInvite() {
		return invite;
	}
	public void setInvite() {
		String generateSource = "0123456789abcdefghigklmnopqrstuvwxyz";
	    String rtnStr = "";
	    for (int i = 0; i < 5; i++) {
	        //ѭ�������õ����ַ���������ѡ�����ַ�
	        String nowStr = String.valueOf(generateSource.charAt((int) Math.floor(Math.random() * generateSource.length())));
	        rtnStr += nowStr;
	        generateSource = generateSource.replaceAll(nowStr, "");
	    }
		
		
		this.invite = rtnStr;
	}
	
}
