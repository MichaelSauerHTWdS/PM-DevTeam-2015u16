public Bakterie	{

	private int anzahl;
	private String name;
	private int anzahlAnChromosomen;

	public Bakterie(int anzahl, String name, int anzahlAnChromosomen){
		
		this.anzahl = anzahl;
		this.name = name;
		this anzahlAnChromosomen = anzahlAnChromosomen;
	}

	public int getAnzahl(){

		return anzahl;	
	}

	public int getName(){

		return name;	
	}

	public int getAnzahlAnChromosomen(){

		return anzahlAnChromosomen;	
	}
}
