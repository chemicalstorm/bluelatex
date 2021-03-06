/*
 * This file is part of the \BlueLaTeX project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gnieh.blue
package common.impl

import org.osgi.framework.{
  Bundle,
  ServiceRegistration,
  ServiceFactory
}
import org.osgi.service.log.LogService

class LogServiceFactory extends ServiceFactory[LogService] {

  def getService(bundle: Bundle, registration: ServiceRegistration[LogService]): LogService =
    new LogServiceImpl(bundle)

  def ungetService(bundle: Bundle, registration: ServiceRegistration[LogService], service: LogService): Unit =
    () // nothing to do

}

