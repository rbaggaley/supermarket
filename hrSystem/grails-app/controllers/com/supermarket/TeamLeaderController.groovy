package com.supermarket

class TeamLeaderController {

    def scaffold = TeamLeader
def login(){

}
def validateTeamLeader(){
	def user = TeamLeader.findByUserName(params.userName)
	if (user && user.password==params.password){
		session.user=user
		render view:'home'	
	}

	else{
		flash.message="Invalid username or password."
		render view:'login'
	}
}
def logoutTeamLeader={
	session.user=null
	redirect(url:'/')
}
}
