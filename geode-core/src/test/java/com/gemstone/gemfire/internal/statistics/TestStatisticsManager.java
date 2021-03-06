/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gemstone.gemfire.internal.statistics;

import com.gemstone.gemfire.Statistics;
import com.gemstone.gemfire.StatisticsType;
import com.gemstone.gemfire.internal.AbstractStatisticsFactory;
import com.gemstone.gemfire.internal.OsStatisticsFactory;
import com.gemstone.gemfire.internal.StatisticsManager;

/**
 * @since GemFire 7.0
 */
public class TestStatisticsManager extends AbstractStatisticsFactory 
    implements StatisticsManager, OsStatisticsFactory {

  public TestStatisticsManager(long id, String name, long startTime) {
    super(id, name, startTime);
  }

  @Override
  public Statistics createOsStatistics(StatisticsType type, String textId,
      long numericId, int osStatFlags) {
    // TODO ?
    return null;
  }
}
