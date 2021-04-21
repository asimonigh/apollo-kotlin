package com.apollographql.apollo3.api

/**
 * Represents a mapping from a custom GraphQL scalar type to a Java/Kotlin class
 */
class CustomScalar(
  /**
   * GraphQL schema custom scalar type name (e.g. `ID`, `URL`, `DateTime` etc.)
   */
  val graphqlName: String,

  /**
   * Fully qualified class name this GraphQL scalar type is mapped to (e.g. `java.lang.String`, `java.net.URL`, `java.util.DateTime`)
   */
  val className: String,
)

class Object(
    val typename: String,
    vararg val implements: Interface
)

class Interface(
    val typename: String,
    vararg implements: Interface
)

class Union(
    val typename: String,
    vararg val members: Object
)