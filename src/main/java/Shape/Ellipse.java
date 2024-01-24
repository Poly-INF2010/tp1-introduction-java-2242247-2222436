package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {

        // https://arc.net/l/quote/xemzatzp

        super();
        Double h = 0.0;
        Double k = 0.0;
        Double a = widthDiameter;
        Double b = heightDiameter;
        for(Double x = -a/2; x < a/2; x +=0.5) {
            for(Double y = -b/2; y < b/2; y +=0.5) {
                if((Math.pow(x-h, 2)/Math.pow(a/2, 2)) + (Math.pow(y-k, 2)/Math.pow(b/2, 2)) <= 1) {
                    add(new Point2d(x, y));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
