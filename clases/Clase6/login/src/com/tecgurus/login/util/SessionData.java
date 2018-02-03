package com.tecgurus.login.util;

import com.tecgurus.login.model.User;

public class SessionData {
	
	private static User currentUser;

	public static User getCurrentUser() {
		return currentUser;
	}

	public static void setCurrentUser(User currentUser) {
		SessionData.currentUser = currentUser;
	}

}
