package com.supermarket

class TeamLeader {

	String fullName
	String department
	String employeeID
	String userName
	String sectionName
	String officePhone
	String leaderEmail
	String password
	Manager manager
	Team team

static hasMany=[employees:Employee]

String toString(){
	return fullName
}

    static constraints = {

	fullName blank:false, nullable:false
	department blank:false, nullable:false
	employeeID blank:false, nullable:false
	userName blank:false, nullable:false
	sectionName blank:false, nullable:false
	officePhone blank:false, nullable:false
	leaderEmail blank:false, nullable:false, email:true
	password blank:false, nullable:false
    }
}
