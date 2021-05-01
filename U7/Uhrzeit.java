public class Uhrzeit {
	private int stunden;
	private int minuten;
	private static boolean is12h = false;
	
	public Uhrzeit() {
		this(0,0);
	}
	
	public Uhrzeit(int st) {
		this(st,0);
	}
	
	public Uhrzeit(int st, int min) {
		this.stunden = st;
		this.minuten = min;
	}
	
	public Uhrzeit(Uhrzeit uz) {
		this.stunden = uz.stunden;
		this.minuten = uz.stunden;
	}
	
	public int stunde() {
		return this.stunden;
	}
	
	public int minute() {
		return this.minuten;
	}
	
	public boolean equals(Uhrzeit in) {
		if(this.stunden != in.stunden) return false;
		if(this.minuten != in.minuten) return false;
        return true;
    }

    public boolean istFrueher(Uhrzeit in) {
        if (this.stunden < in.stunden) {
            return true;
        }

        if (this.stunden > in.stunden) {
            return false;
        }

        return (this.minuten < in.minuten);
    } 

    public String toString() {
		int stunden = this.stunden;
        int minuten = this.minuten;
        String apm = "";

        if (is12h) {
			if(this.stunden < 12) {
				apm = " a.m.";
			} else {
				apm = " p.m.";
			}
			
			if(this.stunden > 12) {
				stunden = stunden % 12;
			} else {
				stunden = stunden;
			}
			
            if (this.stunden == 0) {
                stunden = 12;
            }
        }

        return (String.format("%02d",stunden)+":"+String.format("%02d",minuten) + apm);
    }

    public static void set12h24h() {
        is12h = !is12h;
    }
}
