package com.zoho.crm.api.fields

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class HistoryTracking extends Model	{
	private var module:Option[Module] = None
	private var durationConfiguredField:Option[Field] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getModule() :Option[Module]	={
		return  this.module
	}

	def setModule( module: Option[Module]) 	={
		 this.module = module
		 this.keyModified("module") = 1
	}

	def getDurationConfiguredField() :Option[Field]	={
		return  this.durationConfiguredField
	}

	def setDurationConfiguredField( durationConfiguredField: Option[Field]) 	={
		 this.durationConfiguredField = durationConfiguredField
		 this.keyModified("duration_configured_field") = 1
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