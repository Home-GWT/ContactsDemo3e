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

import com.contactsdemo.client.gwt_rpc.IContactService;
import com.contactsdemo.client.gwt_rpc.IContactServiceAsync;
import com.contactsdemo.client.view.ui.*;
import com.contactsdemo.shared.Contact;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

import java.util.List;

public class ClientFactory implements IClientFactory {
	private static final EventBus                      eventBus = new SimpleEventBus();
	private static final PlaceController        placeController = new PlaceController(eventBus);

	private static final IContactListView       contactListView = new ContactListView2();
	private static final IContactDetailsView contactDetailsView = new ContactDetailsView2();
	private static final IToolBarView               toolBarView = new ToolBarView();

    /**
     * gwt-tutorial-ru.pdf ...... Асинхронный вызовы ...... Создайте прокси сервисного класса ...... Создайте callback ...... страница #29-30
     * * * * * * * * * * * * * * * * * *
     * https://drive.google.com/file/d/0B418nT5Bo9w_engtSTdpVDllY2s/view ( https://github.com/Home-GWT/docs/blob/master/gwt-tutorial-ru.pdf )
     * Создайте прокси сервисного класса:
     * *********************************
     * Эта часть относится к виджету (...то есть, обращаемся к виджету через асинхронные запросы)
     */
	private final IContactServiceAsync           contactService = GWT.create(IContactService.class);
	private List<Contact>                              contacts;

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public IToolBarView getToolBarView() {
		return toolBarView;
	}

	@Override
	public IContactListView getContactListView() {
		return contactListView;
	}

	@Override
	public IContactDetailsView getContactDetailsView() {
		return contactDetailsView;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public IContactServiceAsync getContactService() {
		return contactService;
	}

	@Override
	public List<Contact> getContacts() {
		return contacts;
	}

	@Override
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
