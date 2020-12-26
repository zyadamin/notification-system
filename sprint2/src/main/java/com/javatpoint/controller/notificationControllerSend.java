package com.javatpoint.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Notification;
//mark class as Controller


@RestController
public class notificationControllerSend
{
@Autowired
Notification notifi;

//creating a get mapping that retrieves the detail of a specific notification

@PostMapping("/sendNotification")
private boolean  sendNotification(@RequestBody Notification x)
{
return  notifi.getData(x) ;
}

}
