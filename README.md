# 3D Engine Desktop Viewer (Java Swing)

A lightweight, hardware-independent 3D rendering engine built completely from scratch in pure Java (without external graphics APIs like OpenGL or DirectX). 
This educational project implements a software rasterization pipeline, explicit perspective projection via barycentric coordinates, directional face-shading through surface normals, and a depth buffer (Z-Buffer) to handle proper polygon occlusions.

## Features
- Mesh Rendering: Procedural generation of multiple 3D triangle-based geometries (Cube, Tetrahedron, Pyramid, Octahedron, and Triangular Prism).
- Dynamic Z-Buffer: Pixel-perfect depth sorting that prevents backward-facing surfaces from overlapping foreground geometry.
- Flat Directional Shading: Real-time lighting calculations based on the dot product cosine between the polygon's normal vector and the viewing axis, complete with a built-in gamma correction pipeline (getShade).
- Dynamic Inflation (Subdivision): An iterative geometric algorithm that splits each triangle into 4 smaller sub-triangles and normalizes their distance to create a perfect sphere on the fly.
- Interactive Control Panel: Embedded Swing controls including two-axis rotational sliders (Heading and Pitch), a live shape switcher dropdown menu, and a real-time inflation modifier slider.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- Any standard Java IDE (IntelliJ IDEA, Eclipse, NetBeans, or VS Code).

## Project Structure
- DemoViewer.java: The main core file managing the window (JFrame), UI action listeners, and the pixel-writing rasterization loops using a BufferedImage.
- ShapeFactory.java: A software factory helper class used to separate pure mathematical 3D mesh definitions from the rendering loops.
- Vertex.java / Triangle.java / Matrix3.java: Fundamental linear algebra classes modeling 3D spatial points, polygon links, and matrix rotation transformations.

## Preview

- <img width="600" height="550" alt="image" src="https://github.com/user-attachments/assets/33d28920-d213-4469-ae18-3b76e5433cc6" />
- <img width="602" height="543" alt="image" src="https://github.com/user-attachments/assets/f584b2b6-591c-4c6a-a674-77a4bdb8c1bf" />
- <img width="609" height="548" alt="image" src="https://github.com/user-attachments/assets/a75283ec-b64d-466a-accc-dbda3c85b744" />
- <img width="599" height="548" alt="image" src="https://github.com/user-attachments/assets/fdd0df62-f7e6-4189-8628-125e5d46671b" />

## How to Run
1. Clone or download these source files into a local folder.

2. Compile all files using your terminal:

Bash

    javac *.java

3. Run the application:

Bash

    java DemoViewer

## Credits & Acknowledgments
* The rendering logic, matrix operations, and math foundation of this engine are entirely based on the work of the developer known as Rogach.
* Original Author: Rogach
* Original Publication: "How to create your own simple 3D render in Java" (August 2015), featured on the Rogach on Scala dev blog.

## Modifications in this Repository 

The codebase was modularized by moving hardcoded geometry out of the rendering loop into a dedicated ShapeFactory, adding 3 additional 3D primitives, and building a responsive top control panel to dynamically adjust shapes and subdivision levels concurrently.
