package com.supermarket

class BootStrap {

    def init = { servletContext ->
	
	/*def Andy = new Manager(

		fullName:'Andy Williams',
		userName:'andy123',
		password:'andypassword',
		managerEmail:'andy@aol.com',
		office:'sheffield',
		department:'fresh produce').save()

	def Davy = new Manager(

		fullName:'Davy Tolin',
		userName:'davy123',
		password:'davypassword',
		managerEmail:'davy@aol.com',
		office:'sheffield',
		department:'fresh produce').save()

	def TeamA = new Team(
		
		teamName:'teamA',
		numberOfEmployees:5,
		sectionName:'bakery',
		description:'a description').save()

	def TeamB = new Team(
		
		teamName:'teamB',
		numberOfEmployees:8,
		sectionName: 'fresh produce',
		description:'a description').save()
	
	def Barry = new TeamLeader(

		fullName:'Barry Nolan',
		department:'grocery',
		employeeID:'BN123',
		sectionName:'bakery',
		officePhone:'01123 234356',
		leaderEmail:'andy@aol.com',
		password:'barry123',
		manager: Davy,
		team: TeamA).save()

	def Darren = new TeamLeader(

		fullName:'Darren White',
		department:'fresh produce',
		employeeID:'DW123',
		sectionName:'bakery',
		officePhone:'01123 234356',
		leaderEmail:'darren@aol.com',
		password:'darren123',
		manager: Andy,
		team: TeamB).save()

	def shiftMorning = new Shift(
		
		timeOfDay:'morning',
		dayOfWeek:'monday',
		numberOfHours:2,
		startingTime:'9:00am').save()

	def shiftAfternoon = new Shift(
		
		timeOfDay:'afternoon',
		dayOfWeek:'Wednesday',
		numberOfHours:2,
		startingTime:'12:00pm').save()

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

	def Eric = new Employee(

		fullName:'Eric Cartman',
		dateOfBirth:new Date ('09/09/2018'),
		residence:'sheffield',
		hourlyRate:6,
		employeeID:'EC123',
		dateEmployed:new Date('09/09/2017'),
		taxCode:'TX1',
		contract:'full-time',
		shift: shiftAfternoon,
		manager: Andy,
		teamLeader: Barry).save()	

	def Task1 = new Task(

		taskName:'task1',
		numberOfPeople:4,
		sectionName:'bakery',
		department:'groceries',
		timeRequired:'1 hour',
		description:'cleaning',
		taskCompleted:false).save()

	def Task2 = new Task(

		taskName:'task2',
		numberOfPeople:4,
		sectionName:'fruit',
		department:'groceries',
		timeRequired:'1 hour',
		description:'cleaning',
		taskCompleted:false).save()

	Davy.addToTeamLeaders(Barry)
	Andy.addToEmployees(Craig)
	Craig.addToShifts(shiftMorning)
	Barry.addToEmployees(Craig)

	Task1.addToShifts(shiftMorning)
	TeamA.addToEmployees(Craig)
	TeamA.addToTasks(Task1)
	TeamA.addToShifts(shiftMorning)*/


					
	
   } 
    def destroy = {
    }
}

