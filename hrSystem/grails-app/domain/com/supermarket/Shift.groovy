package com.supermarket

class Shift {
 	String timeOfDay
	String dayOfWeek
	int numberOfHours
 	String startingTime

static hasMany=[tasks:Task, teams:Team]
static belongsTo=[Task, Team]
	
String toString(){
return timeOfDay
}

    static constraints = {
	timeOfDay blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false
	startingTime blank:false, nullable:false
    }
}
