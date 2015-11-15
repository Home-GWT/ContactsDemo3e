package com.contactsdemo.client.view.ui;

import com.contactsdemo.client.App;
import com.contactsdemo.client.event.mvp.AppPlaceHistoryMapper;
import com.contactsdemo.client.view.place.ContactEditPlace;
import com.contactsdemo.shared.Contact;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.octo.gwt.test.GwtCreateHandler;
import com.octo.gwt.test.GwtTest;
import com.octo.gwt.test.utils.events.Browser;
import com.contactsdemo.client.view.IClientFactory;
import com.contactsdemo.client.view.place.ContactPlace;

public class ListViewTest extends GwtTest {

	private AppPlaceHistoryMapper appPlaceHistoryMapper = new AppPlaceHistoryMapper() {

		@Override
		public String getToken(Place place) {
			if (place instanceof ContactPlace) {
				String token = ((ContactPlace) place).getToken();
				return token;
			} else if (place instanceof ContactEditPlace) {
				String token = ((ContactEditPlace) place).getToken();
				return token;
			}
			return null;
		}

		@Override
		public Place getPlace(String token) {
			System.out.println("AppPlaceHistoryMapper getPlace: " + token);
			return new ContactPlace(token);
		}
	};

	private class MyGwtCreateHandler implements GwtCreateHandler {

		@Override
		public Object create(Class<?> arg0) throws Exception {
			if (arg0 == AppPlaceHistoryMapper.class) {
				return appPlaceHistoryMapper;
			}
			return null;
		}

	}

	private IClientFactory clientFactory;

	@Override
	public String getModuleName() {
		return "com.contactsdemo.App";
	}

	@Before
	public void setupGwtTestSample() {
		addGwtCreateHandler(new MyGwtCreateHandler());

		App contactsDemo = new App();
		contactsDemo.onModuleLoad();
		clientFactory = contactsDemo.getClientFactory();
	}

	@Test
	public void checkClickOnFirstContact() {
		Browser.click(((ToolBarView) clientFactory.getToolBarView()).saveButton);
		IContactListView contactListView = clientFactory.getContactListView();
		CellTable<Contact>         table = ((ContactListView2) contactListView).cellTable;

		Browser.click(table, clientFactory.getContacts().get(0));

		String                     email = ((IContactDetailsView) clientFactory.getContactDetailsView()).getContactEmail();

		// After having clicked on the first contact in the list view, the email should be displayed in the email field of the details view
		Assert.assertEquals(clientFactory.getContacts().get(0).getEmail(), email);
	}
}
