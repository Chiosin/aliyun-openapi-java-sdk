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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetEventLatencyInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEventLatencyInfoResponseUnmarshaller {

	public static GetEventLatencyInfoResponse unmarshall(GetEventLatencyInfoResponse getEventLatencyInfoResponse, UnmarshallerContext _ctx) {
		
		getEventLatencyInfoResponse.setRequestId(_ctx.stringValue("GetEventLatencyInfoResponse.RequestId"));
		getEventLatencyInfoResponse.setCode(_ctx.stringValue("GetEventLatencyInfoResponse.Code"));
		getEventLatencyInfoResponse.setMessage(_ctx.stringValue("GetEventLatencyInfoResponse.Message"));
		getEventLatencyInfoResponse.setData(_ctx.mapValue("GetEventLatencyInfoResponse.Data"));
		getEventLatencyInfoResponse.setSuccess(_ctx.stringValue("GetEventLatencyInfoResponse.Success"));
	 
	 	return getEventLatencyInfoResponse;
	}
}