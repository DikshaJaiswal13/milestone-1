package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	public Company insertCompany(Company company) throws SQLException  {
		/*		Connection conn=DriverManager.getConnection("","test","test123");
		PreparedStatement ps=conn.prepareStatement("insert into company (clo) value(?,?,?,?,?)")
		ps.setInt(1, company.getCompanyId());
		ps.executeUpdate();
		*/
		return null;
	}

	
	public List<Company> getCompanyList() throws SQLException {
		List <Company> companyList=new ArrayList<Company>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/diksha","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			 company=new Company();
			 int companyId=rs.getInt("company_code");
			company.setCompanyId(companyId);
			
			String companyName=rs.getString("company_name");
			company.setCompanyName(companyName);
			
			Double turnover=rs.getDouble("turnover");
			company.setTurnover(turnover);
			
			company.setCeo(rs.getString("ceo"));
			
			company.setBoardOfDirectors(rs.getString("boardofdirectors"));
				
				  Sector sector=new Sector(); 
				 sector.setSectorId(rs.getInt("sector_id"));
				 sector.setBrief(rs.getString("breifWriteUp"));
				 sector.setStockCode(rs.getInt("stock_code"));
				  company.setSector(sector);
				 
			
			
			companyList.add(company);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}
