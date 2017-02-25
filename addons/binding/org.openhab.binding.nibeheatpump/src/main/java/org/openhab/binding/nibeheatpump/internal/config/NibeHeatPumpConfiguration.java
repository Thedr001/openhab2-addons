/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.nibeheatpump.internal.config;

/**
 * Configuration class for {@link NibeHeatPumpBinding} device.
 *
 *
 * @author Pauli Anttila - Initial contribution
 */
public class NibeHeatPumpConfiguration {
    public String hostName;
    public int port;
    public int port4readCommands;
    public int port4writeCommands;
    public String serialPort;
    public int refreshInterval;
    public boolean enableReadCommands;
    public boolean enableWriteCommands;
    public boolean sendAckToMODBUS40;
    public boolean sendAckToRMU40;
    public boolean sendAckToSMS40;
    public String enableCoilsForWriteCommands;

    @Override
    public String toString() {
        String str = "";

        str += "hostName = " + hostName;
        str += ", port = " + port;
        str += ", port4readCommands = " + port4readCommands;
        str += ", port4writeCommands = " + port4writeCommands;
        str += ", serialPort = " + serialPort;
        str += ", refreshInterval = " + refreshInterval;
        str += ", enableReadCommands = " + enableReadCommands;
        str += ", enableWriteCommands = " + enableWriteCommands;
        str += ", sendAckToMODBUS40 = " + sendAckToMODBUS40;
        str += ", sendAckToRMU40 = " + sendAckToRMU40;
        str += ", sendAckToSMS40 = " + sendAckToSMS40;
        str += ", enableCoilsForWriteCommands = " + enableCoilsForWriteCommands;

        return str;
    }
}