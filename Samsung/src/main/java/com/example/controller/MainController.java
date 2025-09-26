package com.example.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;

@RestController
public class MainController {
    
	@RequestMapping("/home")
	public String home() {
		return "home.html";
	}
	
	@RequestMapping("/samsung")
	public Devices samsung() {
		ModelAndView mv=new ModelAndView("/samsung");
		Device d1=new Device(1,"Galaxy s23 Ultra","Smart Phone--1");
		Device d2=new Device(2,"Galaxy s24 Ultra","Smart Phone--1");
		Device d3=new Device(3,"Galaxy s25 Ultra","Smart Phone--1");
		ArrayList<Device> myList=new ArrayList();
		myList.add(d1);
		myList.add(d2);
		myList.add(d3);
		Devices deviceList=new Devices(myList,"samsung");
		mv.addObject("samsung",deviceList);
		return deviceList;
	}
	
	@RequestMapping("/apple")
	public String apple() {
		return "apple.html";
	}
}
