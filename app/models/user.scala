package models

/**
 * Created by szekai on 23/10/2014.
 */
case class User( age: Int,
                firstName: String,
                lastName: String,
                active: Boolean)

object JsonFormats {
  import play.api.libs.json.Json

  // Generates Writes and Reads for Feed and User thanks to Json Macros
  implicit val userFormat = Json.format[User]
}
