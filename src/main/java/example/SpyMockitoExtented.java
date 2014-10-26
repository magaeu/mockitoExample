package example;

public class SpyMockitoExtented extends SpyMockito {

	public String onlyMoreDemonstration() {
		System.out.println(onlyDemonstration());
		System.out.println(onlyAnotherDemonstration());
		
		return "This is a mix of demonstrations methods.";
	}
}
