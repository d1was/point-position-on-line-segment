class Line {
    private Point A;
    private Point B;
    private Point INFINITY1;
    private Point INFINITY2;

    public Line(Point A, Point B)
    {
        this.A = A;
        this.B = B;
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
}