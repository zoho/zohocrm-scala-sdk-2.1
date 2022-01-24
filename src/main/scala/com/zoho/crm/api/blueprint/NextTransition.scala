package com.zoho.crm.api.blueprint

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class NextTransition extends Model	{
	private var id:Option[Long] = None
	private var criteriaMatched:Option[Boolean] = None
	private var name:Option[String] = None
	private var type1:Option[String] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getCriteriaMatched() :Option[Boolean]	={
		return  this.criteriaMatched
	}

	def setCriteriaMatched( criteriaMatched: Option[Boolean]) 	={
		 this.criteriaMatched = criteriaMatched
		 this.keyModified("criteria_matched") = 1
	}

	def getName() :Option[String]	={
		return  this.name
	}

	def setName( name: Option[String]) 	={
		 this.name = name
		 this.keyModified("name") = 1
	}

	def getType() :Option[String]	={
		return  this.type1
	}

	def setType( type1: Option[String]) 	={
		 this.type1 = type1
		 this.keyModified("type") = 1
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