/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainSpecialConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainSpecialConfigResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainSpecialConfigResponseUnmarshaller {

	public static DescribeLiveDomainSpecialConfigResponse unmarshall(DescribeLiveDomainSpecialConfigResponse describeLiveDomainSpecialConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainSpecialConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainSpecialConfigResponse.RequestId"));

		List<Config> configs = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainSpecialConfigResponse.Configs.Length"); i++) {
			Config config = new Config();
			config.setName(_ctx.stringValue("DescribeLiveDomainSpecialConfigResponse.Configs["+ i +"].Name"));
			config.setConfigId(_ctx.longValue("DescribeLiveDomainSpecialConfigResponse.Configs["+ i +"].ConfigId"));
			config.setValue(_ctx.stringValue("DescribeLiveDomainSpecialConfigResponse.Configs["+ i +"].Value"));

			configs.add(config);
		}
		describeLiveDomainSpecialConfigResponse.setConfigs(configs);
	 
	 	return describeLiveDomainSpecialConfigResponse;
	}
}