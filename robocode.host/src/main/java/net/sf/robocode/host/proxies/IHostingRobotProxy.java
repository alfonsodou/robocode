/*******************************************************************************
 * Copyright (c) 2001-2013 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 *******************************************************************************/
package net.sf.robocode.host.proxies;



import net.sf.robocode.peer.ExecCommands;
import robocode.RobotStatus;


/**
 * @author Pavel Savara (original)
 */
public interface IHostingRobotProxy{

	void startRound(ExecCommands commands, RobotStatus status);

	void forceStopThread();

	void waitForStopThread();

	void cleanup();

//	Rectangle2D getBoundingBox();
//	void setBoundingBox(Rectangle2D rect);
//	void fire(int index);
}
