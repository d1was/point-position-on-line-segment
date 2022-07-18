public class Ray {
    private Point B;
    private Point startPoint;
    private Point endPoint;

    public Ray(Point A, Point B)
    {
        this.startPoint = A;
        this.B = B;
        this.endPoint = new Point(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
    }

    @Override
    public String toString() {
        return "Ray{" +
                "B=" + B +
                ", startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
