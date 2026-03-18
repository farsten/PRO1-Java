public class Opgave4Stars {
    void main() {
        exA(10);
        exB(10);
    }

    public void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            IO.print(String.format("%2d: ", row));

            // print stars
            int starCount = rowCount - row + 1;
            for (int i = 1; i <= starCount; i++) {
                IO.print('*');
            }

            // print dashes
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= dashCount; i++) {
                IO.print('-');
            }

            IO.println();
        }


        }
    public void exB(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            IO.print(String.format("%2d: ", row));
            int starCount = rowCount - row;
            // print dashes
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= starCount; i++) {
                IO.print('-');

            }

            // print stars
            for (int i = 1; i <= dashCount; i++) {
                IO.print('*');
            }

            IO.println();
        }
    }
        public void exD(int rowCount) {

            for (int row = 1; row <= rowCount; row++) {
                // print row number
                IO.print(String.format("%2d: ", row));
                int starCount = rowCount - row;
                // print dashes
                int dashCount = rowCount - starCount;
                for (int i = 1; i <= starCount; i++) {
                    IO.print('-');

                }

                // print stars
                for (int i = 1; i <= dashCount; i++) {
                    IO.print('*');
                }

                IO.println();
            }

        }
}
