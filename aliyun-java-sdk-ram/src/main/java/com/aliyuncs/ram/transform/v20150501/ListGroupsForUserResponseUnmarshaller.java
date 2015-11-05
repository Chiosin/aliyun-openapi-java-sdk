/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListGroupsForUserResponse;
import com.aliyuncs.ram.model.v20150501.ListGroupsForUserResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsForUserResponseUnmarshaller {

	public static ListGroupsForUserResponse unmarshall(ListGroupsForUserResponse listGroupsForUserResponse, UnmarshallerContext context) {
		
		listGroupsForUserResponse.setRequestId(context.stringValue("ListGroupsForUserResponse.RequestId"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("ListGroupsForUserResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(context.stringValue("ListGroupsForUserResponse.Groups["+ i +"].GroupName"));
			group.setComments(context.stringValue("ListGroupsForUserResponse.Groups["+ i +"].Comments"));
			group.setJoinDate(context.stringValue("ListGroupsForUserResponse.Groups["+ i +"].JoinDate"));

			groups.add(group);
		}
		listGroupsForUserResponse.setGroups(groups);
	 
	 	return listGroupsForUserResponse;
	}
}