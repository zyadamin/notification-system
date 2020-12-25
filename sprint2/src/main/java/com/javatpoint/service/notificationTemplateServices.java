package com.javatpoint.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.notificationTemplate;
import com.javatpoint.repository.DataBase;

@Service
public class notificationTemplateServices 
{
@Autowired
DataBase notificationsRepository;

public notificationTemplate getnotificationsById(int id) 
{
return notificationsRepository.Read(id);
}


public boolean Save(notificationTemplate notifications) 
{
	
	return notificationsRepository.create(notifications);
}

public boolean delete(int id) 
{
	return notificationsRepository.delete(id);
}

public notificationTemplate update(notificationTemplate notifications) 
{
	notificationsRepository.update(notifications);
	return notifications;
}
}