package com.zoho.crm.api.pipeline

import com.zoho.crm.api.Param
import com.zoho.crm.api.exception.SDKException
import com.zoho.crm.api.util.APIResponse
import com.zoho.crm.api.util.CommonAPIHandler
import com.zoho.crm.api.util.Constants

class PipelineOperations(var layoutId: Option[Long]=None)	{

	def transferAndDelete( request: TransferAndDeleteWrapper) :Option[APIResponse[TransferActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/settings/pipeline/actions/transfer")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("CREATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		handlerInstance.addParam(new Param[Long]("layout_id", "com.zoho.crm.api.Pipeline.TransferAndDeleteParam"),  this.layoutId)
		return handlerInstance.apiCall(classOf[TransferActionHandler], "application/json")
	}

	def getPipelines() :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/settings/pipeline")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.addParam(new Param[Long]("layout_id", "com.zoho.crm.api.Pipeline.GetPipelinesParam"),  this.layoutId)
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def createPipelines( request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/settings/pipeline")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("CREATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		handlerInstance.addParam(new Param[Long]("layout_id", "com.zoho.crm.api.Pipeline.CreatePipelinesParam"),  this.layoutId)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def updatePipelines( request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/settings/pipeline")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		handlerInstance.addParam(new Param[Long]("layout_id", "com.zoho.crm.api.Pipeline.UpdatePipelinesParam"),  this.layoutId)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def getPipeline( pipelineId: Long) :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/settings/pipeline/")
		apiPath = apiPath.concat(pipelineId.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.addParam(new Param[Long]("layout_id", "com.zoho.crm.api.Pipeline.GetPipelineParam"),  this.layoutId)
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def updatePipeline( pipelineId: Long,  request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/settings/pipeline/")
		apiPath = apiPath.concat(pipelineId.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.addParam(new Param[Long]("layout_id", "com.zoho.crm.api.Pipeline.UpdatePipelineParam"),  this.layoutId)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}}
 object PipelineOperations{
class TransferAndDeleteParam		{
	}


class GetPipelinesParam		{
	}


class CreatePipelinesParam		{
	}


class UpdatePipelinesParam		{
	}


class GetPipelineParam		{
	}


class UpdatePipelineParam		{
	}
}
