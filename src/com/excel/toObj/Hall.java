package com.excel.toObj;

public class Hall {

	private String areaName;
	private String hallId;
	private String hallName;
	
	
	public String getHallId() {
		return hallId;
	}
	public void setHallId(String hallId) {
		this.hallId = hallId;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "Hall [hallId=" + hallId + ", hallName=" + hallName
				+ ", areaName=" + areaName + "]";
	}

	
}
