package com.own.university;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class University {

//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String getHTMLUniversityInfo(){
//		return "Name - Indian University HTML";
//	}
//	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getXMLUniversityInfo(){
//		return "Name - Indian University";
//	}
	
//	@GET
//	@Path("{studentRollNo}/{studentRollNo1}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getStudentInfo(@PathParam("studentRollNo") String studentRoll,
//								 @PathParam("studentRollNo1") String studentRoll1){
//		return "Roll no is " + studentRoll + " " + studentRoll1 + " we have received";
//	}
	
	@GET
	//@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudentInfo1(@QueryParam("studentRollNo1") String studentRollNo1,
								  @QueryParam("studentRollNo2") String studentRollNo2){
		return "Roll no is " + studentRollNo1 + " " + studentRollNo2 + " we have received";
	}
}
