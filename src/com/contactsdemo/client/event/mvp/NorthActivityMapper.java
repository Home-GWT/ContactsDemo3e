package com.contactsdemo.client.event.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.contactsdemo.client.view.IClientFactory;
import com.contactsdemo.client.event.activity.ToolBarActivity;
import com.contactsdemo.client.view.place.ContactEditPlace;
import com.contactsdemo.client.view.place.ContactPlace;

public class NorthActivityMapper implements ActivityMapper {

	private final IClientFactory clientFactory;

	public NorthActivityMapper(IClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof ContactPlace) {
			return new ToolBarActivity((ContactPlace) place, clientFactory);
		} else if (place instanceof ContactEditPlace) {
			return new ToolBarActivity((ContactEditPlace) place, clientFactory);
		}

		return null;
	}

}
