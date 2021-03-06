/*
 * Copyright (c) 2011-2018, Meituan Dianping. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dianping.zebra.shard.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "tableShardConfigs")
@XmlAccessorType(XmlAccessType.FIELD)
public class RouterRuleConfig implements Serializable {
   private static final long serialVersionUID = -3944193626687964466L;

	private List<TableShardRuleConfig> tableShardConfigs;

    public List<TableShardRuleConfig> getTableShardConfigs() {
        return tableShardConfigs;
    }

    public void setTableShardConfigs(List<TableShardRuleConfig> tableShardConfig) {
        this.tableShardConfigs = tableShardConfig;
    }
}
