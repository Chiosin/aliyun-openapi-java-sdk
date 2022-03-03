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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.ListBookkeepingStatisticsesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBookkeepingStatisticsesResponse extends AcsResponse {

	private Float taxAmountSum;

	private Float expendSum;

	private Float profitSum;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Float incomeSum;

	private Integer totalCount;

	private List<BookkeepingStatistics> bookkeepingStatisticses;

	public Float getTaxAmountSum() {
		return this.taxAmountSum;
	}

	public void setTaxAmountSum(Float taxAmountSum) {
		this.taxAmountSum = taxAmountSum;
	}

	public Float getExpendSum() {
		return this.expendSum;
	}

	public void setExpendSum(Float expendSum) {
		this.expendSum = expendSum;
	}

	public Float getProfitSum() {
		return this.profitSum;
	}

	public void setProfitSum(Float profitSum) {
		this.profitSum = profitSum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Float getIncomeSum() {
		return this.incomeSum;
	}

	public void setIncomeSum(Float incomeSum) {
		this.incomeSum = incomeSum;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<BookkeepingStatistics> getBookkeepingStatisticses() {
		return this.bookkeepingStatisticses;
	}

	public void setBookkeepingStatisticses(List<BookkeepingStatistics> bookkeepingStatisticses) {
		this.bookkeepingStatisticses = bookkeepingStatisticses;
	}

	public static class BookkeepingStatistics {

		private Float taxCjrbzj;

		private Float taxYhs;

		private Float income;

		private String taxAmountNote;

		private String taxFjsNote;

		private Integer year;

		private Integer subjectCount;

		private Float taxOther;

		private String taxGhjfNote;

		private String taxYhsNote;

		private Float expend;

		private Integer month;

		private Float taxQysds;

		private String taxSljjNote;

		private Float taxGhjf;

		private String taxQysdsNote;

		private String taxOtherNote;

		private String taxZzsNote;

		private Float taxZzs;

		private Float taxAmount;

		private Float taxFjs;

		private Integer voucherCount;

		private String produceBizId;

		private Float profit;

		private Float taxSljj;

		private String taxCjrbzjNote;

		private List<TaxDetail> taxDetails;

		public Float getTaxCjrbzj() {
			return this.taxCjrbzj;
		}

		public void setTaxCjrbzj(Float taxCjrbzj) {
			this.taxCjrbzj = taxCjrbzj;
		}

		public Float getTaxYhs() {
			return this.taxYhs;
		}

		public void setTaxYhs(Float taxYhs) {
			this.taxYhs = taxYhs;
		}

		public Float getIncome() {
			return this.income;
		}

		public void setIncome(Float income) {
			this.income = income;
		}

		public String getTaxAmountNote() {
			return this.taxAmountNote;
		}

		public void setTaxAmountNote(String taxAmountNote) {
			this.taxAmountNote = taxAmountNote;
		}

		public String getTaxFjsNote() {
			return this.taxFjsNote;
		}

		public void setTaxFjsNote(String taxFjsNote) {
			this.taxFjsNote = taxFjsNote;
		}

		public Integer getYear() {
			return this.year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Integer getSubjectCount() {
			return this.subjectCount;
		}

		public void setSubjectCount(Integer subjectCount) {
			this.subjectCount = subjectCount;
		}

		public Float getTaxOther() {
			return this.taxOther;
		}

		public void setTaxOther(Float taxOther) {
			this.taxOther = taxOther;
		}

		public String getTaxGhjfNote() {
			return this.taxGhjfNote;
		}

		public void setTaxGhjfNote(String taxGhjfNote) {
			this.taxGhjfNote = taxGhjfNote;
		}

		public String getTaxYhsNote() {
			return this.taxYhsNote;
		}

		public void setTaxYhsNote(String taxYhsNote) {
			this.taxYhsNote = taxYhsNote;
		}

		public Float getExpend() {
			return this.expend;
		}

		public void setExpend(Float expend) {
			this.expend = expend;
		}

		public Integer getMonth() {
			return this.month;
		}

		public void setMonth(Integer month) {
			this.month = month;
		}

		public Float getTaxQysds() {
			return this.taxQysds;
		}

		public void setTaxQysds(Float taxQysds) {
			this.taxQysds = taxQysds;
		}

		public String getTaxSljjNote() {
			return this.taxSljjNote;
		}

		public void setTaxSljjNote(String taxSljjNote) {
			this.taxSljjNote = taxSljjNote;
		}

		public Float getTaxGhjf() {
			return this.taxGhjf;
		}

		public void setTaxGhjf(Float taxGhjf) {
			this.taxGhjf = taxGhjf;
		}

		public String getTaxQysdsNote() {
			return this.taxQysdsNote;
		}

		public void setTaxQysdsNote(String taxQysdsNote) {
			this.taxQysdsNote = taxQysdsNote;
		}

		public String getTaxOtherNote() {
			return this.taxOtherNote;
		}

		public void setTaxOtherNote(String taxOtherNote) {
			this.taxOtherNote = taxOtherNote;
		}

		public String getTaxZzsNote() {
			return this.taxZzsNote;
		}

		public void setTaxZzsNote(String taxZzsNote) {
			this.taxZzsNote = taxZzsNote;
		}

		public Float getTaxZzs() {
			return this.taxZzs;
		}

		public void setTaxZzs(Float taxZzs) {
			this.taxZzs = taxZzs;
		}

		public Float getTaxAmount() {
			return this.taxAmount;
		}

		public void setTaxAmount(Float taxAmount) {
			this.taxAmount = taxAmount;
		}

		public Float getTaxFjs() {
			return this.taxFjs;
		}

		public void setTaxFjs(Float taxFjs) {
			this.taxFjs = taxFjs;
		}

		public Integer getVoucherCount() {
			return this.voucherCount;
		}

		public void setVoucherCount(Integer voucherCount) {
			this.voucherCount = voucherCount;
		}

		public String getProduceBizId() {
			return this.produceBizId;
		}

		public void setProduceBizId(String produceBizId) {
			this.produceBizId = produceBizId;
		}

		public Float getProfit() {
			return this.profit;
		}

		public void setProfit(Float profit) {
			this.profit = profit;
		}

		public Float getTaxSljj() {
			return this.taxSljj;
		}

		public void setTaxSljj(Float taxSljj) {
			this.taxSljj = taxSljj;
		}

		public String getTaxCjrbzjNote() {
			return this.taxCjrbzjNote;
		}

		public void setTaxCjrbzjNote(String taxCjrbzjNote) {
			this.taxCjrbzjNote = taxCjrbzjNote;
		}

		public List<TaxDetail> getTaxDetails() {
			return this.taxDetails;
		}

		public void setTaxDetails(List<TaxDetail> taxDetails) {
			this.taxDetails = taxDetails;
		}

		public static class TaxDetail {

			private Float amount;

			private Integer month;

			private Integer year;

			private String remark;

			private String taxName;

			public Float getAmount() {
				return this.amount;
			}

			public void setAmount(Float amount) {
				this.amount = amount;
			}

			public Integer getMonth() {
				return this.month;
			}

			public void setMonth(Integer month) {
				this.month = month;
			}

			public Integer getYear() {
				return this.year;
			}

			public void setYear(Integer year) {
				this.year = year;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getTaxName() {
				return this.taxName;
			}

			public void setTaxName(String taxName) {
				this.taxName = taxName;
			}
		}
	}

	@Override
	public ListBookkeepingStatisticsesResponse getInstance(UnmarshallerContext context) {
		return	ListBookkeepingStatisticsesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
