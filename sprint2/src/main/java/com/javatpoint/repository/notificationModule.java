/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.repository;


import java.util.ArrayList;

import com.javatpoint.model.notificationTemplate;

/**
 *
 * @author zezo
 */

public interface notificationModule {
    
	 public boolean create(notificationTemplate x);
	 public notificationTemplate update(notificationTemplate x);
	 public boolean delete(int id);
	 public notificationTemplate Read(int id);
	 public ArrayList<notificationTemplate> Search(String x);
}
