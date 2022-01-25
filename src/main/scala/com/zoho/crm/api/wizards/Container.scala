package com.zoho.crm.api.wizards

import com.zoho.crm.api.layouts.Layout
import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class Container extends Model	{
	private var id:Option[Long] = None
	private var layout:Option[Layout] = None
	private var chartData:Option[ChartData] = None
	private var screens:ArrayBuffer[Screen] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getLayout() :Option[Layout]	={
		return  this.layout
	}

	def setLayout( layout: Option[Layout]) 	={
		 this.layout = layout
		 this.keyModified("layout") = 1
	}

	def getChartData() :Option[ChartData]	={
		return  this.chartData
	}

	def setChartData( chartData: Option[ChartData]) 	={
		 this.chartData = chartData
		 this.keyModified("chart_data") = 1
	}

	def getScreens() :ArrayBuffer[Screen]	={
		return  this.screens
	}

	def setScreens( screens: ArrayBuffer[Screen]) 	={
		 this.screens = screens
		 this.keyModified("screens") = 1
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