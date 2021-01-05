package com.javatpoint;

import java.io.IOException;

import com.javatpoint.model.Language;
import com.javatpoint.model.Method;
import com.javatpoint.model.Type;
import com.javatpoint.model.notificationTemplate;
import com.javatpoint.repository.File;

public class main {

	public static void main(String[] args) throws IOException {
		
File x=new File();
notificationTemplate y=new notificationTemplate();
y.setContent("Dear * , your booking of the * is confirmed. thanks for using our store ");
y.setLanguage(Language.english);
y.setType(Type.booking);
x.create(y);
x.update(2);
x.delete(2);
x.writeIntoFile();
	}

}
