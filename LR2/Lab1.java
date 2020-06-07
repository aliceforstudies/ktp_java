public class Lab1 {
	public static void main(String[] args){

		Double[][] d = {{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0}};

		for (int i = 0; i<3; i++) {
			String[] s = args[i].split(",");
			for (int j = 0; j < 3; j++) {
				d[i][j] = Double.parseDouble(s[j]);
			}
		}

		Point3d p1 = new Point3d(d[0][0], d[0][1], d[0][2]);
		Point3d p2 = new Point3d(d[1][0], d[1][1], d[1][2]);
		Point3d p3 = new Point3d(d[2][0], d[2][1], d[2][2]);

		noEquals(p1,p2,p3);

		if (isTriExist(p1,p2,p3)) {
			Double area = computeArea(p1,p2,p3);
			System.out.print("Area: ");
			System.out.format("%.2f%n", area);
		} 
		else {
			System.out.println("Points are on the same line!");
		}
		
	}

	public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
		Double side1 = Point3d.distanceTo(p1, p2);
		Double side2 = Point3d.distanceTo(p1, p3);
		Double side3 = Point3d.distanceTo(p2, p3);
		Double pp = (side1 + side2 + side3)/2;
		return Math.sqrt(pp*(pp-side1)*(pp-side2)*(pp-side3));
	}

	public static void noEquals(Point3d p1, Point3d p2, Point3d p3) {
		if (Point3d.isEqual(p1, p2)) {
			p1.setX(1.0);
			p1.setY(0.0);
			p1.setZ(0.0);
		}
		if (Point3d.isEqual(p2, p3)) {
			p2.setX(0.0);
			p2.setY(1.0);
			p2.setZ(0.0);
		}
		if (Point3d.isEqual(p1, p3)) {
			p3.setX(0.0);
			p3.setY(0.0);
			p3.setZ(1.0);
		}
	}

	public static boolean isTriExist(Point3d p1, Point3d p2, Point3d p3) {
		return Point3d.distanceTo(p1, p2) < Point3d.distanceTo(p1, p3) + Point3d.distanceTo(p2, p3)
			&& Point3d.distanceTo(p1, p3) < Point3d.distanceTo(p1, p2) + Point3d.distanceTo(p2, p3)
			&& Point3d.distanceTo(p2, p3) < Point3d.distanceTo(p1, p2) + Point3d.distanceTo(p1, p3);
	}
}