/*
 * This file is part of SerialPundit.
 * 
 * Copyright (C) 2014-2016, Rishi Gupta. All rights reserved.
 *
 * The SerialPundit is DUAL LICENSED. It is made available under the terms of the GNU Affero 
 * General Public License (AGPL) v3.0 for non-commercial use and under the terms of a commercial 
 * license for commercial use of this software. 
 * 
 * The SerialPundit is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package stm32flashloader;

import java.util.concurrent.atomic.AtomicBoolean;

public final class GUIFrontend {

	private final Object lock = new Object();
	private final AtomicBoolean exitApplication = new AtomicBoolean(false);

	public void setUpGUIAndStart() {
		// TODO Auto-generated method stub
	}
}
