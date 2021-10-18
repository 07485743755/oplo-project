Feature: Health Check

 Scenario: User should able to get access token
   When User select env "api-sit" and enter clientId "postman" clientSecret "38a9d0c1-46b3-4b14-9f06-86a7da7eebb6" and grantType "client_credentials"
   Then User should get access token

 Scenario: Validate auth status
   When User select env "api-sit" and enter clientId "postman" clientSecret "38a9d0c1-46b3-4b14-9f06-86a7da7eebb6" and grantType "client_credentials"
   And  Send request to broker with access token
   Then Token is validate


