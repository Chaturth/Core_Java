class President{
public static void main(String[] args){
	govern();
}
	static void govern(){
		System.out.println("governs the country");
		callState();
	}
	static void callState(){
		System.out.println("calls state gvrt");
		rules();
	}
	static void rules(){
		System.out.println("new rules");
		check();
	}
	static void check(){
		System.out.println("check rules");
		calladmin();
	}
	static void calladmin(){
		System.out.println("calls s");
		collect();
	}
	static void collect(){
		System.out.println("collections");
		apply();
	}
	static void apply(){
		System.out.println("rules applied");
		chain();
	}
	static void chain(){
		System.out.println("chain continoues");
		citizen();
	}
	static void citizen(){
		System.out.println("citizens");
		follow();
	}
	static void follow(){
		System.out.println("follow rules");
	}
}
