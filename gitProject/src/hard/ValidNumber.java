package hard;

public class ValidNumber {

	public static void main(String[] args) {
		ValidNumber sol = new ValidNumber();
		
		/*
		 * System.out.println(sol.isNumber("0"));
		 * System.out.println(sol.isNumber("0.1"));
		 * System.out.println(sol.isNumber("abc"));
		 * System.out.println(sol.isNumber("1 a"));
		 * System.out.println(sol.isNumber("2e10"));
		 * System.out.println(sol.isNumber("-90e3"));
		 * System.out.println(sol.isNumber("1e"));
		 * System.out.println(sol.isNumber("e3"));
		 * System.out.println(sol.isNumber("6e-1"));
		 * System.out.println(sol.isNumber("99e2.5"));
		 * System.out.println(sol.isNumber("53.5e93"));
		 * System.out.println(sol.isNumber("--6"));
		 * System.out.println(sol.isNumber("-+3"));
		 * System.out.println(sol.isNumber("95a54e53"));
		 */
		System.out.println(sol.isNumber("959440.94f"));

	}
	
	/*
	 * "0" => true " 0.1 " => true "abc" => false "1 a" => false "2e10" => true
	 * " -90e3   " => true " 1e" => false "e3" => false " 6e-1" => true " 99e2.5 "
	 * => false "53.5e93" => true " --6 " => false "-+3" => false "95a54e53" =>
	 * false
	 */
	
	public boolean isNumber(String s) {
		
		try {
			//Integer.parseInt(s);
			 if(s.endsWith("f")){
	                return false;
	            }
			System.out.print("TRUE "+Double.parseDouble(s));			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print("FALSE "+s);
			return false;
		}
        
		return true;
    }

}
