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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeUserBizTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBizTypesResponse extends AcsResponse {

	private String requestId;

	private List<Item> bizTypeList;

	private List<Item> bizTypeListImport;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getBizTypeList() {
		return this.bizTypeList;
	}

	public void setBizTypeList(List<Item> bizTypeList) {
		this.bizTypeList = bizTypeList;
	}

	public List<Item> getBizTypeListImport() {
		return this.bizTypeListImport;
	}

	public void setBizTypeListImport(List<Item> bizTypeListImport) {
		this.bizTypeListImport = bizTypeListImport;
	}

	public static class Item {

		private String bizType;

		private String sourceBizType;

		private Boolean gray;

		private String source;

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getSourceBizType() {
			return this.sourceBizType;
		}

		public void setSourceBizType(String sourceBizType) {
			this.sourceBizType = sourceBizType;
		}

		public Boolean getGray() {
			return this.gray;
		}

		public void setGray(Boolean gray) {
			this.gray = gray;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}
	}

	@Override
	public DescribeUserBizTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserBizTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
