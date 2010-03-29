/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/containerpage/shared/Attic/CmsContainerElement.java,v $
 * Date   : $Date: 2010/03/26 13:13:11 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.containerpage.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Bean holding all element information. Used for communication between client and server via RPC.<p>
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.0
 */
public class CmsContainerElement implements Serializable {

    private static final long serialVersionUID = 53971824834674417L;

    /** The element client id. */
    private String m_clientId;

    /** The contents by container type. */
    private Map<String, String> m_contents;

    /** The sub-container description. */
    private String m_description;

    /** The full file path. */
    private String m_file;

    private boolean m_isSubContainer;

    /** The last user modifying the element. */
    private String m_lastModifiedByUser;

    /** The date of last modification. */
    private long m_lastModifiedDate;

    /** The element navText property. */
    private String m_navText;

    /** The no edit reason. If empty editing is allowed. */
    private String m_noEditReason;

    /** The resource status. */
    private char m_status;

    /** The contained sub-item id's. */
    private List<String> m_subItems;

    /** The element title property. */
    private String m_title;

    /**
     * Returns the client id.<p>
     *
     * @return the client id
     */
    public String getClientId() {

        return m_clientId;
    }

    /**
     * Returns the contents.<p>
     *
     * @return the contents
     */
    public Map<String, String> getContents() {

        return m_contents;
    }

    /**
     * Returns the description.<p>
     *
     * @return the description
     */
    public String getDescription() {

        return m_description;
    }

    /**
     * Returns the file.<p>
     *
     * @return the file
     */
    public String getFile() {

        return m_file;
    }

    /**
     * Returns the last modifying user.<p>
     *
     * @return the last modifying user
     */
    public String getLastModifiedByUser() {

        return m_lastModifiedByUser;
    }

    /**
     * Returns the last modification date.<p>
     *
     * @return the last modification date
     */
    public long getLastModifiedDate() {

        return m_lastModifiedDate;
    }

    /**
     * Returns the navText.<p>
     *
     * @return the navText
     */
    public String getNavText() {

        return m_navText;
    }

    /**
     * Returns the no edit reason. If empty editing is allowed.<p>
     *
     * @return the no edit reason
     */
    public String getNoEditReason() {

        return m_noEditReason;
    }

    /**
     * Returns the status.<p>
     *
     * @return the status
     */
    public char getStatus() {

        return m_status;
    }

    /**
     * Returns the sub-items.<p>
     *
     * @return the sub-items
     */
    public List<String> getSubItems() {

        return m_subItems;
    }

    /**
     * Returns the title.<p>
     *
     * @return the title
     */
    public String getTitle() {

        return m_title;
    }

    /**
     * Returns if the element is a sub-container.<p>
     *
     * @return <code>true</code> if the element is a sub-container
     */
    public boolean isSubContainer() {

        if (m_subItems == null) {
            m_subItems = new ArrayList<String>();
        }
        return m_isSubContainer;
    }

    /**
     * Sets the client id.<p>
     *
     * @param clientId the client id to set
     */
    public void setClientId(String clientId) {

        m_clientId = clientId;
    }

    /**
     * Sets the contents.<p>
     *
     * @param contents the contents to set
     */
    public void setContents(Map<String, String> contents) {

        m_contents = contents;
    }

    /**
     * Sets the description.<p>
     *
     * @param description the description to set
     */
    public void setDescription(String description) {

        m_description = description;
    }

    /**
     * Sets the file.<p>
     *
     * @param file the file to set
     */
    public void setFile(String file) {

        m_file = file;
    }

    /**
     * Sets the modifying userdByUser.<p>
     *
     * @param lastModifiedByUser the last modifying user to set
     */
    public void setLastModifiedByUser(String lastModifiedByUser) {

        m_lastModifiedByUser = lastModifiedByUser;
    }

    /**
     * Sets the last modification date.<p>
     *
     * @param lastModifiedDate the last modification date to set
     */
    public void setLastModifiedDate(long lastModifiedDate) {

        m_lastModifiedDate = lastModifiedDate;
    }

    /**
     * Sets the navText.<p>
     *
     * @param navText the navText to set
     */
    public void setNavText(String navText) {

        m_navText = navText;
    }

    /**
     * Sets the no edit reason.<p>
     *
     * @param noEditReason the no edit reason to set
     */
    public void setNoEditReason(String noEditReason) {

        m_noEditReason = noEditReason;
    }

    /**
     * Sets the status.<p>
     *
     * @param status the status to set
     */
    public void setStatus(char status) {

        m_status = status;
    }

    /**
     * Sets whether the element is a sub-container.<p>
     *
     * @param isSubContainer <code>true</code> if the element is a sub-container
     */
    public void setSubContainer(boolean isSubContainer) {

        m_isSubContainer = isSubContainer;
    }

    /**
     * Sets the sub-items.<p>
     *
     * @param subItems the sub-items to set
     */
    public void setSubItems(List<String> subItems) {

        m_subItems = subItems;
    }

    /**
     * Sets the title.<p>
     *
     * @param title the title to set
     */
    public void setTitle(String title) {

        m_title = title;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append("Title: ").append(m_title).append("  File: ").append(m_file).append("  ClientId: ").append(
            m_clientId);
        return result.toString();
    }

}