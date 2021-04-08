<h1 align="center">♞ Knight's Tour Visualization</h1>

<div align="center">
    <img src="demo/heuristic-demo.gif">
    <figcaption><em>A heuristic-driven tour completed by the program</em></figcaption>
</div>

## About

This program visualizes and solves the [Knight's tour problem](https://en.wikipedia.org/wiki/Knight%27s_tour) in three ways using Java Swing.

> "A knight's tour is a sequence of moves of a knight on a chessboard such that the knight visits every square exactly once." - Wikipedia

### Manual Version 

This version enables a user to control the knight to make a full tour based on the automatically generated suggestion and their intuition.

<div align="center">
    <img src="demo/manual-demo.gif">
    <figcaption><em>The knight's tour is controlled by the user</em></figcaption>
</div>

### Heuristic Version

This version implements [Warnsdorff's heuristic](https://www.geeksforgeeks.org/warnsdorffs-algorithm-knights-tour-problem/) to complete a full tour automatically starting from each square on the chessboard.

> "The knight is moved so that it always proceeds to the square from which the knight will have the fewest onward moves" - Wikipedia

### Optimized Heuristic Version

This version implements the heuristic mentioned above, but when there are two or more choices for which the number of onward moves is equal, the program decides what square to choose by looking ahead to those choices.

## Run

1. Navigate to the build directory

```
$ cd out/production/knights-tour
```

2. Run the program

    a. Manual version

    ```
    $ java Main
    ```

    b. Heuristic-driven version

    ```
    $ java Heuristic
    ```

    c. Optimized heuristic-driven version

    ```
    $ java OptimizedHeuristic
    ```

## Stats

The result that I have after running the three versions of the program:

| Version   |    Number of Full Tours    |
|-----------|:--------------------------:|
| Manual    | (You can try it yourself!) |
| Heuristic |             63             |
| Optimized |             64             |

## License

[GNU GPLv3](https://choosealicense.com/licenses/gpl-3.0/)