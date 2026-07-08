# Hangman Game with TDD
# Console "Hangman" Game in Java

A final project for the **Software Engineering** course. It is a classic, console-based version of the Hangman game, where the player's goal is to guess a hidden word by entering single letters.

## Project Goal

The main objective of this project, apart from creating the application itself, was to master and practically apply modern software engineering techniques:
- **TDD (Test-Driven Development)** — unit tests written in the Red-Green-Refactor cycle.
- **Feature Branch Workflow** — every new feature was developed on a separate branch and integrated via Pull Requests with Code Review.
- **CI (Continuous Integration)** — automated test execution using GitHub Actions for every Pull Request.
- **Scrum** — workflow organized in 5-week sprints with a rotating Scrum Master role.

## Technologies Used

- **Language:** Java 17
- **Build Tool:** Maven
- **Unit Testing:** JUnit 4.13.2 / 5
- **CI/CD:** GitHub Actions
- **Project Management:** Trello / GitHub Projects

## Specification and Features

- **Word Database:** The ability to add, remove, and display words from the dictionary before starting the game.
- **Chance Mechanics:** The player has exactly 9 lives (mistakes) available. Every mistake draws another part of the hangman on the screen.
- **Duplicate Protection:** Entering the same letter twice does not subtract a life — the program informs the player about the mistake.
- **Guessing the Whole Word:** The ability to enter the entire word at once at any time during the game.
- **Statistics:** A current summary of games won, remaining lives, and letters used so far.

## How to Run the Project Locally

1. Clone the repository
2. Navigate to the project folder
3. Build the project and run tests using Maven:
   ```bash
   mvn clean install
   ```
4. Run the game

## How to Run Tests

To verify TDD coverage locally, run:
```bash
mvn test
```
Tests are also automatically executed on every Pull Request to the `main` branch thanks to configured [GitHub Actions](.github/workflows/maven.yml).
