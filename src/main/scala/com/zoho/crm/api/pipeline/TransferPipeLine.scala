package com.zoho.crm.api.pipeline

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class TransferPipeLine extends Model	{
	private var pipeline:Option[Pipeline] = None
	private var stages:ArrayBuffer[Stage] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getPipeline() :Option[Pipeline]	={
		return  this.pipeline
	}

	def setPipeline( pipeline: Option[Pipeline]) 	={
		 this.pipeline = pipeline
		 this.keyModified("pipeline") = 1
	}

	def getStages() :ArrayBuffer[Stage]	={
		return  this.stages
	}

	def setStages( stages: ArrayBuffer[Stage]) 	={
		 this.stages = stages
		 this.keyModified("stages") = 1
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