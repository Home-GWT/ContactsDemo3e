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

package com.contactsdemo.client.gwt_rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.contactsdemo.shared.Contact;

import java.util.List;

public interface IContactServiceAsync {

	void getAllContacts(AsyncCallback<List<Contact>> callback);

	void getContact(String email, AsyncCallback<Contact> callback);

	void addContact(Contact contact, AsyncCallback<Void> callback);

	void saveContact(Contact contact, AsyncCallback<Void> callback);

	void deleteContact(Contact contact, AsyncCallback<Void> callback);

}
