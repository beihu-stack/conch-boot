package com.nabob.conch.builder.core.database.impl;
/**
 *  Copyright 2018 恒宇少年
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import com.nabob.conch.builder.common.CodeBuilderProperties;
import com.nabob.conch.builder.core.database.AbstractDataBase;

/**
 * Oracle数据库实现
 *
 * @author：于起宇
 * ===============================
 * Created with IDEA.
 * Date：2018/7/9
 * Time：11:41 AM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
public class OracleDataBase extends AbstractDataBase {

    public OracleDataBase(CodeBuilderProperties codeBuilderProperties) {
        super(codeBuilderProperties);
    }

    /**
     * 获取表的备注信息
     *
     * @param tableName 表名
     * @return 表备注信息
     */
    public String getTableComment(String tableName) {
        // TODO 暂未支持
        return null;
    }
}
