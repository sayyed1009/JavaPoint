package Java_Point_Practice;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 20;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println("_____________________________________________________");
		
		int a = 1;
		int b = 1;
		System.out.println(a++ + a++);
		System.out.println(b++ + ++b);
		
		int c = 20;
		int d = -10;
		System.out.println(~c);
		System.out.println(~d);
		
		boolean E = true;
		boolean F = false;
		System.out.println(E);
		System.out.println(F);
		System.out.println(!E);
		System.out.println(!F);
		
		int A = 5;
		int B = 6;
		int C = 7;
		int D = 8;
		System.out.println(A + B * C - D);
		
		System.out.println(10 << 2);
		System.out.println(3 << 5);
		
		System.out.println(10>5 && 5>3);
		System.out.println(10<5 && 5>3);
		System.out.println(10>5 || 5<3);
		System.out.println(10>5 & 5 <3);
		System.out.println(10>5 | 5 <3);
		System.out.println("_________________Java Ternary Operator Example____________________________________");
		
		int X = 10;
		int Y = 6;
		int Z = (X>Y)?X:Y;
		System.out.println(Z);
		int W = 10;
		int V = Z + W;
		System.out.println(V);
		int U = (V>=16)?V:16;
		System.out.println(U<=16);
		System.out.println("___________________Java Assignment Operator Example__________________________________");
		
		int S = 100;
		int R = 200;
		S += 10;
		R -= 10;
		int Q = S+R;
		System.out.println(S);
		System.out.println(R);
		System.out.println(Q);
		System.out.println();
		int M = 10;
		M += 4;
		System.out.println(M);
		M -= 2;
		System.out.println(M);
		M *= 5;
		System.out.println(M);
		M /= 2;
		System.out.println(M);
		M %= 21;
		System.out.println(M);
		
		System.out.println("_______________________Short______________________________");
		
		short G = 15;
		short H = 25;
		short I = (short)( G + H);
		System.out.println(I);
		
		

	}

}
