package com.supermarket

class HrSystemTeamLeaderTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginTeamLeaderToggle={
	out << "<div style='margin:15px 0 40px;'>"
	if (request.getSession(false) && session.user){
		out << "<span style='float:left;margin-left:15px'>"
		out << "Welcome ${session.user}."
		out << "</span><span style='float:right;margin-right:15px'>"
		out << "<a href='${createLink(controller:'teamLeader',action:'logoutTeamLeader')}'>"
		out << "Team Leader Logout</a></span>"	
	}
	else{
		out << "<span style='float:right;margin-right:10px'>"
		out << "<a href='${createLink(controller:'teamLeader',action:'login')}'>"
		out << "Team Leader Login</a></span>"
	}
	out<<"<br/>"
}
}
