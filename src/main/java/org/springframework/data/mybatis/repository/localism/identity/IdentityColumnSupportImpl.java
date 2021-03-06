/*
 *
 *   Copyright 2016 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.springframework.data.mybatis.repository.localism.identity;

import org.springframework.data.mapping.model.MappingException;

/**
 * @author Jarvis Song
 */
public class IdentityColumnSupportImpl implements IdentityColumnSupport {
    @Override
    public boolean supportsIdentityColumns() {
        return false;
    }

    @Override
    public boolean supportsInsertSelectIdentity() {
        return false;
    }

    @Override
    public String appendIdentitySelectToInsert(String insertString) {
        return insertString;
    }

    @Override
    public String getIdentitySelectString(String table, String column, int type) throws MappingException {
        throw new MappingException(getClass().getName() + " does not support identity key generation");
    }

    @Override
    public String getIdentityColumnString(int type) throws MappingException {
        throw new MappingException(getClass().getName() + " does not support identity key generation");
    }

    @Override
    public String getIdentityInsertString() {
        return null;
    }
}
