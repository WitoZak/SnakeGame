# Snake Game

This is a implementation of the classic Snake Game using Java and Swing. The game allows the player to control a snake and eat apples to grow longer. The objective is to achieve the highest possible score without colliding with the snake's own body or the game boundaries.

## Features

- Snake movement: The snake can be controlled using the arrow keys (up, down, left, right).
- Apple generation: Apples are randomly generated on the game board for the snake to eat.
- Score tracking: The player's score is displayed on the screen, incrementing each time an apple is eaten.
- Game over condition: The game ends if the snake collides with its own body or the game boundaries.
- Restart option: After the game is over, the player can press Enter to start a new game.

## Usage

To run the game, execute the `SnakeGame` class. The game window will appear, and the player can start controlling the snake using the arrow keys. When the game is over, press Enter to restart the game.

## Implementation Details

- The game is implemented using the `JPanel` class from Swing, which allows for drawing and rendering graphics.
- The snake's body is represented by arrays `x` and `y`, which store the coordinates of each body part.
- The snake's movement is controlled by changing the coordinates of the body parts accordingly.
- Collision detection is performed to check if the snake collides with apples, its own body, or the game boundaries.
- Random numbers are used to generate the coordinates for the apples.
- The game's graphics are drawn using the `Graphics` class from AWT.
- The game loop is controlled by a `Timer` object that triggers the `actionPerformed` method at regular intervals.
- The game's GUI is created using the `JFrame` class from Swing, and the game panel is added to it.
