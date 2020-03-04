package com.neusoft.neuedu.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HigherResponse<T> {

	private HigherResponse(Integer status,T data) {
		this.status = status;
		this.data = data;
	}
	private HigherResponse(Integer status,String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	
	private Integer status;
	
	private T data;
	
	private String msg;
	
	
	// 成功提供对外公开的方法
	@JsonIgnore
	public boolean isResponseSuccess() {
		return this.status == StatusUtil.SUCCESSSTATUS;
	}
	// 成功构建status和data的方法
	public static <T> HigherResponse<T> getSuccessRespon(T data){
		return new HigherResponse(StatusUtil.SUCCESSSTATUS, data);
	}
	
	
	
	// 失败提供对外公开的方法
	@JsonIgnore
	public boolean isResponseFailed() {
		return this.status == StatusUtil.FAILEDSTATUS;
	}
	// 失败提供status和msg
	public static <T> HigherResponse<T> getFailedRespon(String msg){
		return new HigherResponse(StatusUtil.FAILEDSTATUS, msg);
	}
	
	
}