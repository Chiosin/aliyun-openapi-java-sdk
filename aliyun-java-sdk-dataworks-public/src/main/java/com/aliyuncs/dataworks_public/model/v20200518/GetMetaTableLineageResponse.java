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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetMetaTableLineageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableLineageResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextPrimaryKey;

		private Boolean hasNext;

		private List<DataEntityListItem> dataEntityList;

		public String getNextPrimaryKey() {
			return this.nextPrimaryKey;
		}

		public void setNextPrimaryKey(String nextPrimaryKey) {
			this.nextPrimaryKey = nextPrimaryKey;
		}

		public Boolean getHasNext() {
			return this.hasNext;
		}

		public void setHasNext(Boolean hasNext) {
			this.hasNext = hasNext;
		}

		public List<DataEntityListItem> getDataEntityList() {
			return this.dataEntityList;
		}

		public void setDataEntityList(List<DataEntityListItem> dataEntityList) {
			this.dataEntityList = dataEntityList;
		}

		public static class DataEntityListItem {

			private String tableName;

			private String tableGuid;

			private Long createTimestamp;

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getTableGuid() {
				return this.tableGuid;
			}

			public void setTableGuid(String tableGuid) {
				this.tableGuid = tableGuid;
			}

			public Long getCreateTimestamp() {
				return this.createTimestamp;
			}

			public void setCreateTimestamp(Long createTimestamp) {
				this.createTimestamp = createTimestamp;
			}
		}
	}

	@Override
	public GetMetaTableLineageResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTableLineageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
