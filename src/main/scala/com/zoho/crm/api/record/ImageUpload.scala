package com.zoho.crm.api.record

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class ImageUpload extends Model	{
	private var description:Option[String] = None
	private var previewId:Option[String] = None
	private var encryptedId:Option[String] = None
	private var fileName:Option[String] = None
	private var state:Option[String] = None
	private var fileId:Option[String] = None
	private var size:Option[Long] = None
	private var sequenceNumber:Option[Int] = None
	private var id:Option[Long] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getDescription() :Option[String]	={
		return  this.description
	}

	def setDescription( description: Option[String]) 	={
		 this.description = description
		 this.keyModified("Description") = 1
	}

	def getPreviewId() :Option[String]	={
		return  this.previewId
	}

	def setPreviewId( previewId: Option[String]) 	={
		 this.previewId = previewId
		 this.keyModified("Preview_Id") = 1
	}

	def getEncryptedId() :Option[String]	={
		return  this.encryptedId
	}

	def setEncryptedId( encryptedId: Option[String]) 	={
		 this.encryptedId = encryptedId
		 this.keyModified("Encrypted_Id") = 1
	}

	def getFileName() :Option[String]	={
		return  this.fileName
	}

	def setFileName( fileName: Option[String]) 	={
		 this.fileName = fileName
		 this.keyModified("File_Name") = 1
	}

	def getState() :Option[String]	={
		return  this.state
	}

	def setState( state: Option[String]) 	={
		 this.state = state
		 this.keyModified("State") = 1
	}

	def getFileId() :Option[String]	={
		return  this.fileId
	}

	def setFileId( fileId: Option[String]) 	={
		 this.fileId = fileId
		 this.keyModified("File_Id") = 1
	}

	def getSize() :Option[Long]	={
		return  this.size
	}

	def setSize( size: Option[Long]) 	={
		 this.size = size
		 this.keyModified("Size") = 1
	}

	def getSequenceNumber() :Option[Int]	={
		return  this.sequenceNumber
	}

	def setSequenceNumber( sequenceNumber: Option[Int]) 	={
		 this.sequenceNumber = sequenceNumber
		 this.keyModified("Sequence_Number") = 1
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