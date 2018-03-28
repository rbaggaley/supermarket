package com.supermarket

class Employee {

	String fullName
	Date dateOfBirth
	String residence
	double hourlyRate
	String employeeID
	Date dateEmployed
	String taxCode
	String contract
	Shift shift
	Manager manager
	TeamLeader teamLeader

    static constraints = {

	fullName blank:false, nullable:false
	dateOfBirth blank:false, nullable:false
	residence blank:false, nullable:false
	hourlyRate blank:false, nullable:false, scale:2
	employeeID blank:false, nullable:false
	dateEmployed blank:false, nullable:false
	taxCode blank:false, nullable:false
	contract blank:false, nullable:false

    }
}
