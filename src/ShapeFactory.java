import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
    // tetrahedron
    public static List<Triangle> createTetrahedron() {
        List<Triangle> tris = new ArrayList<>();
        tris.add(new Triangle(new Vertex(100, 100, 100), new Vertex(-100, -100, 100), new Vertex(-100, 100, -100), Color.WHITE));
        tris.add(new Triangle(new Vertex(100, 100, 100), new Vertex(-100, -100, 100), new Vertex(100, -100, -100), Color.RED));
        tris.add(new Triangle(new Vertex(-100, 100, -100), new Vertex(100, -100, -100), new Vertex(100, 100, 100), Color.GREEN));
        tris.add(new Triangle(new Vertex(-100, 100, -100), new Vertex(100, -100, -100), new Vertex(-100, -100, 100), Color.BLUE));
        return tris;
    }

    // cube
    public static List<Triangle> createCube(double size) {
        List<Triangle> tris = new ArrayList<>();
        double s = size / 2;
        Vertex v0 = new Vertex(-s, -s, -s);
        Vertex v1 = new Vertex(s, -s, -s);
        Vertex v2 = new Vertex(s, s, -s);
        Vertex v3 = new Vertex(-s, s, -s);
        Vertex v4 = new Vertex(-s, -s, s);
        Vertex v5 = new Vertex(s, -s, s);
        Vertex v6 = new Vertex(s, s, s);
        Vertex v7 = new Vertex(-s, s, s);

        // back face
        tris.add(new Triangle(v0, v1, v2, Color.MAGENTA)); tris.add(new Triangle(v0, v2, v3, Color.MAGENTA));
        // front g=face
        tris.add(new Triangle(v4, v5, v6, Color.RED));     tris.add(new Triangle(v4, v6, v7, Color.RED));
        // left face
        tris.add(new Triangle(v0, v3, v7, Color.BLUE));    tris.add(new Triangle(v0, v7, v4, Color.BLUE));
        // righ face
        tris.add(new Triangle(v1, v5, v6, Color.GREEN));   tris.add(new Triangle(v1, v6, v2, Color.GREEN));
        // top face
        tris.add(new Triangle(v3, v2, v6, Color.WHITE));   tris.add(new Triangle(v3, v6, v7, Color.WHITE));
        // bottom face
        tris.add(new Triangle(v0, v1, v5, Color.YELLOW));  tris.add(new Triangle(v0, v5, v4, Color.YELLOW));

        return tris;
    }

    // pyramid
    public static List<Triangle> createPyramid(double size) {
        List<Triangle> tris = new ArrayList<>();
        double s = size / 2;

        Vertex v0 = new Vertex(-s, -s, -s);
        Vertex v1 = new Vertex(s, -s, -s);
        Vertex v2 = new Vertex(s, -s, s);
        Vertex v3 = new Vertex(-s, -s, s);
        Vertex top = new Vertex(0, s, 0);


        tris.add(new Triangle(v0, v1, top, Color.RED));
        tris.add(new Triangle(v1, v2, top, Color.GREEN));
        tris.add(new Triangle(v2, v3, top, Color.BLUE));
        tris.add(new Triangle(v3, v0, top, Color.YELLOW));

        tris.add(new Triangle(v0, v2, v1, Color.MAGENTA));
        tris.add(new Triangle(v0, v3, v2, Color.MAGENTA));

        return tris;
    }

    // octahedron
    public static List<Triangle> createOctahedron(double size) {
        List<Triangle> tris = new ArrayList<>();
        double s = size / 2;

        Vertex top    = new Vertex(0, s, 0);
        Vertex bottom = new Vertex(0, -s, 0);
        Vertex left   = new Vertex(-s, 0, 0);
        Vertex right  = new Vertex(s, 0, 0);
        Vertex front  = new Vertex(0, 0, s);
        Vertex back   = new Vertex(0, 0, -s);

        tris.add(new Triangle(top, front, right, Color.RED));
        tris.add(new Triangle(top, right, back, Color.GREEN));
        tris.add(new Triangle(top, back, left, Color.BLUE));
        tris.add(new Triangle(top, left, front, Color.YELLOW));

        tris.add(new Triangle(bottom, right, front, Color.ORANGE));
        tris.add(new Triangle(bottom, back, right, Color.CYAN));
        tris.add(new Triangle(bottom, left, back, Color.PINK));
        tris.add(new Triangle(bottom, front, left, Color.MAGENTA));

        return tris;
    }

    // prism
    public static List<Triangle> createTriangularPrism(double size) {
        List<Triangle> tris = new ArrayList<>();
        double s = size / 2;

        Vertex f0 = new Vertex(0, s, -s);
        Vertex f1 = new Vertex(-s, -s, -s);
        Vertex f2 = new Vertex(s, -s, -s);

        Vertex b0 = new Vertex(0, s, s);
        Vertex b1 = new Vertex(-s, -s, s);
        Vertex b2 = new Vertex(s, -s, s);

        tris.add(new Triangle(f0, f1, f2, Color.RED));
        tris.add(new Triangle(b0, b2, b1, Color.GREEN));

        tris.add(new Triangle(f0, b1, f1, Color.BLUE));
        tris.add(new Triangle(f0, b0, b1, Color.BLUE));

        tris.add(new Triangle(f0, f2, b2, Color.YELLOW));
        tris.add(new Triangle(f0, b2, b0, Color.YELLOW));

        tris.add(new Triangle(f1, b2, f2, Color.WHITE));
        tris.add(new Triangle(f1, b1, b2, Color.WHITE));

        return tris;
    }
}
