package com.example.stockspring.model;

public class Sector {
	
	private int sectorId;
	private String brief;
	private int stockCode;
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public Sector(int sectorId, String brief, int stockCode) {
		super();
		this.sectorId = sectorId;
		this.brief = brief;
		this.stockCode = stockCode;
	}
	public Sector() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
