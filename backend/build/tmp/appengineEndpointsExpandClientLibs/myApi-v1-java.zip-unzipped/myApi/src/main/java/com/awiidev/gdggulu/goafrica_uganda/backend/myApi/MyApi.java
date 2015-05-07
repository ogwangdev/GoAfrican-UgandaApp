/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-30 at 02:15:31 UTC 
 * Modify at your own risk.
 */

package com.awiidev.gdggulu.goafrica_uganda.backend.myApi;

/**
 * Service definition for MyApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MyApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class MyApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.20.0 of the myApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://focused-century-87702.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "myApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public MyApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  MyApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getDishes".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetDishes#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetDishes getDishes() throws java.io.IOException {
    GetDishes result = new GetDishes();
    initialize(result);
    return result;
  }

  public class GetDishes extends MyApiRequest<com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBeanCollection> {

    private static final String REST_PATH = "dishbeancollection";

    /**
     * Create a request for the method "getDishes".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetDishes#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetDishes#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetDishes() {
      super(MyApi.this, "GET", REST_PATH, null, com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBeanCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetDishes setAlt(java.lang.String alt) {
      return (GetDishes) super.setAlt(alt);
    }

    @Override
    public GetDishes setFields(java.lang.String fields) {
      return (GetDishes) super.setFields(fields);
    }

    @Override
    public GetDishes setKey(java.lang.String key) {
      return (GetDishes) super.setKey(key);
    }

    @Override
    public GetDishes setOauthToken(java.lang.String oauthToken) {
      return (GetDishes) super.setOauthToken(oauthToken);
    }

    @Override
    public GetDishes setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetDishes) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetDishes setQuotaUser(java.lang.String quotaUser) {
      return (GetDishes) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetDishes setUserIp(java.lang.String userIp) {
      return (GetDishes) super.setUserIp(userIp);
    }

    @Override
    public GetDishes set(String parameterName, Object value) {
      return (GetDishes) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getReviews".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetReviews#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetReviews getReviews() throws java.io.IOException {
    GetReviews result = new GetReviews();
    initialize(result);
    return result;
  }

  public class GetReviews extends MyApiRequest<com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBeanCollection> {

    private static final String REST_PATH = "reviewbeancollection";

    /**
     * Create a request for the method "getReviews".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetReviews#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetReviews#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetReviews() {
      super(MyApi.this, "GET", REST_PATH, null, com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBeanCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetReviews setAlt(java.lang.String alt) {
      return (GetReviews) super.setAlt(alt);
    }

    @Override
    public GetReviews setFields(java.lang.String fields) {
      return (GetReviews) super.setFields(fields);
    }

    @Override
    public GetReviews setKey(java.lang.String key) {
      return (GetReviews) super.setKey(key);
    }

    @Override
    public GetReviews setOauthToken(java.lang.String oauthToken) {
      return (GetReviews) super.setOauthToken(oauthToken);
    }

    @Override
    public GetReviews setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetReviews) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetReviews setQuotaUser(java.lang.String quotaUser) {
      return (GetReviews) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetReviews setUserIp(java.lang.String userIp) {
      return (GetReviews) super.setUserIp(userIp);
    }

    @Override
    public GetReviews set(String parameterName, Object value) {
      return (GetReviews) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getReviewsForDish".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetReviewsForDish#execute()} method to invoke the remote operation.
   *
   * @param dishId
   * @return the request
   */
  public GetReviewsForDish getReviewsForDish(java.lang.Long dishId) throws java.io.IOException {
    GetReviewsForDish result = new GetReviewsForDish(dishId);
    initialize(result);
    return result;
  }

  public class GetReviewsForDish extends MyApiRequest<com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBeanCollection> {

    private static final String REST_PATH = "reviewbeancollection/{dishId}";

    /**
     * Create a request for the method "getReviewsForDish".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetReviewsForDish#execute()} method to invoke the remote operation.
     * <p> {@link GetReviewsForDish#initialize(com.google.api.client.googleapis.services.AbstractGoogl
     * eClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param dishId
     * @since 1.13
     */
    protected GetReviewsForDish(java.lang.Long dishId) {
      super(MyApi.this, "GET", REST_PATH, null, com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBeanCollection.class);
      this.dishId = com.google.api.client.util.Preconditions.checkNotNull(dishId, "Required parameter dishId must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetReviewsForDish setAlt(java.lang.String alt) {
      return (GetReviewsForDish) super.setAlt(alt);
    }

    @Override
    public GetReviewsForDish setFields(java.lang.String fields) {
      return (GetReviewsForDish) super.setFields(fields);
    }

    @Override
    public GetReviewsForDish setKey(java.lang.String key) {
      return (GetReviewsForDish) super.setKey(key);
    }

    @Override
    public GetReviewsForDish setOauthToken(java.lang.String oauthToken) {
      return (GetReviewsForDish) super.setOauthToken(oauthToken);
    }

    @Override
    public GetReviewsForDish setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetReviewsForDish) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetReviewsForDish setQuotaUser(java.lang.String quotaUser) {
      return (GetReviewsForDish) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetReviewsForDish setUserIp(java.lang.String userIp) {
      return (GetReviewsForDish) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long dishId;

    /**

     */
    public java.lang.Long getDishId() {
      return dishId;
    }

    public GetReviewsForDish setDishId(java.lang.Long dishId) {
      this.dishId = dishId;
      return this;
    }

    @Override
    public GetReviewsForDish set(String parameterName, Object value) {
      return (GetReviewsForDish) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "saveReview".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link SaveReview#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBean}
   * @return the request
   */
  public SaveReview saveReview(com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBean content) throws java.io.IOException {
    SaveReview result = new SaveReview(content);
    initialize(result);
    return result;
  }

  public class SaveReview extends MyApiRequest<Void> {

    private static final String REST_PATH = "saveReview";

    /**
     * Create a request for the method "saveReview".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link SaveReview#execute()} method to invoke the remote operation. <p>
     * {@link
     * SaveReview#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBean}
     * @since 1.13
     */
    protected SaveReview(com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.ReviewBean content) {
      super(MyApi.this, "POST", REST_PATH, content, Void.class);
    }

    @Override
    public SaveReview setAlt(java.lang.String alt) {
      return (SaveReview) super.setAlt(alt);
    }

    @Override
    public SaveReview setFields(java.lang.String fields) {
      return (SaveReview) super.setFields(fields);
    }

    @Override
    public SaveReview setKey(java.lang.String key) {
      return (SaveReview) super.setKey(key);
    }

    @Override
    public SaveReview setOauthToken(java.lang.String oauthToken) {
      return (SaveReview) super.setOauthToken(oauthToken);
    }

    @Override
    public SaveReview setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SaveReview) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SaveReview setQuotaUser(java.lang.String quotaUser) {
      return (SaveReview) super.setQuotaUser(quotaUser);
    }

    @Override
    public SaveReview setUserIp(java.lang.String userIp) {
      return (SaveReview) super.setUserIp(userIp);
    }

    @Override
    public SaveReview set(String parameterName, Object value) {
      return (SaveReview) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "searchDishes".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link SearchDishes#execute()} method to invoke the remote operation.
   *
   * @param searchTerm
   * @return the request
   */
  public SearchDishes searchDishes(java.lang.String searchTerm) throws java.io.IOException {
    SearchDishes result = new SearchDishes(searchTerm);
    initialize(result);
    return result;
  }

  public class SearchDishes extends MyApiRequest<com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBeanCollection> {

    private static final String REST_PATH = "searchDishes/{searchTerm}";

    /**
     * Create a request for the method "searchDishes".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link SearchDishes#execute()} method to invoke the remote operation. <p>
     * {@link
     * SearchDishes#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param searchTerm
     * @since 1.13
     */
    protected SearchDishes(java.lang.String searchTerm) {
      super(MyApi.this, "POST", REST_PATH, null, com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBeanCollection.class);
      this.searchTerm = com.google.api.client.util.Preconditions.checkNotNull(searchTerm, "Required parameter searchTerm must be specified.");
    }

    @Override
    public SearchDishes setAlt(java.lang.String alt) {
      return (SearchDishes) super.setAlt(alt);
    }

    @Override
    public SearchDishes setFields(java.lang.String fields) {
      return (SearchDishes) super.setFields(fields);
    }

    @Override
    public SearchDishes setKey(java.lang.String key) {
      return (SearchDishes) super.setKey(key);
    }

    @Override
    public SearchDishes setOauthToken(java.lang.String oauthToken) {
      return (SearchDishes) super.setOauthToken(oauthToken);
    }

    @Override
    public SearchDishes setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SearchDishes) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SearchDishes setQuotaUser(java.lang.String quotaUser) {
      return (SearchDishes) super.setQuotaUser(quotaUser);
    }

    @Override
    public SearchDishes setUserIp(java.lang.String userIp) {
      return (SearchDishes) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String searchTerm;

    /**

     */
    public java.lang.String getSearchTerm() {
      return searchTerm;
    }

    public SearchDishes setSearchTerm(java.lang.String searchTerm) {
      this.searchTerm = searchTerm;
      return this;
    }

    @Override
    public SearchDishes set(String parameterName, Object value) {
      return (SearchDishes) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "storeDish".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link StoreDish#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBean}
   * @return the request
   */
  public StoreDish storeDish(com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBean content) throws java.io.IOException {
    StoreDish result = new StoreDish(content);
    initialize(result);
    return result;
  }

  public class StoreDish extends MyApiRequest<Void> {

    private static final String REST_PATH = "storeDish";

    /**
     * Create a request for the method "storeDish".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link StoreDish#execute()} method to invoke the remote operation. <p>
     * {@link
     * StoreDish#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBean}
     * @since 1.13
     */
    protected StoreDish(com.awiidev.gdggulu.goafrica_uganda.backend.myApi.model.DishBean content) {
      super(MyApi.this, "POST", REST_PATH, content, Void.class);
    }

    @Override
    public StoreDish setAlt(java.lang.String alt) {
      return (StoreDish) super.setAlt(alt);
    }

    @Override
    public StoreDish setFields(java.lang.String fields) {
      return (StoreDish) super.setFields(fields);
    }

    @Override
    public StoreDish setKey(java.lang.String key) {
      return (StoreDish) super.setKey(key);
    }

    @Override
    public StoreDish setOauthToken(java.lang.String oauthToken) {
      return (StoreDish) super.setOauthToken(oauthToken);
    }

    @Override
    public StoreDish setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (StoreDish) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public StoreDish setQuotaUser(java.lang.String quotaUser) {
      return (StoreDish) super.setQuotaUser(quotaUser);
    }

    @Override
    public StoreDish setUserIp(java.lang.String userIp) {
      return (StoreDish) super.setUserIp(userIp);
    }

    @Override
    public StoreDish set(String parameterName, Object value) {
      return (StoreDish) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link MyApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link MyApi}. */
    @Override
    public MyApi build() {
      return new MyApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MyApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMyApiRequestInitializer(
        MyApiRequestInitializer myapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(myapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}