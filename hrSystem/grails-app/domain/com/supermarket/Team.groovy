package com.supermarket

class Team {

	String teamName
	int numberOfEmployees
	String sectionName
	String description

static hasMany=[employees:Employee, tasks:Task, shifts:Shift]

String toString(){
	return teamName
}

    static constraints = {

	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false
	sectionName blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'

    }
}
