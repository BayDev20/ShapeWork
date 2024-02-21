# Shape Library

Welcome to the Shape Library! This Java library provides classes to work with various geometric shapes such as rectangles, circles, and triangles. Each shape class extends an abstract `Shape` class, providing methods to compute their area and perimeter.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Classes](#classes)
- [Contributing](#contributing)
- [License](#license)

## Installation

To use this library, you can simply clone the repository:

```bash
git clone https://github.com/yourusername/shape-geometry-library.git

```

Alternatively, you can download the source code directly from the repository.

## Usage
To use the library in your Java project, you can import the necessary classes:

```bash

import com.example.geometry.Rectangle;
import com.example.geometry.Circle;
import com.example.geometry.Triangle;

```

## Classes

### `Shape`

An abstract class representing a geometric shape.

#### Methods
- `area()`: Abstract method to calculate the area of the shape.
- `perimeter()`: Abstract method to calculate the perimeter of the shape.

### `Rectangle`

A class representing a rectangle.

#### Methods
- `Rectangle(double width, double length)`: Constructor to initialize the rectangle with the given width and length.
- `area()`: Method to calculate the area of the rectangle.
- `perimeter()`: Method to calculate the perimeter of the rectangle.

### `Circle`

A class representing a circle.

#### Methods
- `Circle(double radius)`: Constructor to initialize the circle with the given radius.
- `area()`: Method to calculate the area of the circle.
- `perimeter()`: Method to calculate the perimeter of the circle.

### `Triangle`

A class representing a triangle.

#### Methods
- `Triangle(double side1, double side2, double side3)`: Constructor to initialize the triangle with the given side lengths.
- `area()`: Method to calculate the area of the triangle.
- `perimeter()`: Method to calculate the perimeter of the triangle.

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [GNU General Public License]
