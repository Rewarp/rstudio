/*
 * XTermResources.java
 *
 * Copyright (C) 2009-16 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.terminal.xterm;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import org.rstudio.core.client.resources.StaticDataResource;

public interface XTermResources extends ClientBundle
{
   public static final XTermResources INSTANCE = GWT.create(XTermResources.class);
  
   @Source("xterm.js")
   StaticDataResource xtermjs();
   
   @Source("xterm-uncompressed.js")
   StaticDataResource xtermjsUncompressed();
   
   @Source("fit.js")
   StaticDataResource xtermfitjs();

   @Source("fit-uncompressed.js")
   StaticDataResource xtermfitjsUncompressed();
}
