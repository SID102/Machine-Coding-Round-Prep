## Problem Statement
Design an application called Covid Tracker.

Write code which tracks the Covid records. The code should be demonstrable.

Must Have Cases:

Register and Login
Admin and regular users should be able to register and login

Covid Cases
Admin should be able to add / update / delete regular user Covid data

Self Assessment
User should be able to assess themselves.

Assessment factors:
A. Not vaccinated
B. Came in contact with Covid patient
C. Visited covid red zone

If A & B & C => 100 % chance of being Covid Positive
A & B or A & C => 50 %
B & C => 75 %

Covid Zones
I used area pincode to decide the region.

RED Zone: >=75 % cases
Orange Zone: 25 % <= cases <= 75 %
GREEN Zone: <25 %

Bonus Cases

After completing above cases, you can consider adding more features to the app like supporting more Covid factors, displaying the Covid zones based on date ranges, etc. Please note that bonus cases are good to have and not mandatory.

Some Tips:
Code should be modular
Code should be readable
It should be extensible. The panel mostly asks to add some extra feature to the app. We should be able to extend it easily.
It should follow SOLID principles
Use Design Patterns wherever possible
Proper validations and exception handling wherever possible
Proper packaging structure
Terminal application is fine. You can simply consider the class with main method as driver class and provide the inputs to the methods from there itself. You can also use file to accept inputs(good to have). You can also develop REST API if you can quickly write it(This is not recommended if the round is online as it might unnecessarily introduce other issues, better go for driver class).

## design 

              ![Covid Tracker](images/image.png)

## folder design 

com.flipkart.covidtracker

|-model
|   |-User.java
|   |-CovidRecord.java
|   |-Role.java
|   |-Zone.java 
|   |-Assesment.java
|
|-repository
|   |-UserRespository
|   |-CovidRepository
|   |-UserInmemoryRepository
|   |-CovidInmemoryRepository
|
|- services
|   |-AuthService
|   |-CovidService
|   |-AssesmentService
|   |-ZoneService
|
|- exception
|   |-UserNotFoundException
|   |-UserAlreadyExistsException
|   |-ValidationException
|
|- Main.java


### use interface for repository not class so that It can extend or change in future

### Easy way to remember:

final = cannot be reassigned
static = belongs to the class
static final = class-level constant