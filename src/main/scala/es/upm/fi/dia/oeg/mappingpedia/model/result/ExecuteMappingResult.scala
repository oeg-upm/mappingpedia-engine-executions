package es.upm.fi.dia.oeg.mappingpedia.model.result

import es.upm.fi.dia.oeg.mappingpedia.model._

class ExecuteMappingResult (
                             val errorCode:Integer, val status:String
                             , val mappingExecution:MappingExecution
                             , val mappingExecutionResult:AnnotatedDistribution
                           ){
  //val mappingDocument = mappingExecution.mappingDocument;
  val queryURL = if(mappingExecution != null) { mappingExecution.queryFileName } else { null }

  def this(errorCode:Integer, status:String) {
    this(errorCode, status, null, null
    )
  }

  val mappingDocumentDownloadURL = if(mappingExecution != null) {  mappingExecution.mdDownloadURL } else { null }
  def getMappingURL() = mappingDocumentDownloadURL;
  def getMapping_document_download_url() = mappingDocumentDownloadURL;
  def getMapping_document_hash() = if(mappingExecution != null) { mappingExecution.mdHash } else { null }

  def getQueryURL() = queryURL;
  def getQuery_file_download_url() = queryURL;

  //val mappingExecutionResultURL = mappingExecutionResult.dcatAccessURL
  //val mappingExecutionResultDownloadURL = mappingExecutionResult.getDownload_url;
  def getStatus() = status;
  def getErrorCode() = errorCode;
  def getStatus_code() = errorCode;

  def getMappingExecutionResultURL() = if(mappingExecutionResult == null) { null }
  else { mappingExecutionResult.dcatAccessURL; }

  def getMapping_execution_result_access_url() = if(mappingExecutionResult == null) { null }
  else { mappingExecutionResult.dcatAccessURL; }

  def getMapping_execution_result_download_url = if(mappingExecutionResult == null) { null }
  else { mappingExecutionResult.getDownload_url; }



  //def getCKAN_response_status = ckanResponseStatus;


  def getMapping_execution_result_id = if(mappingExecutionResult == null) { null }
    else { mappingExecutionResult.dctIdentifier }

  def getManifestURL = if(mappingExecutionResult == null) { null }
    else { this.mappingExecutionResult.manifestAccessURL }

  def getManifest_access_url = if(mappingExecutionResult == null) { null }
    else { this.mappingExecutionResult.manifestAccessURL }

  def getManifest_download_url = if(mappingExecutionResult == null) { null }
    else { this.mappingExecutionResult.manifestDownloadURL }

}
