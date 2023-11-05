GET http://localhost:9000/skins/available <br />
Endpoint for getting a list of all the skins available to buy<br /><br />
POST http://localhost:9000/skins/{id}/buy<br />
Endpoint for buying skins<br /><br />
GET http://localhost:9000/skins/myskins<br />
Endpoint for getting a list of every skin you have bought.<br /><br />
PUT http://localhost:9000/skins/{id}/color<br />
Endpoint for updateng the colour of a skin you have bought<br /><br />
DELETE http://localhost:9000/skins/delete/{id}<br />
Endpoint for deleting one of your bought skins.<br /><br />
GET http://localhost:9000/skins/getskin/{id}<br />
Endpoint for getting one of your bought skins.<br /><br /><br />

Future version of this project will use a H2 Database for the available skins, so the database drops once you turn off the application. <br />
And another SQL database for the skins you have bought so there is data persistence after turningo off the application. 
