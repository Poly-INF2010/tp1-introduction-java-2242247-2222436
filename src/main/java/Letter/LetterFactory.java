package Letter;

import Interface.Transform;
import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape a = new BaseShape();
        a.addAll(a.rotate(a.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(-halfMaxWidth/2-halfStripeThickness, 0.0)), Math.toRadians(15.0)));
        a.addAll(a.rotate(a.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(halfMaxWidth/2+halfStripeThickness, 0.0)), Math.toRadians(-15.0)));
        a.addAll((new Rectangle(maxWidth, stripeThickness)).getCoords());
        return a;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape b = new BaseShape();
        b.addAll(b.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(-halfMaxWidth, 0.0)));
        b.addAll(b.translate(new Circle(halfMaxHeight/2).getCoords(), new Point2d(0.0, halfMaxHeight/2)));
        b.addAll(b.translate(new Circle(halfMaxHeight/2).getCoords(), new Point2d(0.0, -halfMaxHeight/2)));
        b.removeAll(b.translate(new Circle(halfMaxHeight/2-halfStripeThickness).getCoords(), new Point2d(0.0, halfMaxHeight/2)));
        b.removeAll(b.translate(new Circle(halfMaxHeight/2-halfStripeThickness).getCoords(), new Point2d(0.0, -halfMaxHeight/2)));
        return b;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = create_O();
        c.removeAll(c.translate(new Square(halfMaxHeight).getCoords(), new Point2d(halfMaxWidth, 0.0)));
        return c;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();
        e.addAll(e.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(-halfMaxWidth+ stripeThickness/2, 0.0)));
        e.addAll((new Rectangle(maxWidth, stripeThickness)).getCoords());
        e.addAll(e.translate((new Rectangle(maxWidth, stripeThickness)).getCoords(), new Point2d(0.0, halfMaxHeight - stripeThickness/2)));
        e.addAll(e.translate((new Rectangle(maxWidth, stripeThickness)).getCoords(), new Point2d(0.0, -halfMaxHeight+ stripeThickness/2)));
        return e;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();
        h.addAll(h.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(-halfMaxWidth, 0.0)));
        h.addAll(h.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(halfMaxWidth, 0.0)));
        h.addAll((new Rectangle(maxWidth, stripeThickness)).getCoords());
        return h;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape n = new BaseShape();
        n.addAll(n.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(-halfMaxWidth, 0.0)));
        n.addAll(n.translate(new Rectangle(stripeThickness, maxHeight).getCoords(), new Point2d(halfMaxWidth, 0.0)));
        n.addAll(n.rotate(new Rectangle(stripeThickness, maxHeight).getCoords(), Math.toRadians(-20.0)));
        return n;

    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape o =  new Ellipse(maxWidth, maxHeight);
        o.remove(new Ellipse(maxWidth - stripeThickness, maxHeight - stripeThickness));
        return o;
    }

}
