package com.zoho.crm.api.sendmail

import com.zoho.crm.api.attachments.Attachment
import com.zoho.crm.api.util.Model
import java.time.OffsetDateTime
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class Mail extends Model	{
	private var from:Option[UserAddress] = None
	private var to:ArrayBuffer[UserAddress] = _
	private var cc:ArrayBuffer[UserAddress] = _
	private var bcc:ArrayBuffer[UserAddress] = _
	private var replyTo:Option[UserAddress] = None
	private var template:Option[Template] = None
	private var email:Option[Int] = None
	private var id:Option[Long] = None
	private var inReplyTo:Option[String] = None
	private var scheduledTime:Option[OffsetDateTime] = None
	private var subject:Option[String] = None
	private var content:Option[String] = None
	private var paperType:Option[String] = None
	private var viewType:Option[String] = None
	private var mailFormat:Option[String] = None
	private var consentEmail:Option[Boolean] = None
	private var orgEmail:Option[Boolean] = None
	private var attachments:ArrayBuffer[Attachment] = _
	private var inventoryDetails:Option[InventoryDetails] = None
	private var dataSubjectRequest:Option[DataSubjectRequest] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getFrom() :Option[UserAddress]	={
		return  this.from
	}

	def setFrom( from: Option[UserAddress]) 	={
		 this.from = from
		 this.keyModified("from") = 1
	}

	def getTo() :ArrayBuffer[UserAddress]	={
		return  this.to
	}

	def setTo( to: ArrayBuffer[UserAddress]) 	={
		 this.to = to
		 this.keyModified("to") = 1
	}

	def getCc() :ArrayBuffer[UserAddress]	={
		return  this.cc
	}

	def setCc( cc: ArrayBuffer[UserAddress]) 	={
		 this.cc = cc
		 this.keyModified("cc") = 1
	}

	def getBcc() :ArrayBuffer[UserAddress]	={
		return  this.bcc
	}

	def setBcc( bcc: ArrayBuffer[UserAddress]) 	={
		 this.bcc = bcc
		 this.keyModified("bcc") = 1
	}

	def getReplyTo() :Option[UserAddress]	={
		return  this.replyTo
	}

	def setReplyTo( replyTo: Option[UserAddress]) 	={
		 this.replyTo = replyTo
		 this.keyModified("reply_to") = 1
	}

	def getTemplate() :Option[Template]	={
		return  this.template
	}

	def setTemplate( template: Option[Template]) 	={
		 this.template = template
		 this.keyModified("template") = 1
	}

	def getEmail() :Option[Int]	={
		return  this.email
	}

	def setEmail( email: Option[Int]) 	={
		 this.email = email
		 this.keyModified("email") = 1
	}

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getInReplyTo() :Option[String]	={
		return  this.inReplyTo
	}

	def setInReplyTo( inReplyTo: Option[String]) 	={
		 this.inReplyTo = inReplyTo
		 this.keyModified("in_reply_to") = 1
	}

	def getScheduledTime() :Option[OffsetDateTime]	={
		return  this.scheduledTime
	}

	def setScheduledTime( scheduledTime: Option[OffsetDateTime]) 	={
		 this.scheduledTime = scheduledTime
		 this.keyModified("scheduled_time") = 1
	}

	def getSubject() :Option[String]	={
		return  this.subject
	}

	def setSubject( subject: Option[String]) 	={
		 this.subject = subject
		 this.keyModified("subject") = 1
	}

	def getContent() :Option[String]	={
		return  this.content
	}

	def setContent( content: Option[String]) 	={
		 this.content = content
		 this.keyModified("content") = 1
	}

	def getPaperType() :Option[String]	={
		return  this.paperType
	}

	def setPaperType( paperType: Option[String]) 	={
		 this.paperType = paperType
		 this.keyModified("paper_type") = 1
	}

	def getViewType() :Option[String]	={
		return  this.viewType
	}

	def setViewType( viewType: Option[String]) 	={
		 this.viewType = viewType
		 this.keyModified("view_type") = 1
	}

	def getMailFormat() :Option[String]	={
		return  this.mailFormat
	}

	def setMailFormat( mailFormat: Option[String]) 	={
		 this.mailFormat = mailFormat
		 this.keyModified("mail_format") = 1
	}

	def getConsentEmail() :Option[Boolean]	={
		return  this.consentEmail
	}

	def setConsentEmail( consentEmail: Option[Boolean]) 	={
		 this.consentEmail = consentEmail
		 this.keyModified("consent_email") = 1
	}

	def getOrgEmail() :Option[Boolean]	={
		return  this.orgEmail
	}

	def setOrgEmail( orgEmail: Option[Boolean]) 	={
		 this.orgEmail = orgEmail
		 this.keyModified("org_email") = 1
	}

	def getAttachments() :ArrayBuffer[Attachment]	={
		return  this.attachments
	}

	def setAttachments( attachments: ArrayBuffer[Attachment]) 	={
		 this.attachments = attachments
		 this.keyModified("attachments") = 1
	}

	def getInventoryDetails() :Option[InventoryDetails]	={
		return  this.inventoryDetails
	}

	def setInventoryDetails( inventoryDetails: Option[InventoryDetails]) 	={
		 this.inventoryDetails = inventoryDetails
		 this.keyModified("inventory_details") = 1
	}

	def getDataSubjectRequest() :Option[DataSubjectRequest]	={
		return  this.dataSubjectRequest
	}

	def setDataSubjectRequest( dataSubjectRequest: Option[DataSubjectRequest]) 	={
		 this.dataSubjectRequest = dataSubjectRequest
		 this.keyModified("data_subject_request") = 1
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