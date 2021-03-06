/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package external_customize.server;

@jakarta.xml.ws.WebFault(name = "AddNumbersException", targetNamespace = "http://duke.example.org")
public class AddNumbersException extends Exception {
    String info;

    public AddNumbersException(String message, String detail) {
        super(message);
        this.info = detail;
    }

    public String getFaultInfo() {
        return info;
    }
}
