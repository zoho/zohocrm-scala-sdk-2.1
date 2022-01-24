package com.zoho.crm.api.pipeline

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class Pipeline extends Model	{
	private var from:Option[Long] = None
	private var to:Option[Long] = None
	private var parent:Option[Pipeline] = None
	private var childAvailable:Option[Boolean] = None
	private var displayValue:Option[String] = None
	private var default1:Option[Boolean] = None
	private var maps:ArrayBuffer[PickListValue] = _
	private var actualValue:Option[String] = None
	private var id:Option[Long] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getFrom() :Option[Long]	={
		return  this.from
	}

	def setFrom( from: Option[Long]) 	={
		 this.from = from
		 this.keyModified("from") = 1
	}

	def getTo() :Option[Long]	={
		return  this.to
	}

	def setTo( to: Option[Long]) 	={
		 this.to = to
		 this.keyModified("to") = 1
	}

	def getParent() :Option[Pipeline]	={
		return  this.parent
	}

	def setParent( parent: Option[Pipeline]) 	={
		 this.parent = parent
		 this.keyModified("parent") = 1
	}

	def getChildAvailable() :Option[Boolean]	={
		return  this.childAvailable
	}

	def setChildAvailable( childAvailable: Option[Boolean]) 	={
		 this.childAvailable = childAvailable
		 this.keyModified("child_available") = 1
	}

	def getDisplayValue() :Option[String]	={
		return  this.displayValue
	}

	def setDisplayValue( displayValue: Option[String]) 	={
		 this.displayValue = displayValue
		 this.keyModified("display_value") = 1
	}

	def getDefault() :Option[Boolean]	={
		return  this.default1
	}

	def setDefault( default1: Option[Boolean]) 	={
		 this.default1 = default1
		 this.keyModified("default") = 1
	}

	def getMaps() :ArrayBuffer[PickListValue]	={
		return  this.maps
	}

	def setMaps( maps: ArrayBuffer[PickListValue]) 	={
		 this.maps = maps
		 this.keyModified("maps") = 1
	}

	def getActualValue() :Option[String]	={
		return  this.actualValue
	}

	def setActualValue( actualValue: Option[String]) 	={
		 this.actualValue = actualValue
		 this.keyModified("actual_value") = 1
	}

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
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