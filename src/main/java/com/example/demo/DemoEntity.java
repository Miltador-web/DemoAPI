package com.example.demo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class DemoEntity {
    private @Id @GeneratedValue Long Id;
    private String Name;
    private String Age;


}
