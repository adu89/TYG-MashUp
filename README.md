# TYG-MashUp

###**Yelp:**

List business with id:

**GET http://104.196.29.14/TYG-MashUp-master/api/restaurants/{id}**

see:
https://www.yelp.ca/developers/documentation/v2/business
for more info

List business with search term:

**GET http://104.196.29.14/TYG-MashUp-master/api/restaurants/search/{term}?location={location}**

*location and term are mandatory

Optional Query params:
&sort=
&radius=
&limit=

see:
https://www.yelp.ca/developers/documentation/v2/search_api
for more info

###**Twitter:**

List tweets with search term:

**GET http://104.196.29.14/TYG-MashUp-master/api/tweets/search/{query}**

Optional Query params:
&until=
&since=
&maxTweets=

see:
https://dev.twitter.com/rest/public/search
for more info

###**Weather:**

Gives current weather and forecast up to amount of days:

**GET http://104.196.29.14/TYG-MashUp-master/api/weather?lat={lat}&lon={lon}&days={days}**

see:
https://www.apixu.com/api-explorer.aspx
for more info

