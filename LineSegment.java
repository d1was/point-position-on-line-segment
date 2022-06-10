class LineSegment {
    private Point A ;
    private Point B ;

    public LineSegment(Point A, Point B)
    {
        this.A = A;
        this.B = B;
    }

    public LinePosition findPosition(Point C)
    {
        double distanceFromAToB = this.calculateDistance(this.A, this.B);
        double distanceFromAToC = this.calculateDistance(this.A, C);
        double distanceFromBToC = this.calculateDistance(this.B, C);

        if(distanceFromAToC <= distanceFromAToB && distanceFromBToC <= distanceFromAToB) {
            return LinePosition.BETWEEN;
        } else if ( distanceFromAToC <= distanceFromBToC) {
            return LinePosition.BEHIND;
        } else {
            return LinePosition.BEYOND;
        }
    }

    private double calculateDistance(Point A, Point B)
    {
        return Math.sqrt( (Math.pow(B.getX() - A.getX(), 2)) + (Math.pow(B.getY() - A.getY(), 2)) );
    }

}