/*******************************************************************************
 * Copyright (c) 2012 Kai Toedter and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Toedter - initial API and implementation
 ******************************************************************************/

package com.contactsdemo.client.view;

import java.util.List;

import com.contactsdemo.client.gwt_rpc.IContactServiceAsync;
import com.contactsdemo.client.view.ui.IContactListView;
import com.contactsdemo.shared.Contact;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.contactsdemo.client.view.ui.IContactDetailsView;
import com.contactsdemo.client.view.ui.IToolBarView;

public interface IClientFactory {
	EventBus getEventBus();

	PlaceController getPlaceController();

	IContactListView getContactListView();

	IContactDetailsView getContactDetailsView();

	IToolBarView getToolBarView();

	IContactServiceAsync getContactService();

	List<Contact> getContacts();

	void setContacts(List<Contact> contacts);
}
