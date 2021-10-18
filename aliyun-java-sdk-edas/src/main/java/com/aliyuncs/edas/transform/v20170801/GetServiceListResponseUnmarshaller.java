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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetServiceListResponse;
import com.aliyuncs.edas.model.v20170801.GetServiceListResponse.MseServiceResponse;
import com.aliyuncs.edas.model.v20170801.GetServiceListResponse.MseServiceResponse.Method;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceListResponseUnmarshaller {

	public static GetServiceListResponse unmarshall(GetServiceListResponse getServiceListResponse, UnmarshallerContext _ctx) {
		
		getServiceListResponse.setCode(_ctx.integerValue("GetServiceListResponse.Code"));
		getServiceListResponse.setMessage(_ctx.stringValue("GetServiceListResponse.Message"));
		getServiceListResponse.setSuccess(_ctx.booleanValue("GetServiceListResponse.Success"));

		List<MseServiceResponse> data = new ArrayList<MseServiceResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceListResponse.Data.Length"); i++) {
			MseServiceResponse mseServiceResponse = new MseServiceResponse();
			mseServiceResponse.setEdasAppName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].EdasAppName"));
			mseServiceResponse.setDubboApplicationName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].DubboApplicationName"));
			mseServiceResponse.setVersion(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Version"));
			mseServiceResponse.setRegistryType(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].RegistryType"));
			mseServiceResponse.setSpringApplicationName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].SpringApplicationName"));
			mseServiceResponse.setServiceType(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].ServiceType"));
			mseServiceResponse.setServiceName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].ServiceName"));
			mseServiceResponse.setMetadata(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Metadata"));
			mseServiceResponse.setGroup(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Group"));

			List<Method> methods = new ArrayList<Method>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceListResponse.Data["+ i +"].Methods.Length"); j++) {
				Method method = new Method();
				method.setParameterDetails(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ParameterDetails"));
				method.setNameDetail(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].NameDetail"));
				method.setParameterNames(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ParameterNames"));
				method.setParameterDefinitions(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ParameterDefinitions"));
				method.setPaths(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].Paths"));
				method.setParameterTypes(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ParameterTypes"));
				method.setRequestMethods(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].RequestMethods"));
				method.setReturnDetails(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ReturnDetails"));
				method.setName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].Name"));
				method.setMethodController(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].MethodController"));
				method.setReturnType(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ReturnType"));

				methods.add(method);
			}
			mseServiceResponse.setMethods(methods);

			data.add(mseServiceResponse);
		}
		getServiceListResponse.setData(data);
	 
	 	return getServiceListResponse;
	}
}