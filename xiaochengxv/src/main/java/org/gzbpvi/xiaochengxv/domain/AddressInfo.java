package org.gzbpvi.xiaochengxv.domain;

import java.io.Serializable;

public class AddressInfo implements Serializable {

	private String name;
	private String address;
	private String longitude;
	private String latitude;

	public AddressInfo(String name, String address, String longitude, String latitude) {
		this.name = name;
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}
