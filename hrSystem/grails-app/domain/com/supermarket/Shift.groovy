package com.supermarket

class Shift {
 	String timeOfDay
	String dayOfWeek
	int numberOfHours
 	String startingTime
	
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
