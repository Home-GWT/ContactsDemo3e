package com.contactsdemo.client.event.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.contactsdemo.client.view.IClientFactory;
import com.contactsdemo.client.event.activity.ContactListActivity;
import com.contactsdemo.client.view.place.ContactPlace;

public class WestActivityMapper implements ActivityMapper {

	private final IClientFactory clientFactory;

	public WestActivityMapper(IClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof ContactPlace) {
			return new ContactListActivity((ContactPlace) place, clientFactory);
		}

		return null;
	}

}
