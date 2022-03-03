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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.ScanInvoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScanInvoiceResponse extends AcsResponse {

	private String code;

	private String requestId;

	private Boolean success;

	private Boolean isFee;

	private Invoice invoice;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Boolean getIsFee() {
		return this.isFee;
	}

	public void setIsFee(Boolean isFee) {
		this.isFee = isFee;
	}

	public Invoice getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public static class Invoice {

		private String invoiceNo;

		private Long id;

		private String baseTotalAmountWithoutTax;

		public String getInvoiceNo() {
			return this.invoiceNo;
		}

		public void setInvoiceNo(String invoiceNo) {
			this.invoiceNo = invoiceNo;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBaseTotalAmountWithoutTax() {
			return this.baseTotalAmountWithoutTax;
		}

		public void setBaseTotalAmountWithoutTax(String baseTotalAmountWithoutTax) {
			this.baseTotalAmountWithoutTax = baseTotalAmountWithoutTax;
		}
	}

	@Override
	public ScanInvoiceResponse getInstance(UnmarshallerContext context) {
		return	ScanInvoiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
