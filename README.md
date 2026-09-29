# Elevator Simulation

A simple Java-based elevator simulation that processes floor requests one at a time and determines the elevator's movement based on its current floor.

## Features

* Starts the elevator at **Floor 0**.
* Allows the user to enter **1–5 floor requests**.
* Supports floors **0–5**.
* Compares each requested floor with the elevator's current floor.
* Displays:

  * **"Moving Up"** when the requested floor is higher.
  * **"Moving Down"** when the requested floor is lower.
  * **"Doors Opening"** when the requested floor is the same as the current floor.
* Updates the elevator's current floor after each valid request.
* Rejects invalid floor requests and allows the user to enter the request again.

## How It Works

The program first asks for the total number of floor requests.

For each request, the program compares the requested floor with the elevator's current floor:

```text
Requested floor > Current floor → Moving Up
Requested floor < Current floor → Moving Down
Requested floor = Current floor → Doors Opening
```

After reaching a requested floor, the elevator's current floor is updated.

## Example

For the following requests:

```text
3, 1, 5, 2, 2
```

The elevator starts at Floor 0:

```text
Floor 0 → Floor 3
Moving Up
Doors Opening

Floor 3 → Floor 1
Moving Down
Doors Opening

Floor 1 → Floor 5
Moving Up
Doors Opening

Floor 5 → Floor 2
Moving Down
Doors Opening

Floor 2 → Floor 2
Doors Opening
```

## Technologies Used

* Java
* `Scanner` for user input
* `for` loops
* `while` loops
* `if-else` statements
* Arrays

## How to Run

Make sure Java is installed, then open the project in VS Code.

Compile the program:

```bash
javac Elevator.java
```

Run the program:

```bash
java Elevator
```

## Author

**Muhammad Hashir Naseem**
