package org.gzbpvi.xiaochengxv.domain;

import java.io.Serializable;

public class NewUnit implements Serializable {
	private String checker;
	private String pickdate;
	private String latitude;
	private String longitude;
	private String address;
	private String newunit;
	private String grade;
	private String category;
	private String describe;
	private String filenamelist;
	private String pointId;
	private String polylineId;
	
	public NewUnit(String checker, String pickdate, String latitude, String longitude, String address, String newunit,
			String grade, String category, String describe, String filenamelist, String pointId, String polylineId) {
		this.checker = checker;
		this.pickdate = pickdate;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.newunit = newunit;
		this.grade = grade;
		this.category = category;
		this.describe = describe;
		this.filenamelist = filenamelist;
		this.pointId = pointId;
		this.polylineId = polylineId;
	}


	public NewUnit() {

	}


	public String getFilenamelist() {
		return filenamelist;
	}

	public void setFilenamelist(String filenamelist) {
		this.filenamelist = filenamelist;
	}

	public String getPointId() {
		return pointId;
	}

	public void setPointid(String pointId) {
		this.pointId = pointId;
	}

	public String getPolylineId() {
		return polylineId;
	}

	public void setPolylineid(String polylineId) {
		this.polylineId = polylineId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getPickdate() {
		return pickdate;
	}

	public void setPickdate(String pickdate) {
		this.pickdate = pickdate;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNewunit() {
		return newunit;
	}

	public void setNewunit(String newunit) {
		this.newunit = newunit;
	}
}
