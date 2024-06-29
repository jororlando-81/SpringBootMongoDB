# Spring boot project with Mongo DB

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/jororlando-81/SpringBootMongoDB/blob/main/LICENSE) 

# About the project

A back-end web application that allows users to make posts and comment on them, saving the information in a MongoDB database.

##  Project architecture

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/SpringBootArchitecture.png)

## Class diagram

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/ClassDiagram.png)

## Testing endpoints with Postman

###  User´s post method

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/UserPost.png) 

###  User´s get method, find by id

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/UserGetFindById.png)

###  Exception handling for find user by id

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/ExceptionUserFindById.png)

###  User´s get method, show user list

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/UserGetList.png)

###  User´s put method, update user data

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/UserPut.png)  

###  User´s delete method, delete user 

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/UserDelete.png)  

###  User´s get method, for find user's posts by id

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/UserFindByIdPosts.png)

###  Post´s get method, find by id

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/PostsFindById.png)

###  Exception handling for find post by id

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/ExceptionPostsFindById.png)

###  Post´s get method, search for the text containing Good night by title 

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/GetTitleSearch.png)  

###  Post´s get method, search for the text containing me too by title, body or comments between the dates 10/06/24 and 24/06/2024

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/GetFullTitleSearch.png)

## Mongo DB database

###  User collection

### Marcos Grossi has two posts, Betiana Gurchi and Braian Gress have no posts.

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/UserCollection.png)

###  Post collection

###  Marcos Grossi has two comments from Betiana Gurchi and Braian Gress on the post.

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/PostCollection1.png)

### Marcos Grossi has a comment from Betiana Gurchi on the post.

![diagram](https://github.com/jororlando-81/assetsToSpringBootMongoDB/blob/main/PostCollection2.png) 

### Applied technologies

### Back end

- Spring Tool suite 4
- Spring Boot
- Spring Web 
- Spring Data MongoDB
- API REST
- Postman
- Java EE
- Maven
- JSON

### Author

Jorge Orlando Rodriguez

www.linkedin.com/in/jorge-rodriguez-575b40259
