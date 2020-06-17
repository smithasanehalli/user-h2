# user-h2
Spring boot application with in memory db h2 for all crud operations. 

1.Get all users - lists all users
http://localhost:8080/users

2.Post- creates a user
http://localhost:8080/users

sample : {
	"firstName": "smitha",
"lastName":"sanehalli",
"email":"abc@gmail.com"
}

3.Put - updates the user
http://localhost:8080/users/1
sample : {
	"firstName": "smitha",
"lastName":"ss",
"email":"abc@gmail.com"
}
4.Delete - deletes user is exist
http://localhost:8080/users/1
