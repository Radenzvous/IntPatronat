## IntPatronat
Intive Patronat Java task

## Parking Space Mapper
This application allows you to map parking spaces, add users and add reservations.

## Technologies

Java 11.0.2 
Springboot
Gradle
H2 database

## Installation

1. Clone this repo to your desktop in Git Bash:
git clone https://github.com/Radenzvous/IntPatronat.git

2. Go to it's root directory:
cd Ticket

3. Use "gradlew build" command

## Setup

Navigate with a terminal or console to the Ticket directory and run:
gradlew bootRun


## REST urls -- Usage of the application

1. POST http://localhost:8080/reservation
curl -XPOST -H "Content-type: application/json" -d '{"userName": "toster1","parkingSpaceNumber": 2,"parkingSpaceLevel": 2}' 'http://localhost:8080/reservation'

JSON Body:
{
"userName":"<username>",
"parkingSpaceNumber":<number>,
"parkingSpaceLevel": <level>
}

What does it do?
Creates a reservation for already preexisting user and parkingspace.

2. POST http://localhost:8080/parking-space
curl -XPOST -H "Content-type: application/json" -d '{"number":3,"level": 3,"impaired" : true}' 'http://localhost:8080/parking-space'

JSON Body
{
"number":<number>,
"level": <level>,
"impaired" : <boolean>
}

What does it do?
Creates a parking space.

3. POST http://localhost:8080/user
curl -XPOST -H "Content-type: application/json" -d '{"name": "<username>"}' 'http://localhost:8080/user'

JSON Body:
{
"name": "<username>"
}

What does it do?
Creates a user.


4. GET http://localhost:8080/reservation/user/{userName}
curl -XGET 'http://localhost:8080/reservation/user/{userName}'

What does it do?
Username needs to be fed to {userName}, output will show every reservation assigned to that user.

5. GET http://localhost:8080/parking-space/free
curl -XGET 'http://localhost:8080/parking-space/free'

What does it do?
Show all unassigned parking spaces.

6. DELETE http://localhost:8080/reservation/{reservationId}
curl -XDELETE 'http://localhost:8080/reservation/1'
This one did not seem to work via curlbuilder.com but worked well with PowerShell with this instead: 
curl -method Delete http://localhost:8080/reservation/1

What does it do?
Reservation Id needs to be fed to {reservationId}.
Removes reservation.

7. GET http://localhost:8080/reservation
curl -XGET 'http://localhost:8080/reservation'

What does it do?

Shows all reservations.
