package services

import java.util.UUID

/**
 * Created by szekai on 23/10/2014.
 */

/**
 * A type declaring the interface that will be injectable.
 */
trait UUIDGenerator {
  def generate: UUID
}

object SimpleUUIDGenerator extends UUIDGenerator{
  def generate: UUID = UUID.randomUUID()
}
