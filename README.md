# Task 5

## Task Instructions
Travel Booking Application: Develop a travel booking platform using Spring Boot and REST services. The application should allow users to search for flights, hotels, and rental cars. 
The system should also integrate with a third-party service, such as Expedia, to retrieve real-time availability and pricing information

## Run Instructions
1. Import the project as a Maven project in an IDE.
2. In order to run the project some requirements are requested:
   - MySQL must be installed and running, create a db called travel_booking.
   - Maven should be isntalled in the OS.
3. Run the program from the route: `/BookingApp/src/main/java/com/Travel/BookingApp/BookingAppApplication.java` as a java application.

## Additional instructions
- In order to run the tests go to `/BookingApp/src/test/java/com/Travel/BookingApp/BookingAppApplicationTests.java` and run it as JUnit test.
- JaCoCo is used for code coverage.
  - In order to use it open a Terminal in the project route and excecute `mvn clean test` and then `mvn jacoco:report`.
  - To check results go to `BookingApp\target\site` and open index.html.
- SonarQube is used for complexity and style, in order to monitor tests please replace the ´token´
  from the file `/BookingApp/src/main/resources/application.properties`.

## Feedback
- Was it easy to complete the task using AI?
  Although for specific task requests it worked well, as I made new prompts, the AI ​​lost the context of the previously provided code,
  making it difficult to maintain order. I find it very difficult to do this type of project without previous experience or general knoledge of the structure of this kind of applications. 
- How long did task take you to complete? (Please be honest, we need it to gather anonymized statistics)
  About 4 hours.
- Was the code ready to run after generation? What did you have to change to make it usable?
  No, I had to ask for details or instructions for every error code. 
- Which challenges did you face during completion of the task?
  The output of chatGPT is limited, so most of the classes were incomplete, I had to ask in new prompts to complete the previous given code.
  The problem was that the new code was not adapted for the previous code, making it difficult to integrate new code.
- Which specific prompts you learned as a good practice to complete the task?
  Used examples, be specific, refer to previous outputs, keeping the context.
