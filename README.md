# auth-test-proj
Current Authentication Flow.

1. Roles -> {ADMIN_ROLE, USER_ROLE}

2. SignUp to the auth service

        POST : http://localhost:8080/api/auth/signup

        Body:
        {
        "username":"test",
        "email":"t@mail.com",
        "password":"test",
        "role":["user"]
        }
        
3. SignIn 

        POST : http://localhost:8080/api/auth/signin
        
        Body:
        {
        "username":"test",
        "password":"test"
        }
        
4. Access User based content role wise

        GET : http://localhost:8080/api/test/user
        
        Header : 
            Authorization : Bearer TOKEN_GENERATED_WHEN_LOGIN
        
        

