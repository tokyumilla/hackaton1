GET http://localhost:9000/skins/available
Endpoint for getting a list of all the skins available to buy
POST http://localhost:9000/skins/{id}/buy
Endpoint for buying skins
GET http://localhost:9000/skins/myskins
Endpoint for getting a list of every skin you have bought.
PUT http://localhost:9000/skins/{id}/color
Endpoint for updateng the colour of a skin you have bought
DELETE http://localhost:9000/skins/delete/{id}
Endpoint for deleting one of your bought skins.
GET http://localhost:9000/skins/getskin/{id}
Endpoint for getting one of your bought skins.

Future version of this project will use a H2 Database for the available skins, so the database drops once you turn off the application. 
And another SQL database for the skins you have bought so there is data persistence after turningo off the application. 
