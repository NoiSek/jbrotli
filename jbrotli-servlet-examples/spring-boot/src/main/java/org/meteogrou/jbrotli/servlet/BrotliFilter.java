/*
 * Copyright (c) 2016 MeteoGroup Deutschland GmbH
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.meteogrou.jbrotli.servlet;

import org.meteogroup.jbrotli.servlet.BrotliServletFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns = "/*", initParams = {
    @WebInitParam(name = "brotli.compression.parameter.quality", value = "5"),    //  [0..11]
//        @WebInitParam(name = "brotli.compression.parameter.mode", value = "generic"), //  [generic, text, font]
//        @WebInitParam(name = "brotli.compression.parameter.lgwin", value = "22"),     //  [10..24]
//        @WebInitParam(name = "brotli.compression.parameter.lgblock", value = "0"),    //  [16..24]
})
public class BrotliFilter extends BrotliServletFilter {

}
