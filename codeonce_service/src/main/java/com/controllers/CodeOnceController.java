package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.models.Request;
import com.models.Response;
import com.services.CodeOnceSerivce;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="Employee Management System", description="Operations pertaining to employee in Employee Management System")
public class CodeOnceController {

	@Autowired
	private CodeOnceSerivce codeOnceSerivce;
	
	private Response resp = new Response();
	
	@ApiOperation(value = "View a list of available employees")
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Successfully retrieved list"),
	    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@PostMapping("/send")
	ResponseEntity<Response>NumbreOcc(@RequestBody Request req){
		resp.setOccurence(codeOnceSerivce.NumbreOcc(req.getPhrase()));
		return ResponseEntity.ok(resp);
	}
}
