/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package org.xrepl.ui.embedded;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;

import com.google.inject.Inject;

public class EmbeddedStateBasedContainerManager extends
		StateBasedContainerManager {

	@Inject
	private IResourceDescription.Manager descriptionManager;

	public EmbeddedStateBasedContainerManager() {
		super();
	}

	@Override
	public List<IContainer> getVisibleContainers(IResourceDescription desc,
			IResourceDescriptions resourceDescriptions) {
		return Collections.singletonList(createContainer("workspace", resourceDescriptions));
	}
	
	
	@Override
	protected String internalGetContainerHandle(IResourceDescription desc,
			IResourceDescriptions resourceDescriptions) {
		Resource resource = null;
		IResourceDescription parentDescription = null;
		if (desc instanceof DefaultResourceDescription) {
			DefaultResourceDescription resDesc = (DefaultResourceDescription) desc;
			resource = resDesc.getResource();
		}
		if (resource != null && resource instanceof EmbeddedXtextResource) {
			EmbeddedXtextResource embbeddedResource = (EmbeddedXtextResource) resource;
			Resource parentResource = embbeddedResource.getParentResource();
			parentDescription = descriptionManager
					.getResourceDescription(parentResource);
			return super.internalGetContainerHandle(parentDescription,
					resourceDescriptions);
		}
		return super.internalGetContainerHandle(desc, resourceDescriptions);
	}

}