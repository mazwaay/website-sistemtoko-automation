# Hi, I'm Mazway 👋

I will create a simple automation test using Katalon Studio for [sistemtoko Website](https://sistemtoko.com/login).

## Installation

- clone this project
- install katalon v. 9.0.0

## Scenario Test

 - **1. Login with correct email and correct password**
	- **Test Step**
	   >1. Open the website
	   >2. Click menu login
	   >3. Input email as <wepib42494@bixolabs.com>
	   >4. Input password as 123456
	   >5. Click button login
	  - **Expected : Successfully logged in and redirects to the home page**

 - **2. Login with correct email and wrong password**
	- **Test Step**
	   >1. Open the website
	   >2. Click menu login
	   >3. Input email as wepib42494@bixolabs.com
	   >4. Input password as abc123
	   >5. Click button login
	  - **Expected : will display the error message "Username/Password did not match"**

 - **3. Login with wrong email and correct password**
	- **Test Step**
	   >1. Open the website
	   >2. Click menu login
	   >3. Input email as example12@gmail.com
	   >4. Input password as 123546
	   >5. Click button login
	  - **Expected : will display the error message "Username/Password did not match"**

 - **4. Login with wrong email and wrong password**
	- **Test Step**
	   >1. Open the website
	   >2. Click menu login
	   >3. Input email as example12@gmail.com
	   >4. Input password as abc123
	   >5. Click button login
	  - **Expected : will display the error message "Username/Password did not match"**

 - **5. Test Forgot password with email already registered**
	- **Test Step**
	   >1. Open the website
	   >2. Click menu login
	   >3. Click button i forgot my password
	   >4. Input email wepib42494@bixolabs.com
	   >5. Click button send reminder
	  - **Expected : will display the message "Password reminder sent! !"**

 - **6. Test Forgot password with email not registered**
	- **Test Step**
	   >1. Open the website
	   >2. Click menu login
	   >3. Click button i forgot my password
	   >4. Input email example12@gmail.com
	   >5. Click button send reminder
	  - **Expected : will display the error message "We can't find a user with that e-mail address. !"**

## Screen Record
<img src="https://user-images.githubusercontent.com/42727156/227218971-49909bea-ae57-4c44-b7f7-d68aab03a8c8.mp4" width="50%">


## Reporting

for reporting [Allure Report](https://swaglabs.netlify.app/#), check this.
