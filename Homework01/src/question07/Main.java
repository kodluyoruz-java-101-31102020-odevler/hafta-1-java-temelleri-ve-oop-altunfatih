package question07;

import java.sql.Date;
import java.math.BigInteger;
import java.security.*;

public class Main {

	public static void main(String[] args) {
		
	}
}

class DatabaseOperations {
	public void open() {
		
	}
	
	public Report runQuery(String q) {
		
	}
}

class Printer {
	public Report print(Report r) {
		
	}
}

class Report {
	public String name;
	public String result;
	public Date createDate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}

class SalesReport extends Report {
	public String[] authorizedDepartments;

	public String[] getAuthorizedDepartments() {
		return authorizedDepartments;
	}

	public void setAuthorizedDepartments(String[] authorizedDepartments) {
		this.authorizedDepartments = authorizedDepartments;
	}
}

class PersonelReport extends Report {
	public String hashMD5Result() {
		 try { 
	            MessageDigest md = MessageDigest.getInstance("MD5"); 

	            byte[] messageDigest = md.digest(result.getBytes()); 
	  
	            BigInteger no = new BigInteger(1, messageDigest); 
	  
	            String hashtext = no.toString(16); 
	            while (hashtext.length() < 32) { 
	                hashtext = "0" + hashtext; 
	            } 
	            return hashtext; 
	        } 
	        catch (NoSuchAlgorithmException e) { 
	            throw new RuntimeException(e); 
	        }
	}
}