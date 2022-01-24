package com.zoho.crm.api.customviews

import com.zoho.crm.api.fields.Field
import com.zoho.crm.api.users.User
import com.zoho.crm.api.util.Model
import java.time.OffsetDateTime
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class CustomView extends Model	{
	private var id:Option[Long] = None
	private var name:Option[String] = None
	private var systemName:Option[String] = None
	private var displayValue:Option[String] = None
	private var createdTime:Option[OffsetDateTime] = None
	private var accessType:Option[String] = None
	private var category:Option[String] = None
	private var sortBy:Option[String] = None
	private var sortOrder:Option[String] = None
	private var favorite:Option[Int] = None
	private var default1:Option[Boolean] = None
	private var systemDefined:Option[Boolean] = None
	private var criteria:Option[Criteria] = None
	private var sharedTo:ArrayBuffer[SharedTo] = _
	private var fields:ArrayBuffer[Field] = _
	private var modifiedTime:Option[OffsetDateTime] = None
	private var modifiedBy:Option[User] = None
	private var lastAccessedTime:Option[OffsetDateTime] = None
	private var createdBy:Option[User] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getName() :Option[String]	={
		return  this.name
	}

	def setName( name: Option[String]) 	={
		 this.name = name
		 this.keyModified("name") = 1
	}

	def getSystemName() :Option[String]	={
		return  this.systemName
	}

	def setSystemName( systemName: Option[String]) 	={
		 this.systemName = systemName
		 this.keyModified("system_name") = 1
	}

	def getDisplayValue() :Option[String]	={
		return  this.displayValue
	}

	def setDisplayValue( displayValue: Option[String]) 	={
		 this.displayValue = displayValue
		 this.keyModified("display_value") = 1
	}

	def getCreatedTime() :Option[OffsetDateTime]	={
		return  this.createdTime
	}

	def setCreatedTime( createdTime: Option[OffsetDateTime]) 	={
		 this.createdTime = createdTime
		 this.keyModified("created_time") = 1
	}

	def getAccessType() :Option[String]	={
		return  this.accessType
	}

	def setAccessType( accessType: Option[String]) 	={
		 this.accessType = accessType
		 this.keyModified("access_type") = 1
	}

	def getCategory() :Option[String]	={
		return  this.category
	}

	def setCategory( category: Option[String]) 	={
		 this.category = category
		 this.keyModified("category") = 1
	}

	def getSortBy() :Option[String]	={
		return  this.sortBy
	}

	def setSortBy( sortBy: Option[String]) 	={
		 this.sortBy = sortBy
		 this.keyModified("sort_by") = 1
	}

	def getSortOrder() :Option[String]	={
		return  this.sortOrder
	}

	def setSortOrder( sortOrder: Option[String]) 	={
		 this.sortOrder = sortOrder
		 this.keyModified("sort_order") = 1
	}

	def getFavorite() :Option[Int]	={
		return  this.favorite
	}

	def setFavorite( favorite: Option[Int]) 	={
		 this.favorite = favorite
		 this.keyModified("favorite") = 1
	}

	def getDefault() :Option[Boolean]	={
		return  this.default1
	}

	def setDefault( default1: Option[Boolean]) 	={
		 this.default1 = default1
		 this.keyModified("default") = 1
	}

	def getSystemDefined() :Option[Boolean]	={
		return  this.systemDefined
	}

	def setSystemDefined( systemDefined: Option[Boolean]) 	={
		 this.systemDefined = systemDefined
		 this.keyModified("system_defined") = 1
	}

	def getCriteria() :Option[Criteria]	={
		return  this.criteria
	}

	def setCriteria( criteria: Option[Criteria]) 	={
		 this.criteria = criteria
		 this.keyModified("criteria") = 1
	}

	def getSharedTo() :ArrayBuffer[SharedTo]	={
		return  this.sharedTo
	}

	def setSharedTo( sharedTo: ArrayBuffer[SharedTo]) 	={
		 this.sharedTo = sharedTo
		 this.keyModified("shared_to") = 1
	}

	def getFields() :ArrayBuffer[Field]	={
		return  this.fields
	}

	def setFields( fields: ArrayBuffer[Field]) 	={
		 this.fields = fields
		 this.keyModified("fields") = 1
	}

	def getModifiedTime() :Option[OffsetDateTime]	={
		return  this.modifiedTime
	}

	def setModifiedTime( modifiedTime: Option[OffsetDateTime]) 	={
		 this.modifiedTime = modifiedTime
		 this.keyModified("modified_time") = 1
	}

	def getModifiedBy() :Option[User]	={
		return  this.modifiedBy
	}

	def setModifiedBy( modifiedBy: Option[User]) 	={
		 this.modifiedBy = modifiedBy
		 this.keyModified("modified_by") = 1
	}

	def getLastAccessedTime() :Option[OffsetDateTime]	={
		return  this.lastAccessedTime
	}

	def setLastAccessedTime( lastAccessedTime: Option[OffsetDateTime]) 	={
		 this.lastAccessedTime = lastAccessedTime
		 this.keyModified("last_accessed_time") = 1
	}

	def getCreatedBy() :Option[User]	={
		return  this.createdBy
	}

	def setCreatedBy( createdBy: Option[User]) 	={
		 this.createdBy = createdBy
		 this.keyModified("created_by") = 1
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