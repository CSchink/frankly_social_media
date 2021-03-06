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

First thing's first - why not create an account? Add all the relevant information to the account and then log back in and you will be presented with a full list of the posts from all users. 



![image](https://user-images.githubusercontent.com/45950072/116252532-a94a6200-a73d-11eb-8fec-62f9ce061d48.png)

After a successful login you will see the full list of posts in the main post feed.  

![image](https://user-images.githubusercontent.com/45950072/116252403-891aa300-a73d-11eb-8664-a7216372f413.png)

You may select an individual's profile name (@username) and navigate to their post feed.  You may also like and unlike any number of posts.

![image](https://user-images.githubusercontent.com/45950072/116253352-6937af00-a73e-11eb-9913-2fae84197fe9.png)

You can make as many posts as you like, and even upload photos:

![image](https://user-images.githubusercontent.com/45950072/116252708-d3038900-a73d-11eb-940e-5071c6bd52af.png)

Finally you can also chat live with anyone who's currently online: 

![image](https://user-images.githubusercontent.com/45950072/116252644-c2eba980-a73d-11eb-85f4-6c5793f2036a.png)

And, if you forget your 

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
    - It should look like this:

![image](https://user-images.githubusercontent.com/45950072/116252500-a0599080-a73d-11eb-9ed5-a932931eb8e3.png)

13. Run the Tomcat Server
14. Now, if you have not downloaded Angular, please visit their website and download Angular
15. Go back to the cloned franky_social_media file and open the Front-End file in Visual Studio Code
16. Open a new command line terminal and run npm install
17. Now run the command ng-serve to start the server
18. Navigate to http://localhost:9001/ and create a new account

Contributors:

- Hakeem Clark
- Michael DeGennaro
- Erik Williams

## License
This project uses the MIT license.
