package Java_Point_Practice;

public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int   a = 10;
		float b = a;
		System.out.println(a);
		System.out.println(b);
		
		float c = 20.5f;
		int d =  (int)c;
		System.out.println(c);
		System.out.println(d);
		
		int e = 256;
		byte f =(byte) e;
		System.out.println(e);
		System.out.println(f);
		
		double g = 10000d;
		int h = (int)g;
		System.out.println(g);
		System.out.println(h);
		
		float i = 200.59f;
		double j = i;
		System.out.println(i);
		System.out.println(j);
		
		double k = 109.19f;
		float l = (float)k;
		System.out.println(k);
		System.out.println(l);
		
		float m = 254.09f;
		byte n = (byte)m;
		System.out.println(m);
		System.out.println(n);
		
		byte o = 127;
		int p = (int)o;
		System.out.println(o);
		System.out.println(p);

		byte q = 10;
		byte r = 25;
		byte A = (byte)(q+r);
		System.out.println(A);
		
		float s = 0.5f;
		float t = 0.9f;
		float B = s+t;
		System.out.println(B);
		
		byte u = 14;
		int v = 20;
		float w = u + v;
		System.out.println(w);
		
		
	}

}
