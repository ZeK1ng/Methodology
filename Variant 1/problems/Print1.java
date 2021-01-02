ProblemA პასუხი:


ProblemB პასუხი:


ProblemC პასუხი:


import acm.program.ConsoleProgram;
public class ProblemA extends ConsoleProgram{
	public void run(){
		println(bla(x,y) / bla(x/2,0));
		println(bla(2,x));
	}

	private int bla(int x, int y) {
		x++;
		this.x = x+y;
		this.y = this.x + y;
		return this.y+x;
	}
	
	private int x = 1;
	private int y = 3;
}


import acm.program.ConsoleProgram;
public class ProblemB extends ConsoleProgram {
	public void run() {
		String s = "bla1";
		String[] arr = new String[2];
		arr[0] = "bla2";
		arr[1] = "bla3";
		changes(s, arr[0], arr);
		println(s);
		println(arr[1]);
		println(arr[0]);	
	}
	private void changes(String s1, String s2, String[] arr) {
		s1 = "text11";
		s2 = "text12";
		arr[1] = "text10";
	}
	
}



import acm.program.ConsoleProgram;
public class ProblemC extends ConsoleProgram {
	public void run() {
		String s1 = "abcd" + "efg";
		String s2 = "abcdefg";
		s2 = s2 + "";
		if (s1 == s2)
			println("a");
		if (s1.equals(s2))
			println("b");
		if (s1 == getABC())
			println("c");			
	}
	private String getABC() {
		String s = "abcdefg";
		return s;
	}	
}
