//@37 - Test Class

public class Test {
    public int n = 0;

    Test(int N) {
        if ( N <= 0 ) {
            n = -1;
        }
        else {
            for ( int i = 0; i < N; i++ ) {
                n += (2 * i) + 1;
            }
        }
    }
}
