class Line {
    private Point A;
    private Point B;
    private Point startPoint;
    private Point endPoint;

    public Line(Point A, Point B)
    {
        this.A = A;
        this.B = B;
        this.startPoint = new Point(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        this.endPoint = new Point(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
    }

    public Boolean isOnTheLine(Point C)
    {
        double vectorAX = C.getX() - this.A.getX();
        double vectorAY = C.getY() - this.A.getY();

        double vectorBX = this.B.getX() - this.A.getX();
        double vectorBY = this.B.getY() - this.A.getY();

        double area = vectorAX * vectorBY - vectorBX * vectorAY;

        System.out.println(area);

        if (area != 0 ) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Line{" +
                "A=" + A +
                ", B=" + B +
                ", startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}