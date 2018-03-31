package com.supermarket

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class EmployeeControllerSpec extends Specification implements ControllerUnitTest<EmployeeController> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
	when: "A Employee has manager and teamLeader"
	def Craig = new Employee(

		fullName:'Craig Hall',
		dateOfBirth:new Date ('09/09/2018'),
		residence:'doncaster',
		hourlyRate:6,
		employeeID:'CH123',
		dateEmployed:new Date('09/09/2017'),
		taxCode:'TX1',
		contract:'full-time',
		shift: shiftMorning,
		manager: Andy,
		teamLeader: Barry).save()
		
	then: "the toString method will merge them"
	Craig.toString()=='Dave,Rob'
        
            true == false
    }
}
