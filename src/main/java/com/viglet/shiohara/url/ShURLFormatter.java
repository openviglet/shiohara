/*
 * Copyright (C) 2016-2018 Alexandre Oliveira <alexandre.oliveira@viglet.com> 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.viglet.shiohara.url;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class ShURLFormatter {

	public String format(String URL) {

		String formattedURL = URL.toLowerCase();		
		formattedURL = formattedURL.replaceAll("&.+?;", " "); // kill entities
		formattedURL = StringUtils.stripAccents(formattedURL);
		formattedURL = formattedURL.replaceAll("\\.", "-");
		formattedURL = formattedURL.replaceAll("[^a-z0-9 _-]", "");
		formattedURL = formattedURL.replaceAll("\\s+", "-");
		formattedURL = StringUtils.strip(formattedURL, " -");
		return formattedURL;
	}
}
