/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2009 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.j3c;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.WidgetCategory;

@WidgetCategory("Technical Debt")
public class J3cWidget extends AbstractRubyTemplate implements RubyRailsWidget  {

  /**
   * @return the page id
   */
  public String getId() {
    return J3cPlugin.PLUGIN_KEY;
  }

  /**
   * @return the page title
   */
  public String getTitle() {
    return J3cPlugin.PLUGIN_NAME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected String getTemplatePath() {
    return "/j3c_page.html.erb";
  }

}
