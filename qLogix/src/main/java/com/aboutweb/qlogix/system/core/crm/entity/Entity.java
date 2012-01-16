package com.aboutweb.qlogix.system.core.crm.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
@RooSerializable
public class Entity {
	
	// properties
	private Long id;
	private String type;
	private String searchMetadata;
	private Set<Locator> locators = new HashSet<Locator>(0);
	
	// constructor(s)
	public Entity() {}
	
	// getter & setter method(s)
	
}
