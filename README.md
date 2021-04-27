# Revature Social Media Application

In this web application every Revature employee can connect to other employees, whether it be an associate, a trainer, or contracted employees. Each person has their own account, that comes with a unique username, Revature employee information. Within this network employees can access locations and information to help them with many different possibilities. Also it is being created to ease the transition as a Revature employee, whether it be as a trainer/associate, contracted employee/contractor, or staff member.

## Technologies Used

* Java - version 8
* TypeScript
* Angular
* HTML
* CSS
* Spring MVC
* Spring ORM
* Hibernate
* AWS RDS

## Features

* Intuitive User Interface
* Interactive Chat Room
* Form Validation
* Like Your Friend's Posts

## Usage

First thing's first - why not create an account? Add all the relevant information to the account and then log back in and you will be presented with a full list of the posts from all users. From there you may select an individual's profile name (@username) and navigate to their post feed.  You may also like and unlike any number of posts.

## Getting Started

1. Open git bash in your desired directory and run the command: git clone https://github.com/CSchink/frankly_social_media.git
2. Set up an account with AWS RDS
3. Download and install DBeaver
4. Connect AWS RDS with DBeaver
5. Right-click on the newly created database and select a new SQL script
6. Navigate to the SQL file in the newly cloned reimbursement_system file and:
   * Copy and paste file into the new DBeaver SQL script
   * Right-click and select "run" to initialize tables
   * Remember usernames and passwords for logging into the application
7. Store database login credentials in your system environment variables as:
   * TRAINING_DB_URL: [AWS_RDS_url]
   * TRAINING_DB_USERNAME: [DBeaver username]
   * TRAINING_DB_password: [AWS_RDS password]
8. Download Apache Tomcat v. 9.0.45
9. Unzip Apache Tomcat into the directory of your choosing
10. Open up the newly cloned franky_social_media file then open Project Two in Intellij
11. Once in Intellij go to Run -> Edit Configurations
12. Add Smart Tomcat as a new configuration:
    - add /social to the context path
    - click on folder icon in the Deployment Directory and then select src -> main -> webapp
13. Run the Tomcat Server
14. Now, if you have not downloaded Angular, please visit their website and download Angular
15. Go back to the cloned franky_social_media file and open the Front-End file in Visual Studio Code
16. Open a new command line terminal and run npm install
17. Now run the command ng-serve to start the server
18. Navigate to http://localhost:9001/ and create a new account

## License
This uses the MIT license.
