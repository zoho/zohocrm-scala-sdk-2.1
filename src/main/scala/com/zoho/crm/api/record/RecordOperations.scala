package com.zoho.crm.api.record

import com.zoho.crm.api.Header
import com.zoho.crm.api.HeaderMap
import com.zoho.crm.api.Param
import com.zoho.crm.api.ParameterMap
import com.zoho.crm.api.exception.SDKException
import com.zoho.crm.api.util.APIResponse
import com.zoho.crm.api.util.CommonAPIHandler
import com.zoho.crm.api.util.Utility
import java.time.OffsetDateTime
import com.zoho.crm.api.util.Constants

class RecordOperations	{
	def getRecord( id: Long,  moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def updateRecord( id: Long,  moduleAPIName: String,  request: BodyWrapper,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def deleteRecord( id: Long,  moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE)
		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE)
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def getRecords( moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def createRecords( moduleAPIName: String,  request: BodyWrapper,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("CREATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def updateRecords( moduleAPIName: String,  request: BodyWrapper,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def deleteRecords( moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE)
		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE)
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def upsertRecords( moduleAPIName: String,  request: BodyWrapper,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/upsert")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("ACTION")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def getDeletedRecords( moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[DeletedRecordsHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/deleted")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[DeletedRecordsHandler], "application/json")
	}

	def searchRecords( moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/search")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def convertLead( id: Long,  request: ConvertBodyWrapper) :Option[APIResponse[ConvertActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/Leads/")
		apiPath = apiPath.concat(id.toString())
		apiPath = apiPath.concat("/actions/convert")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("CREATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		Utility.getFields("Deals", handlerInstance)
		return handlerInstance.apiCall(classOf[ConvertActionHandler], "application/json")
	}

	def getPhoto( id: Long,  moduleAPIName: String) :Option[APIResponse[DownloadHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		apiPath = apiPath.concat("/photo")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[DownloadHandler], "application/x-download")
	}

	def uploadPhoto( id: Long,  moduleAPIName: String,  request: FileBodyWrapper) :Option[APIResponse[FileHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		apiPath = apiPath.concat("/photo")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("CREATE")
		handlerInstance.setContentType("multipart/form-data")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		Utility.getFields(moduleAPIName, handlerInstance)
		Utility.verifyPhotoSupport(moduleAPIName)
		return handlerInstance.apiCall(classOf[FileHandler], "application/json")
	}

	def deletePhoto( id: Long,  moduleAPIName: String) :Option[APIResponse[FileHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		apiPath = apiPath.concat("/photo")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE)
		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[FileHandler], "application/json")
	}

	def massUpdateRecords( moduleAPIName: String,  request: MassUpdateBodyWrapper) :Option[APIResponse[MassUpdateActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/actions/mass_update")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[MassUpdateActionHandler], "application/json")
	}

	def getMassUpdateStatus( moduleAPIName: String,  paramInstance: Option[ParameterMap]=None) :Option[APIResponse[MassUpdateResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/actions/mass_update")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.setParam(paramInstance)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[MassUpdateResponseHandler], "application/json")
	}

	def assignTerritoriesToMultipleRecords( moduleAPIName: String,  request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/actions/assign_territories")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def assignTerritoryToRecord( moduleAPIName: String,  id: Long,  request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		apiPath = apiPath.concat("/actions/assign_territories")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def removeTerritoriesFromMultipleRecords( moduleAPIName: String,  request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/actions/remove_territories")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def removeTerritoriesFromRecord( moduleAPIName: String,  id: Long,  request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(id.toString())
		apiPath = apiPath.concat("/actions/remove_territories")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def recordCount( moduleAPIName: String,  paramInstance: Option[ParameterMap]=None) :Option[APIResponse[CountHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/actions/count")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.setParam(paramInstance)
		return handlerInstance.apiCall(classOf[CountHandler], "application/json")
	}

	def getRecordUsingExternalId( externalFieldValue: String,  moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(externalFieldValue.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def updateRecordUsingExternalId( externalFieldValue: String,  moduleAPIName: String,  request: BodyWrapper,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(externalFieldValue.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setHeader(headerInstance)
		handlerInstance.setModuleAPIName(moduleAPIName)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def deleteRecordUsingExternalId( externalFieldValue: String,  moduleAPIName: String,  paramInstance: Option[ParameterMap]=None,  headerInstance: Option[HeaderMap]=None) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v2.1/")
		apiPath = apiPath.concat(moduleAPIName.toString())
		apiPath = apiPath.concat("/")
		apiPath = apiPath.concat(externalFieldValue.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE)
		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE)
		handlerInstance.setParam(paramInstance)
		handlerInstance.setHeader(headerInstance)
		Utility.getFields(moduleAPIName, handlerInstance)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}}
 object RecordOperations{
class GetRecordParam		{
		final val approved:Param[String] = new Param[String]("approved", "com.zoho.crm.api.Record.GetRecordParam")
		final val converted:Param[String] = new Param[String]("converted", "com.zoho.crm.api.Record.GetRecordParam")
		final val cvid:Param[String] = new Param[String]("cvid", "com.zoho.crm.api.Record.GetRecordParam")
		final val uid:Param[String] = new Param[String]("uid", "com.zoho.crm.api.Record.GetRecordParam")
		final val fields:Param[String] = new Param[String]("fields", "com.zoho.crm.api.Record.GetRecordParam")
		final val startDateTime:Param[OffsetDateTime] = new Param[OffsetDateTime]("startDateTime", "com.zoho.crm.api.Record.GetRecordParam")
		final val endDateTime:Param[OffsetDateTime] = new Param[OffsetDateTime]("endDateTime", "com.zoho.crm.api.Record.GetRecordParam")
		final val territoryId:Param[String] = new Param[String]("territory_id", "com.zoho.crm.api.Record.GetRecordParam")
		final val includeChild:Param[String] = new Param[String]("include_child", "com.zoho.crm.api.Record.GetRecordParam")
	}


class GetRecordHeader		{
		final val IfModifiedSince:Header[OffsetDateTime] = new Header[OffsetDateTime]("If-Modified-Since", "com.zoho.crm.api.Record.GetRecordHeader")
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.GetRecordHeader")
	}


class UpdateRecordHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.UpdateRecordHeader")
	}


class DeleteRecordParam		{
		final val wfTrigger:Param[Boolean] = new Param[Boolean]("wf_trigger", "com.zoho.crm.api.Record.DeleteRecordParam")
	}


class DeleteRecordHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.DeleteRecordHeader")
	}


class GetRecordsParam		{
		final val approved:Param[String] = new Param[String]("approved", "com.zoho.crm.api.Record.GetRecordsParam")
		final val converted:Param[String] = new Param[String]("converted", "com.zoho.crm.api.Record.GetRecordsParam")
		final val cvid:Param[String] = new Param[String]("cvid", "com.zoho.crm.api.Record.GetRecordsParam")
		final val ids:Param[String] = new Param[String]("ids", "com.zoho.crm.api.Record.GetRecordsParam")
		final val uid:Param[String] = new Param[String]("uid", "com.zoho.crm.api.Record.GetRecordsParam")
		final val fields:Param[String] = new Param[String]("fields", "com.zoho.crm.api.Record.GetRecordsParam")
		final val sortBy:Param[String] = new Param[String]("sort_by", "com.zoho.crm.api.Record.GetRecordsParam")
		final val sortOrder:Param[String] = new Param[String]("sort_order", "com.zoho.crm.api.Record.GetRecordsParam")
		final val page:Param[Int] = new Param[Int]("page", "com.zoho.crm.api.Record.GetRecordsParam")
		final val perPage:Param[Int] = new Param[Int]("per_page", "com.zoho.crm.api.Record.GetRecordsParam")
		final val startDateTime:Param[OffsetDateTime] = new Param[OffsetDateTime]("startDateTime", "com.zoho.crm.api.Record.GetRecordsParam")
		final val endDateTime:Param[OffsetDateTime] = new Param[OffsetDateTime]("endDateTime", "com.zoho.crm.api.Record.GetRecordsParam")
		final val territoryId:Param[String] = new Param[String]("territory_id", "com.zoho.crm.api.Record.GetRecordsParam")
		final val includeChild:Param[String] = new Param[String]("include_child", "com.zoho.crm.api.Record.GetRecordsParam")
	}


class GetRecordsHeader		{
		final val IfModifiedSince:Header[OffsetDateTime] = new Header[OffsetDateTime]("If-Modified-Since", "com.zoho.crm.api.Record.GetRecordsHeader")
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.GetRecordsHeader")
	}


class CreateRecordsHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.CreateRecordsHeader")
	}


class UpdateRecordsHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.UpdateRecordsHeader")
	}


class DeleteRecordsParam		{
		final val ids:Param[String] = new Param[String]("ids", "com.zoho.crm.api.Record.DeleteRecordsParam")
		final val wfTrigger:Param[Boolean] = new Param[Boolean]("wf_trigger", "com.zoho.crm.api.Record.DeleteRecordsParam")
	}


class DeleteRecordsHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.DeleteRecordsHeader")
	}


class UpsertRecordsHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.UpsertRecordsHeader")
	}


class GetDeletedRecordsParam		{
		final val type1:Param[String] = new Param[String]("type", "com.zoho.crm.api.Record.GetDeletedRecordsParam")
		final val page:Param[Int] = new Param[Int]("page", "com.zoho.crm.api.Record.GetDeletedRecordsParam")
		final val perPage:Param[Int] = new Param[Int]("per_page", "com.zoho.crm.api.Record.GetDeletedRecordsParam")
	}


class GetDeletedRecordsHeader		{
		final val IfModifiedSince:Header[OffsetDateTime] = new Header[OffsetDateTime]("If-Modified-Since", "com.zoho.crm.api.Record.GetDeletedRecordsHeader")
	}


class SearchRecordsParam		{
		final val criteria:Param[String] = new Param[String]("criteria", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val email:Param[String] = new Param[String]("email", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val phone:Param[String] = new Param[String]("phone", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val word:Param[String] = new Param[String]("word", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val converted:Param[String] = new Param[String]("converted", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val approved:Param[String] = new Param[String]("approved", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val page:Param[Int] = new Param[Int]("page", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val perPage:Param[Int] = new Param[Int]("per_page", "com.zoho.crm.api.Record.SearchRecordsParam")
		final val fields:Param[String] = new Param[String]("fields", "com.zoho.crm.api.Record.SearchRecordsParam")
	}


class SearchRecordsHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.SearchRecordsHeader")
	}


class GetMassUpdateStatusParam		{
		final val jobId:Param[String] = new Param[String]("job_id", "com.zoho.crm.api.Record.GetMassUpdateStatusParam")
	}


class RecordCountParam		{
		final val criteria:Param[String] = new Param[String]("criteria", "com.zoho.crm.api.Record.RecordCountParam")
		final val email:Param[String] = new Param[String]("email", "com.zoho.crm.api.Record.RecordCountParam")
		final val phone:Param[String] = new Param[String]("phone", "com.zoho.crm.api.Record.RecordCountParam")
		final val word:Param[String] = new Param[String]("word", "com.zoho.crm.api.Record.RecordCountParam")
	}


class GetRecordUsingExternalIDParam		{
		final val approved:Param[String] = new Param[String]("approved", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val converted:Param[String] = new Param[String]("converted", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val cvid:Param[String] = new Param[String]("cvid", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val uid:Param[String] = new Param[String]("uid", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val fields:Param[String] = new Param[String]("fields", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val startDateTime:Param[OffsetDateTime] = new Param[OffsetDateTime]("startDateTime", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val endDateTime:Param[OffsetDateTime] = new Param[OffsetDateTime]("endDateTime", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val territoryId:Param[String] = new Param[String]("territory_id", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
		final val includeChild:Param[String] = new Param[String]("include_child", "com.zoho.crm.api.Record.GetRecordUsingExternalIDParam")
	}


class GetRecordUsingExternalIDHeader		{
		final val IfModifiedSince:Header[OffsetDateTime] = new Header[OffsetDateTime]("If-Modified-Since", "com.zoho.crm.api.Record.GetRecordUsingExternalIDHeader")
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.GetRecordUsingExternalIDHeader")
	}


class UpdateRecordUsingExternalIDHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.UpdateRecordUsingExternalIDHeader")
	}


class DeleteRecordUsingExternalIDParam		{
		final val wfTrigger:Param[Boolean] = new Param[Boolean]("wf_trigger", "com.zoho.crm.api.Record.DeleteRecordUsingExternalIDParam")
	}


class DeleteRecordUsingExternalIDHeader		{
		final val XEXTERNAL:Header[String] = new Header[String]("X-EXTERNAL", "com.zoho.crm.api.Record.DeleteRecordUsingExternalIDHeader")
	}
}
