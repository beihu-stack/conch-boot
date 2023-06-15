/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.nabob.conch.boot.mybatissample.init;

import com.nabob.conch.boot.autoconfigure.sqlinit.SqlFileInitializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 组件初始化
 * @author mazc@dibo.ltd
 * @version v2.0
 * @date 2020/11/28
 */
@Slf4j
@Component
@Order(910)
public class TestSqlInitializer implements ApplicationRunner {

    @Autowired(required = false)
    private SqlFileInitializer sqlFileInitializer;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (Objects.isNull(sqlFileInitializer)) {
            log.warn("sqlFileInitializer 不支持 初始化SQL.");
            return;
        }

        // 检查数据库字典是否已存在
        if (sqlFileInitializer.checkSqlTableExisted("org_account") == false) {
            sqlFileInitializer.initBootstrapSql(this.getClass(), "test");
            log.info("conch 初始化SQL完成.");
        } else {
            log.info("conch 跳过初始化SQL（已初始化过）.");
        }
    }
}
