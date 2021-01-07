package com.javatpoint.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Type;
import com.javatpoint.model.criteria;
import com.javatpoint.model.notificationTemplate;
import com.javatpoint.repository.NotificationDataBase;
//mark class as Controller

@RestController
public class notificationController 
{
@Autowired
NotificationDataBase notifi;

//add new notification
@PostMapping("/notifications")
private boolean addNotification(@RequestBody notificationTemplate notification) 
{
return	notifi.create(notification);
}

//update notification
@PutMapping("/upateNotifications")
private boolean update(@RequestBody notificationTemplate notification) 
{
	
return notifi.update(notification);
}


//get notification by type
@GetMapping("/notification/{Type}")
private notificationTemplate getNotification(@PathVariable("Type") Type type) 
{
return notifi.Read(type);
}

//get all notification
@GetMapping("/notification")

private ArrayList<notificationTemplate> getAllNotification() 
{
return notifi.readAll();
}

//delete notification with specific type
@DeleteMapping("/deletNotification/{Type}")
private boolean deleteNotification(@PathVariable("Type") Type type) 
{
	return notifi.delete(type);
}

//search for notification
@GetMapping("/SearchNotification/{criteria}")
private ArrayList<notificationTemplate> getNotification(@PathVariable("criteria") criteria searchCriteria) 
{
return notifi.Search(searchCriteria);
}


}
