/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH (http://www.alkacon.com)
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

package org.opencms.search.fields;

import org.opencms.file.CmsObject;
import org.opencms.file.CmsProperty;
import org.opencms.file.CmsPropertyDefinition;
import org.opencms.file.CmsResource;
import org.opencms.search.I_CmsSearchDocument;
import org.opencms.search.extractors.I_CmsExtractionResult;
import org.opencms.util.CmsStringUtil;

import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Fieldable;

/**
 * Describes a field configuration using the old (pre 8.0) logic for categories that depend on properties.<p>
 * 
 * Configure this class for a search index field configuration in case you want the old behavior.<p>
 * 
 * @since 8.0.0 
 */
public class CmsSearchFieldConfigurationOldCategories extends CmsSearchFieldConfiguration {

    /**
     * Default constructor.<p>
     */
    public CmsSearchFieldConfigurationOldCategories() {

        // nothing special to to here
    }

    /**
     * @see org.opencms.search.fields.A_CmsSearchFieldConfiguration#appendCategories(org.opencms.search.I_CmsSearchDocument, org.opencms.file.CmsObject, org.opencms.file.CmsResource, org.opencms.search.extractors.I_CmsExtractionResult, java.util.List, java.util.List)
     */
    @Override
    protected I_CmsSearchDocument appendCategories(
        I_CmsSearchDocument document,
        CmsObject cms,
        CmsResource resource,
        I_CmsExtractionResult extractionResult,
        List<CmsProperty> properties,
        List<CmsProperty> propertiesSearched) {

        Document doc = (Document)document.getDocument();

        String value = CmsProperty.get(CmsPropertyDefinition.PROPERTY_SEARCH_CATEGORY, propertiesSearched).getValue();
        if (CmsStringUtil.isNotEmpty(value)) {
            value = value.trim().toLowerCase();
            if (value.length() > 0) {
                Fieldable field = new Field(
                    I_CmsSearchField.FIELD_CATEGORY,
                    value,
                    Field.Store.YES,
                    Field.Index.NOT_ANALYZED);

                field.setBoost(0.0F);
                doc.add(field);
            }
        }

        return document;
    }
}
