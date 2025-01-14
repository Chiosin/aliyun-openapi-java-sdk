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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLivePullStreamConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLivePullStreamConfigResponse extends AcsResponse {

	private String requestId;

	private List<LiveAppRecord> liveAppRecordList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveAppRecord> getLiveAppRecordList() {
		return this.liveAppRecordList;
	}

	public void setLiveAppRecordList(List<LiveAppRecord> liveAppRecordList) {
		this.liveAppRecordList = liveAppRecordList;
	}

	public static class LiveAppRecord {

		private String domainName;

		private String appName;

		private String streamName;

		private String sourceUrl;

		private String sourceUsing;

		private String startTime;

		private String endTime;

		private String always;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getSourceUrl() {
			return this.sourceUrl;
		}

		public void setSourceUrl(String sourceUrl) {
			this.sourceUrl = sourceUrl;
		}

		public String getSourceUsing() {
			return this.sourceUsing;
		}

		public void setSourceUsing(String sourceUsing) {
			this.sourceUsing = sourceUsing;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getAlways() {
			return this.always;
		}

		public void setAlways(String always) {
			this.always = always;
		}
	}

	@Override
	public DescribeLivePullStreamConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLivePullStreamConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
