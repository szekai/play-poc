package controllers

import play.api._
import play.api.mvc._
import services.{SimpleUUIDGenerator}


object  Application extends Controller {
  private val logger: Logger = Logger(this.getClass())

  def index = Action {
    logger.info("Serving index page...")
    Ok(views.html.index())
  }

  def randomUUID = Action {
    logger.info("calling UUIDGenerator...")
    Ok(SimpleUUIDGenerator.generate.toString)
  }
}