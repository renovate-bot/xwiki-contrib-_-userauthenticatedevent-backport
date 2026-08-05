/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.userauthenticatedevent.internal;

import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.security.authentication.UserAuthenticatedEventNotifier;

/**
 * The only purpose of this implementation is exist to that injection of {@link UserAuthenticatedEventNotifier} does not
 * failing in older version of XWiki.
 * 
 * @version $Id$
 */
@Component
@Singleton
public class VoidUserAuthenticatedEventNotifier implements UserAuthenticatedEventNotifier
{
    @Override
    public void notify(String userReference)
    {
        // Ignore
    }

    @Override
    public void notify(DocumentReference userReference)
    {
        // Ignore
    }
}
