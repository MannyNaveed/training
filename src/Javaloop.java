public class Javaloop {

    int main()
    {
        int x = 25, y = 5;
        // Code to swap 'x' (1010) and 'y' (0101)
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)
       // cout << "After Swapping: x =" << x << ", y=" << y;
        return 0;
    }
}
