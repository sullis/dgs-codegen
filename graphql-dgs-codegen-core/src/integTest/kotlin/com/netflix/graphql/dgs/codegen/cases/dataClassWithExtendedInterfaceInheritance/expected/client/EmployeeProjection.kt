package com.netflix.graphql.dgs.codegen.cases.dataClassWithExtendedInterfaceInheritance.expected.client

import com.netflix.graphql.dgs.client.codegen.InputValueSerializerInterface
import com.netflix.graphql.dgs.codegen.GraphQLProjection

public class EmployeeProjection(
  inputValueSerializer: InputValueSerializerInterface? = null,
) : GraphQLProjection(inputValueSerializer) {
  public val firstname: EmployeeProjection
    get() {
      field("firstname")
      return this
    }

  public val lastname: EmployeeProjection
    get() {
      field("lastname")
      return this
    }

  public val company: EmployeeProjection
    get() {
      field("company")
      return this
    }

  public val age: EmployeeProjection
    get() {
      field("age")
      return this
    }
}
