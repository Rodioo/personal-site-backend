# Personal Site Backend

This project handles HTTP requests made from my [personal site](https://antoniofalcescu.com).

https://antoniofalcescu.com

## Stack
  
  - [Java](https://www.java.com/en/)
  - [Spring](https://spring.io)
  - [MySQL](https://www.mysql.com)
  - [Docker](https://www.docker.com)

## Usage
  
You can use [Postman](https://www.postman.com) or any other tool you like to make requests and see the JSON response.

## Installation

If you want to clone the project and run or modify the source code you can follow these steps:
  - Clone the repository
  - You have to create your own ```secrets.properties``` file inside ```resources``` and add your own database and Gmail credentials:
      ```
      # Database credentials
      spring.datasource.url=jdbc:mysql://${DB_URL}
      spring.datasource.username=${DB_USERNAME}
      spring.datasource.password=${DB_PASSWORD}
      
      # Email credentials
      mail.receiver=${YOUR_EMAIL_ADDRESS}
      spring.mail.username=${SENDER_EMAIL_ADDRESS}
      spring.mail.password=${SENDER_EMAIL_PASSWORD} # Note that if you have 2FA enabled you have to use a Gmail App Password here
      ```
  - Assuming you have [Java](https://www.java.com/en/) already installed on your machine, you can simply run ```PersonalSiteBackendApplication```.
  - You should see a message in your terminal which tells you that the project started on http://localhost:8080

## License

You can clone and modify this project however you want.

For more details check [LICENSE](https://github.com/Rodioo/personal-site-backend/blob/main/LICENSE).

