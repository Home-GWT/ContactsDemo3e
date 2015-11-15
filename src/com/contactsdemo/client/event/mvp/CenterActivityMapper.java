package com.contactsdemo.client.event.mvp;

import com.contactsdemo.client.event.activity.ContactDetailsActivity;
import com.contactsdemo.client.view.place.ContactEditPlace;
import com.contactsdemo.client.view.place.ContactPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.contactsdemo.client.view.IClientFactory;

public class CenterActivityMapper implements ActivityMapper {

	private final IClientFactory clientFactory;

	public CenterActivityMapper(IClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof ContactPlace) {
			return new ContactDetailsActivity((ContactPlace) place, clientFactory);
		} else if (place instanceof ContactEditPlace) {
			return new ContactDetailsActivity((ContactEditPlace) place, clientFactory);
		}

		return null;
	}

}
