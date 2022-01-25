package com.zoho.crm.api.record

import com.zoho.crm.api.record.Record
import com.zoho.crm.api.util.Model

class PriceBook extends Record with Model	{

	def getName() :Option[String]	={
		return  this.getKeyValue("name").asInstanceOf[Option[String]]
	}

	def setName( name: Option[String]) 	={
		 this.addKeyValue("name", name)
	}}