Here we have abstracted the behavior, and low down the code maintainance thing.

All the behavior can be set/updated by the client.

If any of the behavior changes, the client has to change the behavior.
If new behavior has to be added, then new interface of the behavior is to be created
and Duck class has to add new behavior. Duck's subtypes have to add new behavior in the constructor
or bring the new constructor itself. This number of changes is same as the older way