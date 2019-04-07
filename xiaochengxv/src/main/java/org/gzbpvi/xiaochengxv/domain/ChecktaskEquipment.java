package org.gzbpvi.xiaochengxv.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChecktaskEquipment implements Serializable {

	@JsonProperty("EQUIPADDRESS")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String equipaddress;
	@JsonProperty("EQUIPMENTTYPE")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String equipmenttype;
	@JsonProperty("INCHECKDATE")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String incheckdate;
	@JsonProperty("OUTCHECKDATE")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String outcheckdate;
	@JsonProperty("USENO")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String useno;
	@JsonProperty("REGISTERNO")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String registerno;

	public ChecktaskEquipment() {

	}

	public String getEquipaddress() {
		return equipaddress;
	}

	public void setEquipaddress(String equipaddress) {
		this.equipaddress = equipaddress;
	}

	public String getEquipmenttype() {
		return equipmenttype;
	}

	public void setEquipmenttype(String equipmenttype) {
		this.equipmenttype = equipmenttype;
	}

	public String getIncheckdate() {
		return incheckdate;
	}

	public void setIncheckdate(String incheckdate) {
		this.incheckdate = incheckdate;
	}

	public String getOutcheckdate() {
		return outcheckdate;
	}

	public void setOutcheckdate(String outcheckdate) {
		this.outcheckdate = outcheckdate;
	}

	public String getUseno() {
		return useno;
	}

	public void setUseno(String useno) {
		this.useno = useno;
	}

	public String getRegisterno() {
		return registerno;
	}

	public void setRegisterno(String registerno) {
		this.registerno = registerno;
	}

	public ChecktaskEquipment(String equipaddress, String equipmenttype, String incheckdate, String outcheckdate,
			String useno, String registerno) {
		super();
		this.equipaddress = equipaddress;
		this.equipmenttype = equipmenttype;
		this.incheckdate = incheckdate;
		this.outcheckdate = outcheckdate;
		this.useno = useno;
		this.registerno = registerno;
	}

}
