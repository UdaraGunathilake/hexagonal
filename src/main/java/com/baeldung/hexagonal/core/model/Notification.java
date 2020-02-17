package com.baeldung.hexagonal.core.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notification implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int id;
    private String title;	
}
