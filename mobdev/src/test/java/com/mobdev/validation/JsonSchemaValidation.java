package com.mobdev.validation;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
public class JsonSchemaValidation {
   @Test
   public void validateJSONSchema(){


      RestAssured.baseURI = "http://localhost:8080/rickyandmorty/1";

      given()
      .when().get()

      .then().assertThat()
      .body(JsonSchemaValidator.
      matchesJsonSchema(new File("D:\\mobdev\\src\\main\\resources\\schema.json")));
   }
}