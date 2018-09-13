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

package com.aliyuncs.trademark_inner.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class TrademarkDetailRequest extends RpcAcsRequest<TrademarkDetailResponse> {
	
	public TrademarkDetailRequest() {
		super("Trademark-inner", "2018-08-01", "TrademarkDetail", "trademark", "innerAPI");
	}

	private String uid;

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	@Override
	public Class<TrademarkDetailResponse> getResponseClass() {
		return TrademarkDetailResponse.class;
	}

}
