/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiResponse;
import java.math.BigDecimal;
import org.openapitools.client.model.ChildWithNullable;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.EnumClass;
import org.openapitools.client.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 */
public interface FakeApi {

  ApiResponse<FakeBigDecimalMap200Response> fakeBigDecimalMap();

 /**
  * Health check endpoint
  * @return {@code ApiResponse<HealthCheckResult>}
  */
  ApiResponse<HealthCheckResult> fakeHealthGet();

 /**
  * test http signature authentication
  * @param pet Pet object that needs to be added to the store (required)
  * @param query1 query parameter (optional)
  * @param header1 header parameter (optional)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> fakeHttpSignatureTest(Pet pet, String query1, String header1);

  ApiResponse<Boolean> fakeOuterBooleanSerialize(Boolean body);

  ApiResponse<OuterComposite> fakeOuterCompositeSerialize(OuterComposite outerComposite);

  ApiResponse<BigDecimal> fakeOuterNumberSerialize(BigDecimal body);

  ApiResponse<String> fakeOuterStringSerialize(String body);

  ApiResponse<OuterObjectWithEnumProperty> fakePropertyEnumIntegerSerialize(OuterObjectWithEnumProperty outerObjectWithEnumProperty);

 /**
  * test referenced additionalProperties
  * 
  * @param requestBody request body (required)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testAdditionalPropertiesReference(Map<String, Object> requestBody);

  ApiResponse<Void> testBodyWithBinary(File body);

  ApiResponse<Void> testBodyWithFileSchema(FileSchemaTestClass fileSchemaTestClass);

  ApiResponse<Void> testBodyWithQueryParams(String query, User user);

 /**
  * To test \&quot;client\&quot; model
  * To test \&quot;client\&quot; model
  * @param client client model (required)
  * @return {@code ApiResponse<Client>}
  */
  ApiResponse<Client> testClientModel(Client client);

 /**
  * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  * @param number None (required)
  * @param _double None (required)
  * @param patternWithoutDelimiter None (required)
  * @param _byte None (required)
  * @param integer None (optional)
  * @param int32 None (optional)
  * @param int64 None (optional)
  * @param _float None (optional)
  * @param string None (optional)
  * @param binary None (optional)
  * @param date None (optional)
  * @param dateTime None (optional)
  * @param password None (optional)
  * @param paramCallback None (optional)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, File binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback);

 /**
  * To test enum parameters
  * To test enum parameters
  * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
  * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
  * @param enumQueryStringArray Query parameter enum test (string array) (optional)
  * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
  * @param enumQueryInteger Query parameter enum test (double) (optional)
  * @param enumQueryDouble Query parameter enum test (double) (optional)
  * @param enumQueryModelArray  (optional)
  * @param enumFormStringArray Form parameter enum test (string array) (optional)
  * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<EnumClass> enumQueryModelArray, List<String> enumFormStringArray, String enumFormString);

 /**
  * Fake endpoint to test group parameters (optional)
  * Fake endpoint to test group parameters (optional)
  * @param requiredStringGroup Required String in group parameters (required)
  * @param requiredBooleanGroup Required Boolean in group parameters (required)
  * @param requiredInt64Group Required Integer in group parameters (required)
  * @param stringGroup String in group parameters (optional)
  * @param booleanGroup Boolean in group parameters (optional)
  * @param int64Group Integer in group parameters (optional)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testGroupParameters(Integer requiredStringGroup, Boolean requiredBooleanGroup, Long requiredInt64Group, Integer stringGroup, Boolean booleanGroup, Long int64Group);

 /**
  * test inline additionalProperties
  * 
  * @param requestBody request body (required)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testInlineAdditionalProperties(Map<String, String> requestBody);

 /**
  * test inline free-form additionalProperties
  * 
  * @param testInlineFreeformAdditionalPropertiesRequest request body (required)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testInlineFreeformAdditionalProperties(TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest);

 /**
  * test json serialization of form data
  * 
  * @param param field1 (required)
  * @param param2 field2 (required)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testJsonFormData(String param, String param2);

 /**
  * test nullable parent property
  * 
  * @param childWithNullable request body (required)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testNullable(ChildWithNullable childWithNullable);

  ApiResponse<Void> testQueryParameterCollectionFormat(List<String> pipe, List<String> ioutil, List<String> http, List<String> url, List<String> context, String allowEmpty, Map<String, String> language);

 /**
  * test referenced string map
  * 
  * @param requestBody request body (required)
  * @return {@code ApiResponse<Void>}
  */
  ApiResponse<Void> testStringMapReference(Map<String, String> requestBody);

}
