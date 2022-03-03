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

package com.aliyuncs.companyreg.model.v20201022;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.UpdateTaxationProcessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaxationProcessResponse extends AcsResponse {

	private String declareProcessType;

	private String requestId;

	private List<TaxItemDetailListItem> taxItemDetailList;

	public String getDeclareProcessType() {
		return this.declareProcessType;
	}

	public void setDeclareProcessType(String declareProcessType) {
		this.declareProcessType = declareProcessType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TaxItemDetailListItem> getTaxItemDetailList() {
		return this.taxItemDetailList;
	}

	public void setTaxItemDetailList(List<TaxItemDetailListItem> taxItemDetailList) {
		this.taxItemDetailList = taxItemDetailList;
	}

	public static class TaxItemDetailListItem {

		private Boolean isDeclared;

		private Boolean isPaid;

		private Boolean isDeclaredThisPeriod;

		private Integer taxTypeId;

		private String taxAmount;

		private String taxTypeName;

		private Long id;

		public Boolean getIsDeclared() {
			return this.isDeclared;
		}

		public void setIsDeclared(Boolean isDeclared) {
			this.isDeclared = isDeclared;
		}

		public Boolean getIsPaid() {
			return this.isPaid;
		}

		public void setIsPaid(Boolean isPaid) {
			this.isPaid = isPaid;
		}

		public Boolean getIsDeclaredThisPeriod() {
			return this.isDeclaredThisPeriod;
		}

		public void setIsDeclaredThisPeriod(Boolean isDeclaredThisPeriod) {
			this.isDeclaredThisPeriod = isDeclaredThisPeriod;
		}

		public Integer getTaxTypeId() {
			return this.taxTypeId;
		}

		public void setTaxTypeId(Integer taxTypeId) {
			this.taxTypeId = taxTypeId;
		}

		public String getTaxAmount() {
			return this.taxAmount;
		}

		public void setTaxAmount(String taxAmount) {
			this.taxAmount = taxAmount;
		}

		public String getTaxTypeName() {
			return this.taxTypeName;
		}

		public void setTaxTypeName(String taxTypeName) {
			this.taxTypeName = taxTypeName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public UpdateTaxationProcessResponse getInstance(UnmarshallerContext context) {
		return	UpdateTaxationProcessResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
