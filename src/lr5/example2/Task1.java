package lr5.example2;

class Task1 {
        private char ch1;
        private char ch2;

        public void setCh1Ch2(char ch1, char ch2) {
            this.ch1 = ch1;
            this.ch2 = ch2;
        }

        public void showChar() {
            int int1 = ch1;
            int int2 = ch2;
            if (ch1 > ch2) {
                int1 = ch2;
                int2 = ch1;
            }
            int a = 1;
            for (int i = int1; i <= int2; i++) {
                System.out.println(a + " Symbol = " + (char) i);
                a++;
            }
        }
    }
