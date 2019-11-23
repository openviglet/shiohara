/*
 * Copyright (C) 2016-2019 Alexandre Oliveira <alexandre.oliveira@viglet.com> 
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

package com.viglet.shiohara.provider.otmm.bean.permission;

import java.util.List;

public class ShOTMMPermissionMapBean {

	private List<ShOTMMPermisionEntryBean> entry;

	public List<ShOTMMPermisionEntryBean> getEntry() {
		return entry;
	}

	public void setEntry(List<ShOTMMPermisionEntryBean> entry) {
		this.entry = entry;
	}

}
