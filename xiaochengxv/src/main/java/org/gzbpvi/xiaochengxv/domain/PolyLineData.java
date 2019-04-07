package org.gzbpvi.xiaochengxv.domain;

public class PolyLineData {
	private String latitude;
	private String longitude;
	private String getpointtime;
	private String OAnum;
	private String uniqueID;
	private String polyLineId;

	public String getPolyLineId() {
		return polyLineId;
	}

	public void setPolyLineId(String polyLineId) {
		this.polyLineId = polyLineId;
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

	public String getGetpointtime() {
		return getpointtime;
	}

	public void setGetpointtime(String getpointtime) {
		this.getpointtime = getpointtime;
	}

	public String getOAnum() {
		return OAnum;
	}

	public void setOAnum(String oAnum) {
		OAnum = oAnum;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public PolyLineData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PolyLineData(String latitude, String longitude, String getpointtime,
			String oAnum, String uniqueID,String polylineID) {
		
		this.latitude = latitude;
		this.longitude = longitude;
		this.getpointtime = getpointtime;
		OAnum = oAnum;
		this.uniqueID = uniqueID;
		this.polyLineId = polylineID;
	}

}
