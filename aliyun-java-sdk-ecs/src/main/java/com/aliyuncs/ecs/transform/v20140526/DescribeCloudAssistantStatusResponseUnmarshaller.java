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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudAssistantStatusResponseUnmarshaller {

	public static DescribeCloudAssistantStatusResponse unmarshall(DescribeCloudAssistantStatusResponse describeCloudAssistantStatusResponse, UnmarshallerContext _ctx) {
		
		describeCloudAssistantStatusResponse.setRequestId(_ctx.stringValue("DescribeCloudAssistantStatusResponse.RequestId"));
		describeCloudAssistantStatusResponse.setPageSize(_ctx.longValue("DescribeCloudAssistantStatusResponse.PageSize"));
		describeCloudAssistantStatusResponse.setPageNumber(_ctx.longValue("DescribeCloudAssistantStatusResponse.PageNumber"));
		describeCloudAssistantStatusResponse.setTotalCount(_ctx.longValue("DescribeCloudAssistantStatusResponse.TotalCount"));

		List<InstanceCloudAssistantStatus> instanceCloudAssistantStatusSet = new ArrayList<InstanceCloudAssistantStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet.Length"); i++) {
			InstanceCloudAssistantStatus instanceCloudAssistantStatus = new InstanceCloudAssistantStatus();
			instanceCloudAssistantStatus.setCloudAssistantStatus(_ctx.stringValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].CloudAssistantStatus"));
			instanceCloudAssistantStatus.setLastInvokedTime(_ctx.stringValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].LastInvokedTime"));
			instanceCloudAssistantStatus.setCloudAssistantVersion(_ctx.stringValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].CloudAssistantVersion"));
			instanceCloudAssistantStatus.setActiveTaskCount(_ctx.longValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].ActiveTaskCount"));
			instanceCloudAssistantStatus.setInvocationCount(_ctx.longValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].InvocationCount"));
			instanceCloudAssistantStatus.setInstanceId(_ctx.stringValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].InstanceId"));
			instanceCloudAssistantStatus.setLastHeartbeatTime(_ctx.stringValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].LastHeartbeatTime"));
			instanceCloudAssistantStatus.setOSType(_ctx.stringValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].OSType"));
			instanceCloudAssistantStatus.setSupportSessionManager(_ctx.booleanValue("DescribeCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].SupportSessionManager"));

			instanceCloudAssistantStatusSet.add(instanceCloudAssistantStatus);
		}
		describeCloudAssistantStatusResponse.setInstanceCloudAssistantStatusSet(instanceCloudAssistantStatusSet);
	 
	 	return describeCloudAssistantStatusResponse;
	}
}