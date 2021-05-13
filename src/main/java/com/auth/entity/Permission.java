//package com.auth.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "permissions")
//public class Permission {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int perm_id;
//
//	@Enumerated(EnumType.STRING)
//	private Permissions pname;
//
//	public Permission() {
//	}
//
//	public Permission(Permissions pname) {
//		this.pname = pname;
//	}
//
//	public int getPerm_id() {
//		return perm_id;
//	}
//
//	public void setPerm_id(int perm_id) {
//		this.perm_id = perm_id;
//	}
//
//	public Permissions getPname() {
//		return pname;
//	}
//
//	public void setPname(Permissions pname) {
//		this.pname = pname;
//	}
//
//	
//
//}
