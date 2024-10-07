package kadai_018;

abstract class Kato_Chapter18 {
	
	String familyName;
	String givenName;
	String address;	
	
	public void commonIntroduce() {
		this.familyName = "加藤";
		this.address = "住所は東京都中野区〇×です";
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println(this.address);
		this.eachIntroduce();
	}
	

}
