# coding-events-demo

# Purpose of the app : 
This application tracks events around different locations and offers details about them.

# Current state of the app :
The User is able to add events to the application and attach tags to the events.

# Future improvements :
We need to include a Person class in order to have our users to select and save their favorite events.

# Proposed architecture :
Fields :
- Name (String)
- Email (String)
- Password (String)
- List of Events (List<Event> with Many to Many relationship)
- Favorite Category (EventCategory with Many to One relationship)

Methods :
- Getters and Setters
- Get back favorite events (returns all events that have to do with the favorite category)
