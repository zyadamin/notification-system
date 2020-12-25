package com.javatpoint.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity  
//defining class name as Table name  
@Table  
public class notificationTemplate {
    static int idCount=1;
    @Id  
    @Column 
    int id;
    @Column  
    Type type;
    @Column  
    String content;
    @Column  
    Language language;
    @Column  
    Method method;

    public notificationTemplate() {
    }
    
    
 public notificationTemplate(int idCount, Type type, String content, Language language, Method method) {
		super();
        this.id=idCount;
		this.type = type;
		this.content = content;
		this.language = language;
		this.method = method;
        idCount++;

	}


public notificationTemplate(notificationTemplate x){
 
 x.id=this.id;
 x.content=this.content;
 x.language=this.language;
 x.method=this.method;
 x.type=this.type; 
 }
    
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    
    
    
    
    
}
