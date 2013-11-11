/**
 * Copyright 2013 Julien Silland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.soliton.protobuf;

/**
 * A null-object implementation of {@link ClientLogger}.
 *
 * @author Julien Silland (julien@soliton.io)
 */
public class NullClientLogger implements ClientLogger {
  @Override
  public void logMethodCall(ClientMethod<?> method) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void logClientError(ClientMethod<?> method, Throwable cause) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void logServerError(Throwable cause) {
    //To change body of implemented methods use File | Settings | File Templates.
  }
}