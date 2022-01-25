package com.zoho.crm.api.emailtemplates

import com.zoho.crm.api.modules.Module
import com.zoho.crm.api.sendmail.Template
import com.zoho.crm.api.users.User
import com.zoho.crm.api.util.Model
import java.time.OffsetDateTime
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class EmailTemplate extends Template with Model	{
	private var content:Option[String] = None
	private var createdTime:Option[OffsetDateTime] = None
	private var subject:Option[String] = None
	private var module:Option[Module] = None
	private var type1:Option[String] = None
	private var createdBy:Option[User] = None
	private var modifiedTime:Option[OffsetDateTime] = None
	private var lastUsageTime:Option[OffsetDateTime] = None
	private var associated:Option[Boolean] = None
	private var name:Option[String] = None
	private var modifiedBy:Option[User] = None
	private var description:Option[String] = None
	private var id:Option[Long] = None
	private var editorMode:Option[String] = None
	private var favorite:Option[Boolean] = None
	private var attachments:ArrayBuffer[Attachment] = _
	private var folder:Option[EmailTemplate] = None
	private var consentLinked:Option[Boolean] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getContent() :Option[String]	={
		return  this.content
	}

	def setContent( content: Option[String]) 	={
		 this.content = content
		 this.keyModified("content") = 1
	}

	def getCreatedTime() :Option[OffsetDateTime]	={
		return  this.createdTime
	}

	def setCreatedTime( createdTime: Option[OffsetDateTime]) 	={
		 this.createdTime = createdTime
		 this.keyModified("created_time") = 1
	}

	def getSubject() :Option[String]	={
		return  this.subject
	}

	def setSubject( subject: Option[String]) 	={
		 this.subject = subject
		 this.keyModified("subject") = 1
	}

	def getModule() :Option[Module]	={
		return  this.module
	}

	def setModule( module: Option[Module]) 	={
		 this.module = module
		 this.keyModified("module") = 1
	}

	def getType() :Option[String]	={
		return  this.type1
	}

	def setType( type1: Option[String]) 	={
		 this.type1 = type1
		 this.keyModified("type") = 1
	}

	def getCreatedBy() :Option[User]	={
		return  this.createdBy
	}

	def setCreatedBy( createdBy: Option[User]) 	={
		 this.createdBy = createdBy
		 this.keyModified("created_by") = 1
	}

	def getModifiedTime() :Option[OffsetDateTime]	={
		return  this.modifiedTime
	}

	def setModifiedTime( modifiedTime: Option[OffsetDateTime]) 	={
		 this.modifiedTime = modifiedTime
		 this.keyModified("modified_time") = 1
	}

	def getLastUsageTime() :Option[OffsetDateTime]	={
		return  this.lastUsageTime
	}

	def setLastUsageTime( lastUsageTime: Option[OffsetDateTime]) 	={
		 this.lastUsageTime = lastUsageTime
		 this.keyModified("last_usage_time") = 1
	}

	def getAssociated() :Option[Boolean]	={
		return  this.associated
	}

	def setAssociated( associated: Option[Boolean]) 	={
		 this.associated = associated
		 this.keyModified("associated") = 1
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

	def getEditorMode() :Option[String]	={
		return  this.editorMode
	}

	def setEditorMode( editorMode: Option[String]) 	={
		 this.editorMode = editorMode
		 this.keyModified("editor_mode") = 1
	}

	def getFavorite() :Option[Boolean]	={
		return  this.favorite
	}

	def setFavorite( favorite: Option[Boolean]) 	={
		 this.favorite = favorite
		 this.keyModified("favorite") = 1
	}

	def getAttachments() :ArrayBuffer[Attachment]	={
		return  this.attachments
	}

	def setAttachments( attachments: ArrayBuffer[Attachment]) 	={
		 this.attachments = attachments
		 this.keyModified("attachments") = 1
	}

	def getFolder() :Option[EmailTemplate]	={
		return  this.folder
	}

	def setFolder( folder: Option[EmailTemplate]) 	={
		 this.folder = folder
		 this.keyModified("folder") = 1
	}

	def getConsentLinked() :Option[Boolean]	={
		return  this.consentLinked
	}

	def setConsentLinked( consentLinked: Option[Boolean]) 	={
		 this.consentLinked = consentLinked
		 this.keyModified("consent_linked") = 1
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