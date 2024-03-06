public class Arith
{
    public satatic void main(String args[])
    {
        byte a = 127;
        short b =32767;
        int c = 2147483647;
        long d =  9223372036854775807L;
        int e = 0;
        a += 1;
        b += 1;
        c += 1;
        d += 1;
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
        System.out.println("Valor de c = " + c);
        System.out.println("Valor de d = " + d);
        d /= e; // vai dar erro porque e=0
    }
}

