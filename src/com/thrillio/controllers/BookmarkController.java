package com.thrillio.controllers;

import com.thrillio.constants.KidFriendlyStatus;
import com.thrillio.entities.Bookmark;
import com.thrillio.entities.User;
import com.thrillio.managers.BookmarkManager;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();

	private BookmarkController() {
	};

	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
		
	}

	public void setIsKidFriendlyStatus(User user,Bookmark bookmark,KidFriendlyStatus kidFriendlyStatus) {
		BookmarkManager.getInstance().setIsKidFriendlyStatus(user,bookmark,kidFriendlyStatus);
		
	}

	public void share(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().share(user,bookmark);
	}
}
