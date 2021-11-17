// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.root_query_fragment_with_nested_fragments.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class HeroFragment(
  val __typename: String = "Character",
  /**
   * The name of the character
   */
  val name: String
) : GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
    writer.writeString(RESPONSE_FIELDS[0], this@HeroFragment.__typename)
    writer.writeString(RESPONSE_FIELDS[1], this@HeroFragment.name)
  }

  companion object {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null)
        )

    val FRAGMENT_DEFINITION: String = """
        |fragment heroFragment on Character {
        |  __typename
        |  name
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): HeroFragment = reader.run {
      val __typename = readString(RESPONSE_FIELDS[0])!!
      val name = readString(RESPONSE_FIELDS[1])!!
      HeroFragment(
        __typename = __typename,
        name = name
      )
    }

    @Suppress("FunctionName")
    fun Mapper(): ResponseFieldMapper<HeroFragment> = ResponseFieldMapper { invoke(it) }
  }
}