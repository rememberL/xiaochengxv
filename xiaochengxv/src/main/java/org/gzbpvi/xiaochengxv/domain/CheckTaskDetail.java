package org.gzbpvi.xiaochengxv.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/*任务单详细，当点击任务单时显示
 * */
public class CheckTaskDetail implements Serializable {

	@JsonProperty("REGISTERNO")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String registerno;
	@JsonProperty("EQUIPMENTTYPE")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String equipmenttype;
	@JsonProperty("RECORDNO")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String recordno;
	@JsonProperty("CHECKITEM")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String checkitem;
	@JsonProperty("NAME")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String name;
	@JsonProperty("LEAVEFACTORYNO")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String leavefactoryno;
	@JsonProperty("USENO")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String useno;

	public CheckTaskDetail(String registerno, String equipmenttype, String recordno, String checkitem, String name,
			String leavefactoryno, String useno) {
		super();
		this.registerno = registerno;
		this.equipmenttype = equipmenttype;
		this.recordno = recordno;
		this.checkitem = checkitem;
		this.name = name;
		this.leavefactoryno = leavefactoryno;
		this.useno = useno;
	}

	public CheckTaskDetail() {
	}

	public String getRegisterno() {
		return registerno;
	}

	public void setRegisterno(String registerno) {
		this.registerno = registerno;
	}

	public String getEquipmenttype() {
		return equipmenttype;
	}

	public void setEquipmenttype(String equipmenttype) {
		this.equipmenttype = equipmenttype;
	}

	public String getRecordno() {
		return recordno;
	}

	public void setRecordno(String recordno) {
		this.recordno = recordno;
	}

	public String getCheckitem() {
		return checkitem;
	}

	public void setCheckitem(String checkitem) {
		this.checkitem = checkitem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeavefactoryno() {
		return leavefactoryno;
	}

	public void setLeavefactoryno(String leavefactoryno) {
		this.leavefactoryno = leavefactoryno;
	}

	public String getUseno() {
		return useno;
	}

	public void setUseno(String useno) {
		this.useno = useno;
	}

}
