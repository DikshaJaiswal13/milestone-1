package com.example.stockspring.model;



/*
 * public class Company {
 * 
 * private int companyId; private String boardOfDirectors; private Sector
 * sector;
 * 
 * public int getCompanyId() { return companyId; } public void setCompanyId(int
 * companyId) { this.companyId = companyId; } public String
 * getBoardOfDirectors() { return boardOfDirectors; } public void
 * setBoardOfDirectors(String boardOfDirectors) { this.boardOfDirectors =
 * boardOfDirectors; } public Sector getSector() { return sector; } public void
 * setSector(Sector sector) { this.sector = sector; }
 * 
 * public String toString(){ return
 * "id:"+this.getCompanyId()+" directors:"+this.getBoardOfDirectors(); } }
 */

public class Company {
	private int companyId;
	private String companyName;
	private double turnover;
	private String ceo;
	private String boardOfDirectors;
	private Sector sector;


	public Company() {
		super();
	}
	public Company(int companyId, String companyName, double turnover, String ceo, String boardOfDirectors,
			Sector sector) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.sector = sector;
	}
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public String toString() {
		return "id:"+this.getCompanyId()+" directors:"+this.getBoardOfDirectors();
	}

}


