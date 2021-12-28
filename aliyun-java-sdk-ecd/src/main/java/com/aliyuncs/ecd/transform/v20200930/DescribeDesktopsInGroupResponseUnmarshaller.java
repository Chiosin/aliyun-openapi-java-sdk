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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsInGroupResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsInGroupResponse.PaidDesktop;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopsInGroupResponse.PostPaidDesktop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopsInGroupResponseUnmarshaller {

	public static DescribeDesktopsInGroupResponse unmarshall(DescribeDesktopsInGroupResponse describeDesktopsInGroupResponse, UnmarshallerContext _ctx) {
		
		describeDesktopsInGroupResponse.setRequestId(_ctx.stringValue("DescribeDesktopsInGroupResponse.RequestId"));
		describeDesktopsInGroupResponse.setPostPaidDesktopsCount(_ctx.integerValue("DescribeDesktopsInGroupResponse.PostPaidDesktopsCount"));
		describeDesktopsInGroupResponse.setNextToken(_ctx.stringValue("DescribeDesktopsInGroupResponse.NextToken"));
		describeDesktopsInGroupResponse.setPaidDesktopsCount(_ctx.integerValue("DescribeDesktopsInGroupResponse.PaidDesktopsCount"));
		describeDesktopsInGroupResponse.setPostPaidDesktopsTotalAmount(_ctx.integerValue("DescribeDesktopsInGroupResponse.PostPaidDesktopsTotalAmount"));

		List<PaidDesktop> paidDesktops = new ArrayList<PaidDesktop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopsInGroupResponse.PaidDesktops.Length"); i++) {
			PaidDesktop paidDesktop = new PaidDesktop();
			paidDesktop.setEndUserId(_ctx.stringValue("DescribeDesktopsInGroupResponse.PaidDesktops["+ i +"].EndUserId"));
			paidDesktop.setDesktopStatus(_ctx.stringValue("DescribeDesktopsInGroupResponse.PaidDesktops["+ i +"].DesktopStatus"));
			paidDesktop.setDesktopName(_ctx.stringValue("DescribeDesktopsInGroupResponse.PaidDesktops["+ i +"].DesktopName"));
			paidDesktop.setConnectionStatus(_ctx.stringValue("DescribeDesktopsInGroupResponse.PaidDesktops["+ i +"].ConnectionStatus"));
			paidDesktop.setDesktopId(_ctx.stringValue("DescribeDesktopsInGroupResponse.PaidDesktops["+ i +"].DesktopId"));
			paidDesktop.setEndUserName(_ctx.stringValue("DescribeDesktopsInGroupResponse.PaidDesktops["+ i +"].EndUserName"));
			paidDesktop.setManagementFlag(_ctx.stringValue("DescribeDesktopsInGroupResponse.PaidDesktops["+ i +"].ManagementFlag"));

			paidDesktops.add(paidDesktop);
		}
		describeDesktopsInGroupResponse.setPaidDesktops(paidDesktops);

		List<PostPaidDesktop> postPaidDesktops = new ArrayList<PostPaidDesktop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopsInGroupResponse.PostPaidDesktops.Length"); i++) {
			PostPaidDesktop postPaidDesktop = new PostPaidDesktop();
			postPaidDesktop.setCreateDuration(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].CreateDuration"));
			postPaidDesktop.setEndUserId(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].EndUserId"));
			postPaidDesktop.setDesktopStatus(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].DesktopStatus"));
			postPaidDesktop.setCreateTime(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].CreateTime"));
			postPaidDesktop.setReleaseTime(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].ReleaseTime"));
			postPaidDesktop.setDesktopName(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].DesktopName"));
			postPaidDesktop.setConnectionStatus(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].ConnectionStatus"));
			postPaidDesktop.setDesktopId(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].DesktopId"));
			postPaidDesktop.setEndUserName(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].EndUserName"));
			postPaidDesktop.setManagementFlag(_ctx.stringValue("DescribeDesktopsInGroupResponse.PostPaidDesktops["+ i +"].ManagementFlag"));

			postPaidDesktops.add(postPaidDesktop);
		}
		describeDesktopsInGroupResponse.setPostPaidDesktops(postPaidDesktops);
	 
	 	return describeDesktopsInGroupResponse;
	}
}