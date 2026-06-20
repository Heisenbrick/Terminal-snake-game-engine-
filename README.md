# Console Based snake game 
A Simple muiti-threaded java terminal game 
The game renders a 16x16 grid and allows you to move an "X" marker **down**(input '1')and **right**(input '2').
The marker wraps around when it reaches the edge.The game runs in real-time with separate threads for input and rendering.
## Features
-**Multi-threading**:One thread handles continuous grid rendering,another handles user input.
-**Real-time movement**:using ANSI ESCAPE for delta rendaring.
-**Pause / Resume / quit** controls.
## controls 
While the game is running enter these numbers in the console:
-'1' ---> move **Down**
-'2' ---> move **Right**
-'3' ---> **Pause**
-'4' ---> **Resume**
-'5' ---> **End**