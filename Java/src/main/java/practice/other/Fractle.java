package practice.other;

public class Fractle {

    interface I {
        String start_from();
        String end_to();
        void set_coordinates(int x, int y);
        String get_coordinates();
    }

    class Draw implements I {

        int x_coordinate, y_coordinate;

        public String start_from() {
            return "class draw method start_from (" +x_coordinate + "," + y_coordinate +")";
        }

        public String end_to() {
            return "class draw method end_to (" +x_coordinate + "," + y_coordinate +")";
        }

        public void set_coordinates(int x, int y) {
            x_coordinate = x;
            y_coordinate = y;
        }

        public String get_coordinates() {
            return "(" + x_coordinate + "," + y_coordinate +")";
        }
    }

    class Erase implements I {

        int x_coordinate, y_coordinate;

        public String start_from() {
            return "class erase method start_from (" +x_coordinate + "," + y_coordinate +")";
        }

        public String end_to() {
            return "class erase method end_to (" +x_coordinate + "," + y_coordinate +")";
        }

        public void set_coordinates(int x, int y) {
            x_coordinate = x;
            y_coordinate = y;
        }

        public String get_coordinates() {
            return "(" + x_coordinate + "," + y_coordinate +")";
        }
    }

    class Pointer implements I {

        private I i = null;

        public Pointer(I i) {
            this.i = i;
        }

        public String start_from() {
            return i.start_from();
        }

        public String end_to() {
            return i.end_to();
        }

        public void set_coordinates(int x, int y) {
            i.set_coordinates(x, y);
        }

        public String get_coordinates() {
            return i.get_coordinates();
        }
    }


    public Fractle() {

        Pointer pointer = new Pointer(new Erase());
        pointer.set_coordinates(1,1);
        System.out.println(pointer.start_from());
        System.out.println(pointer.end_to());
        System.out.println(pointer.get_coordinates());
    }
}
