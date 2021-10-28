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

package com.aliyuncs.cloudauth.transform.v20201112;

import com.aliyuncs.cloudauth.model.v20201112.LivenessDetectResponse;
import com.aliyuncs.cloudauth.model.v20201112.LivenessDetectResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class LivenessDetectResponseUnmarshaller {

	public static LivenessDetectResponse unmarshall(LivenessDetectResponse livenessDetectResponse, UnmarshallerContext _ctx) {
		
		livenessDetectResponse.setRequestId(_ctx.stringValue("LivenessDetectResponse.RequestId"));
		livenessDetectResponse.setCode(_ctx.stringValue("LivenessDetectResponse.Code"));
		livenessDetectResponse.setMessage(_ctx.stringValue("LivenessDetectResponse.Message"));
		livenessDetectResponse.setSuccess(_ctx.booleanValue("LivenessDetectResponse.Success"));

		ResultObject resultObject = new ResultObject();
		resultObject.setScore(_ctx.floatValue("LivenessDetectResponse.ResultObject.Score"));
		resultObject.setFrameUrl(_ctx.stringValue("LivenessDetectResponse.ResultObject.FrameUrl"));
		resultObject.setPassed(_ctx.stringValue("LivenessDetectResponse.ResultObject.Passed"));
		livenessDetectResponse.setResultObject(resultObject);
	 
	 	return livenessDetectResponse;
	}
}