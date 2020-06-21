package com.thrillio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.thrillio.DataStore;
import com.thrillio.entities.Book;
import com.thrillio.entities.Bookmark;
import com.thrillio.entities.Movie;
import com.thrillio.entities.UserBookmark;
import com.thrillio.entities.Weblink;

public class BookmarkDao {
	public List<List<Bookmark>> getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jid_thrillio?useSSL=false",
				"root", "Rebel@123")) {
			Statement smt = con.createStatement();
			if (userBookmark.getBookmark() instanceof Book) {
				saveUserBook(userBookmark, smt);
			} else if (userBookmark.getBookmark() instanceof Weblink) {
				saveUserWeblink(userBookmark, smt);
			} else {
				saveUserMovie(userBookmark, smt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DataStore.add(userBookmark);
	}

	private void saveUserMovie(UserBookmark userBookmark, Statement smt) {
		String query = "insert into User_Movie (user_id,movie_id) values (" + userBookmark.getUser().getId() + ","
				+ userBookmark.getBookmark().getId() + ");";
		try {
			smt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void saveUserWeblink(UserBookmark userBookmark, Statement smt) {
		String query = "insert into User_Weblink (user_id,weblink_id) values (" + userBookmark.getUser().getId() + ","
				+ userBookmark.getBookmark().getId() + ");";
		try {
			smt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void saveUserBook(UserBookmark userBookmark, Statement smt) {
		String query = "insert into User_Book (user_id,book_id) values (" + userBookmark.getUser().getId() + ","
				+ userBookmark.getBookmark().getId() + ");";
		try {
			smt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Weblink> getAllWeblinks() {
		List<Weblink> result = new ArrayList<>();
		List<List<Bookmark>> allBookmarks = DataStore.getBookmarks();
		List<Bookmark> weblinks = allBookmarks.get(0);
		for (Bookmark weblink : weblinks) {
			result.add((Weblink) weblink);
		}
		return result;
	}

	public List<Weblink> getWeblniks(Weblink.DownloadStatus downloadStatus) {
		List<Weblink> allWeblinks = getAllWeblinks();
		List<Weblink> result = new ArrayList<>();
		for (Weblink weblink : allWeblinks) {
			if (weblink.getDownloadStatus() == downloadStatus) {
				result.add(weblink);
			}
		}
		return result;
	}

	public static void setIsKidFriendlyStatus(Bookmark bookmark) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jid_thrillio?useSSL=false",
				"root", "Rebel@123")) {
			Statement smt = con.createStatement();
			String tableToUpdate = "Book";
			if (bookmark instanceof Movie) {
				tableToUpdate = "Movie";
			} else if (bookmark instanceof Weblink) {
				tableToUpdate = "Weblink";
			}

			String sql = "update " + tableToUpdate + " set kid_friendly_status="
					+ bookmark.getIsKidFriendlyStatus().ordinal() + ", kid_friendly_marked_by="
					+ bookmark.getKidFriendlyMarkedBy().getId()+" where id="+bookmark.getId()+";";
			smt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void share(Bookmark bookmark) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jid_thrillio?useSSL=false",
				"root", "Rebel@123")) {
			Statement smt = con.createStatement();
			String tableToUpdate = "Book";
			if(bookmark instanceof Weblink) {
				tableToUpdate = "Weblink";
			}
			String sql = "update " + tableToUpdate + " set shared_by="
					+ bookmark.getSharedBy().getId()+" where id="+bookmark.getId()+";";
			smt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
}
