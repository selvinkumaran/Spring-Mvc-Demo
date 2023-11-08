Spring-Mvc-Demo
---------------
Index
-----
StudentForm JSP Page
--------------------
This JSP page, named StudentForm.jsp, displays user details retrieved from a Java controller or servlet. It utilizes JSTL for dynamic content rendering.

Usage
-----
Ensure that the ${user} object contains user data before loading this page.

The page displays user information, such as name, email, password, blood group, operating system, and favorite programming languages.

The "Go Back" link allows users to return to a login page.

Important
--------
Customize the "Go Back" link (<a href="login">Go Back</a>) to match your application's navigation.

Login
-----
Deafault user
-------------
Email: selvin@gmail.com
Password: selvin123

Login Form (JSP)
----------------
This is a JavaServer Pages (JSP) page for user login. It uses Spring Framework's form tags for creating a login form and binding user input data.

Usage
-----
Ensure the Spring Framework is properly configured in your project, and the user object is set up to receive user input data.

The form collects user login information, including their email and password.

When the user submits the form by clicking the "Login" button, it sends a POST request to the "processLogin" URL for authentication and processing.

If the user is not registered, they can click the "Click here" link to navigate to the registration page at "register."

Important
---------
Make sure the Spring Framework is set up correctly in your project for the Spring form tags to work as expected.

Ensure the URL in the <form:form> action attribute matches the endpoint where login data should be processed.

Customize the form fields, labels, and links to match your specific login and registration requirements.

Register
--------
Student Registration Form (JSP)
------------------------------
This is a JavaServer Pages (JSP) page designed for student registration. It uses Spring Framework's form tags for easy form creation and data binding.

Usage
----
Ensure the Spring Framework is properly configured and that the user object is populated with user data.

The form collects student information, including name, email, password, blood group, favorite programming languages, and favorite operating system.

The form submits the data to the "processRegister" URL using the HTTP POST method.

The page allows students to select their blood group from a dropdown list and choose their favorite programming languages and operating system using checkboxes and radio buttons.

Click the "Submit" button to submit the form data for processing.

Important
---------
Make sure that the Spring Framework is set up and configured correctly in your project for the Spring form tags to work as expected.

Ensure the URL in the <form:form> action attribute matches the endpoint where form data should be processed.

Customize the form fields and options to match your specific registration requirements.
