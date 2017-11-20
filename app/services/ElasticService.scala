package services

import javax.inject._

import play.api.libs.ws.WSClient

@Singleton
class ElasticService @Inject() (ws: WSClient) {

  def searchBookByName(name: String) = {

  }

  def searchBookById(id: Int) = {

  }

  def addBook = {

  }

  def removeBook = {

  }


}
