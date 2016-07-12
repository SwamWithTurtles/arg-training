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

import com.graphaware.neo4j.config.ModuleConfiguration;
import com.graphaware.runtime.config.BaseTxAndTimerDrivenModuleConfiguration;
import com.graphaware.runtime.metadata.EmptyContext;
import com.graphaware.runtime.metadata.TimerDrivenModuleContext;
import com.graphaware.runtime.metadata.TxDrivenModuleMetadata;
import com.graphaware.runtime.module.DeliberateTransactionRollbackException;
import com.graphaware.runtime.module.TimerDrivenModule;
import com.graphaware.runtime.module.TxDrivenModule;
import com.graphaware.tx.event.improved.api.ImprovedTransactionData;
import org.neo4j.graphdb.GraphDatabaseService;

public class TxAndTimerDrivenModule implements TxDrivenModule, TimerDrivenModule {


    private final ModuleConfiguration config;
    private final String moduleId;
    private final GraphDatabaseService database;

    protected TxAndTimerDrivenModule(String moduleId, GraphDatabaseService database, ModuleConfiguration config) {
        this.moduleId = moduleId;
        this.database = database;
        this.config = config;
    }

    @Override
    public void start(GraphDatabaseService graphDatabaseService) {
    }


    @Override
    public Void beforeCommit(ImprovedTransactionData improvedTransactionData) throws DeliberateTransactionRollbackException {
        return null;
    }

    @Override
    public BaseTxAndTimerDrivenModuleConfiguration getConfiguration() {
        return config;
    }

    @Override
    public TimerDrivenModuleContext createInitialContext(GraphDatabaseService graphDatabaseService) {
        return new EmptyContext();
    }

    @Override
    public TimerDrivenModuleContext doSomeWork(TimerDrivenModuleContext timerDrivenModuleContext, GraphDatabaseService graphDatabaseService) {
        Integer b = 2+3;
        return new EmptyContext();
    }

    @Override
    public String getId() {
        return moduleId;
    }


    //Trivial Implementations

    @Override
    public void initialize(GraphDatabaseService graphDatabaseService) {
    }

    @Override
    public void reinitialize(GraphDatabaseService graphDatabaseService, TxDrivenModuleMetadata txDrivenModuleMetadata) {
    }

    @Override
    public void afterCommit(Object state) {
    }

    @Override
    public void afterRollback(Object state) {

    }

    @Override
    public void shutdown() {

    }
}
