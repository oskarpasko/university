package com.company;

class Prostokat extends Figura {
	double wys=0, szer=0;

	Prostokat(){
		punkt = new Punkt("Pk", 0, 0);
	}
	Prostokat(Punkt punkt){
		this.punkt = punkt;
	}
	
	Prostokat(double wys,double szer, String kolor){
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

    double getPowierzchnia() {
        return (szer * wys);
    }

	void przesun(double a, double b){
		this.punkt.x += a;
		this.punkt.y += b;

		System.out.println("S("+this.punkt.x+", "+this.punkt.y+")");
	}
    
    
}