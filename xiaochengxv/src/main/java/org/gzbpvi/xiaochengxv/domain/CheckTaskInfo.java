package org.gzbpvi.xiaochengxv.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/*查询任务列表的实体
 * */
public class CheckTaskInfo implements Serializable {

	@JsonProperty("UNITNAME")
	private String unitname;
	@JsonProperty("TASKNO")
	private String taskno;
	@JsonProperty("LINKMAN")
	private String linkman;
	@JsonProperty("MOBILE")
	private String mobile;
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public String getTaskno() {
		return taskno;
	}
	public void setTaskno(String taskno) {
		this.taskno = taskno;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public CheckTaskInfo(String unitname, String taskno, String linkman, String mobile) {
		super();
		this.unitname = unitname;
		this.taskno = taskno;
		this.linkman = linkman;
		this.mobile = mobile;
	}
	public CheckTaskInfo() {
	}
	
	
}
