Given an order to Germany 
When the customer is a regular
Then the shipping cost is 10.0

Given an order to Germany 
When the customer is a vip
Then the shipping cost is 0.0

Given an order to outside Germany 
When the customer is a regular
Then the shipping cost is 30.0

Given an order to outside Germany 
When the customer is a vip
Then the shipping cost is 30.0