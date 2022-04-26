**About**

This is a demo project to test REST API security using SpringBoot and jwt.

H2 database and builder pattern is also used here.

The website has 4 pages


| URL                                              | INFO |
|--------------------------------------------------| ------ |
| [localhost](localhost)                           | Does not require authentication |
| [localhost/user](localhost/user)                 | Requires authentication |
| [loaclhost/admin](localhost/admin)               | Requires authentication and authorization |
| [localhost/authenticate](localhost/authenticate) | Used to authenticate the user |

**Instructions**
1. Use Postman to perfom this demo
2. Goto [localhost](localhost) 
3. An username and password is automatically generated
4. Use [localhost/authenticate](localhost/authenticate) to authenticate the user using header keys 'username' and 'password'
5. An jwt token will generate
6. Use the jwt token as 'Authentication' header key to browse the pages [localhost/user](localhost/user) and  [localhost/admin](localhost/admin) 

Authentication header key example: Bearer eyJhiJ9.eyJzwMH0.D4Q3L7