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

import com.contactsdemo.shared.Contact;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.List;

@RemoteServiceRelativePath("contact")
public interface IContactService extends RemoteService {
	List<Contact> getAllContacts() throws IllegalArgumentException;

	Contact getContact(String email) throws IllegalArgumentException;

	void addContact(Contact contact);

	void deleteContact(Contact contact);

	void saveContact(Contact contact);
}
