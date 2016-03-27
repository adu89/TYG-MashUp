# TYG-MashUp

**Yelp:**

List business with id:

**GET /Mashup6/api/restaurants/{id}**

see:
https://www.yelp.ca/developers/documentation/v2/business
for more info

List business with search term:

**GET /Mashup6/api/restaurants/search/term?location=alaska**

*location and term are mandatory

Optional Query params:
&sort=
&radius=
&limit=

see:
https://www.yelp.ca/developers/documentation/v2/search_api
for more info

**Twitter:**

List tweets with search term:

**GET /Mashup6/api/tweets/search/{query}**

Optional Query params:
&until
&since
&maxTweets

see:
https://www.yelp.ca/developers/documentation/v2/business
for more info

**Weather:**

Gives current weather and forecast up to amount of days:

**GET /Mashup6/api/weather?lat=10&lon=10&days=2**

see:
https://www.apixu.com/api-explorer.aspx
for more info

