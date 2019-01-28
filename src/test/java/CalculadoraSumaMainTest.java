import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraSumaMainTest {

	@Test
	public void testSuma() {
		Suma s = new Suma();
		assertEquals(new Double(4.0) , new Double(s.suma(2.0,2.0)));
	}
	
	@Test
	public void main1() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"1", "15", "3"});
	}
	
	@Test
	public void main1error() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"1", "j", "3"});
	}
	
	@Test
	public void main2() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"2", "15", "3"});
	}
	
	@Test
	public void main2error() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"2", "j", "3"});
	}
	
	
	@Test
	public void main3() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"3", "15", "3"});
	}
	
	@Test
	public void main3error() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"3", "j", "3"});
	}
	
	
	@Test
	public void main4() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"4", "15", "3"});
	}
	
	@Test
	public void main4error() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"4", "j", "3"});
	}
	@Test
	public void main5() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"5", "15", "3"});
	}
	
	@Test
	public void main5error() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"5", "j", "3"});
	}
	
	@Test
	public void mainerror() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"7", "3", "-"});
	}

	@Test
	public void mainerrorsum() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"1", "3", "-"});
	}
	@Test
	public void mainerrorres() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"2", "3", "y"});
	}
	@Test
	public void mainerrormul() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"3", "3", "-"});
	}
	@Test
	public void mainerrordiv() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"4", "3", "-"});
	}
	@Test
	public void mainerrorpot() {
		Calculadora cal = new Calculadora();
		
		Calculadora.main(new String[] {"5", "3", "-"});
	}
	
	

}
