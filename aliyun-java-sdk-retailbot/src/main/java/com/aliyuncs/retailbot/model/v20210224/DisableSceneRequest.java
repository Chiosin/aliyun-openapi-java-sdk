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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DisableSceneRequest extends RpcAcsRequest<DisableSceneResponse> {
	   

	@SerializedName("knowledgeIds")
	private List<Long> knowledgeIds;

	private String operatorId;

	private String robotCode;

	private String operatorName;
	public DisableSceneRequest() {
		super("RetailBot", "2021-02-24", "DisableScene");
		setMethod(MethodType.POST);
	}

	public List<Long> getKnowledgeIds() {
		return this.knowledgeIds;
	}

	public void setKnowledgeIds(List<Long> knowledgeIds) {
		this.knowledgeIds = knowledgeIds;	
		if (knowledgeIds != null) {
			putBodyParameter("KnowledgeIds" , new Gson().toJson(knowledgeIds));
		}	
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putBodyParameter("OperatorId", operatorId);
		}
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	@Override
	public Class<DisableSceneResponse> getResponseClass() {
		return DisableSceneResponse.class;
	}

}
