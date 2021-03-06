/*
 * Copyright (c) 2013-2016 GraphAware
 *
 * This file is part of the GraphAware Framework.
 *
 * GraphAware Framework is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.neo4j;

import com.graphaware.neo4j.integration.helpers.ModuleIntegrationTest;
import com.graphaware.test.integration.GraphAwareIntegrationTest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TempTestBootstrapper extends ModuleIntegrationTest {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    @Test
    @Ignore("Included for manual server bootstrapping purposes")
    public void justWait() throws InterruptedException {
        Thread.sleep(10000000000L);
    }


}
