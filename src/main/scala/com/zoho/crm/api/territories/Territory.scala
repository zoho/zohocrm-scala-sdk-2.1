package com.zoho.crm.api.territories

import com.zoho.crm.api.customviews.Criteria
import com.zoho.crm.api.users.User
import com.zoho.crm.api.util.Model
import java.time.OffsetDateTime
import scala.collection.mutable.HashMap

class Territory extends Model	{
	private var createdTime:Option[OffsetDateTime] = None
	private var modifiedTime:Option[OffsetDateTime] = None
	private var manager:Option[User] = None
	private var accountRuleCriteria:Option[Criteria] = None
	private var dealRuleCriteria:Option[Criteria] = None
	private var name:Option[String] = None
	private var modifiedBy:Option[User] = None
	private var description:Option[String] = None
	private var id:Option[Long] = None
	private var createdBy:Option[User] = None
	private var reportingTo:Option[Territory] = None
	private var permissionType:Option[String] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getCreatedTime() :Option[OffsetDateTime]	={
		return  this.createdTime
	}

	def setCreatedTime( createdTime: Option[OffsetDateTime]) 	={
		 this.createdTime = createdTime
		 this.keyModified("created_time") = 1
	}

	def getModifiedTime() :Option[OffsetDateTime]	={
		return  this.modifiedTime
	}

	def setModifiedTime( modifiedTime: Option[OffsetDateTime]) 	={
		 this.modifiedTime = modifiedTime
		 this.keyModified("modified_time") = 1
	}

	def getManager() :Option[User]	={
		return  this.manager
	}

	def setManager( manager: Option[User]) 	={
		 this.manager = manager
		 this.keyModified("manager") = 1
	}

	def getAccountRuleCriteria() :Option[Criteria]	={
		return  this.accountRuleCriteria
	}

	def setAccountRuleCriteria( accountRuleCriteria: Option[Criteria]) 	={
		 this.accountRuleCriteria = accountRuleCriteria
		 this.keyModified("account_rule_criteria") = 1
	}

	def getDealRuleCriteria() :Option[Criteria]	={
		return  this.dealRuleCriteria
	}

	def setDealRuleCriteria( dealRuleCriteria: Option[Criteria]) 	={
		 this.dealRuleCriteria = dealRuleCriteria
		 this.keyModified("deal_rule_criteria") = 1
	}

	def getName() :Option[String]	={
		return  this.name
	}

	def setName( name: Option[String]) 	={
		 this.name = name
		 this.keyModified("name") = 1
	}

	def getModifiedBy() :Option[User]	={
		return  this.modifiedBy
	}

	def setModifiedBy( modifiedBy: Option[User]) 	={
		 this.modifiedBy = modifiedBy
		 this.keyModified("modified_by") = 1
	}

	def getDescription() :Option[String]	={
		return  this.description
	}

	def setDescription( description: Option[String]) 	={
		 this.description = description
		 this.keyModified("description") = 1
	}

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getCreatedBy() :Option[User]	={
		return  this.createdBy
	}

	def setCreatedBy( createdBy: Option[User]) 	={
		 this.createdBy = createdBy
		 this.keyModified("created_by") = 1
	}

	def getReportingTo() :Option[Territory]	={
		return  this.reportingTo
	}

	def setReportingTo( reportingTo: Option[Territory]) 	={
		 this.reportingTo = reportingTo
		 this.keyModified("reporting_to") = 1
	}

	def getPermissionType() :Option[String]	={
		return  this.permissionType
	}

	def setPermissionType( permissionType: Option[String]) 	={
		 this.permissionType = permissionType
		 this.keyModified("permission_type") = 1
	}

	def isKeyModified( key: String) :Any	={
		if((( this.keyModified.contains(key))))
		{
			return  this.keyModified(key)
		}
		return None
	}

	def setKeyModified( key: String,  modification: Int) 	={
		 this.keyModified(key) = modification
	}}