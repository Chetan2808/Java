public class TriangleMain {



        public static void main(String[] args) {
            Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
            Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);
            double triangleAArea = triangleA.findArea();
            System.out.println(triangleAArea);
            double triangleBarea = triangleB.findArea();
            System.out.println(triangleBarea);
            //System.out.println(Math.pow(triangleAArea,triangleBarea));
            System.out.println(triangleA.sideLenOne);


            // Triangle.findArea()? --> Math.pow(2,3)?


        }

    }

