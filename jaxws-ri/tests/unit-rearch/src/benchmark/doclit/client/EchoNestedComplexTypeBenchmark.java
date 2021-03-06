/*
 * Copyright (c) 2004, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package benchmark.doclit.client;

/**
 * @author JAX-RPC RI Development Team
 */
public class EchoNestedComplexTypeBenchmark extends DoclitTest {
    
    public EchoNestedComplexTypeBenchmark(String name) {
        super(name);
    }

    public void testOnce() throws Exception {
		getStub().echoNestedComplexType(nestedComplexType);
    }
}
