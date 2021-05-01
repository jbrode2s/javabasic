public class RechteckXYPerEcke
{
   private Punkt2D lu;
   private Punkt2D ru;
   private Punkt2D lo;
   private Punkt2D ro;

   public RechteckXYPerEcke(double x1, double x2, double y1, double y2) //x1 = xl link, x2 = x rechts, y1 = y unten, y2 = y oben
   {
      this.lu = new Punkt2D(x1,y1);
      this.ru = new Punkt2D(x2,y1);
      this.lo = new Punkt2D(x1,y2);
      this.ro = new Punkt2D(x2,y2);
   }

   public RechteckXYPerEcke(Punkt2D d1, Punkt2D d2) //Punkt von den Diagonalen von Rechteck
   {
      double x1,x2,y1,y2;
      if (d1.x()>d2.x())
      {
         x1 = d2.x(); //d1.x() entspricht x-Wert von ru und d2 lu
         x2 = d1.x();
      }
      else
      {
         x1=d1.x();
         x2=d2.x();
      }
      if (d1.y()>d2.y())
      {
         y1 = d2.y();
         y2 = d1.y();
      }
      else
      {
         y1 = d1.y();
         y2 = d2.y();
      }
      this.lu = new Punkt2D(x1,y1);
      this.ru = new Punkt2D(x2,y1);
      this.lo = new Punkt2D(x1,y2);
      this.ro = new Punkt2D(x2,y2);
     //wie Methode ReckXY(double x1, x2...) aufrufen?
	 /*# Ja! Das waere sehr elegant gewesen. So haetten
	   # Sie an dieser Stelle keinen redundanten Code.
	 */
   }

   public RechteckXYPerEcke(RechteckXYPerEcke rEckXY)
   {
      this.lu = rEckXY.lu;
      this.ru = rEckXY.ru;
      this.lo = rEckXY.lo;
      this.ro = rEckXY.ro;
   }

   public boolean equals(RechteckXYPerEcke rEckXY)
   {
      if (this.lu.equals(rEckXY.lu) & this.ru.equals(rEckXY.ru) & this.lo.equals(rEckXY.lo) & this.ro.equals(rEckXY.ro)) return true;
      return false;
   }

   public double breite()
   {
      return ru.x()-lu.x();
   }

   public double hoehe()
   {
      return lo.y()-lu.y();
   }

   public Punkt2D ecke(boolean isRechts, boolean isOben)
   {
      if (isRechts & isOben)
      {
         return ro;
      }
      else if (!isRechts & isOben)
      {
         return lo;
      }
      else if (isRechts & !isOben)
      {
         return ru;
      }
      else //!isRechts & !isOben
      {
         return lu;
      }
   }

   public Punkt2D ecke(int eckeNr) //Ausgabe Punkt2D von Eckennummerirung gegen Uhrzeigersinn (lu=0,ru=1,..lo=3)
   {
      switch (eckeNr)
      {
         case 0:
         {
            return lu;
         }
         case 1:
         {
            return ru;
         }
         case 2:
         {
            return ro;
         }
         case 3:
         {
            return lo;
         }
      }
	  return lu;
   }

   public Punkt2D mitte()
   {
      /* Punkt2D punktMitte = new Punkt2D(0,0);
      punktMitte.setX(lu.x()+(breite()/2));
      punktMitte.setY(lu.y()+(hoehe()/2)); */
      return new Punkt2D(lu.x() + (breite()/2), lu.y() + (hoehe()/2)); //Punkt lu + 1/2 Breite + 1/2 Hoehe = Mitte
   }

   public double durchmesser()
   {
      return Math.sqrt(breite()*breite()+hoehe()*hoehe()); //Satz des Phythagoras
   }

   public double umfang()
   {
      return 2*breite()+2*hoehe();
   }

   public double flaeche()
   {
      return (breite()*hoehe());
   }

   public RechteckXYPerEcke verschiebe(double x, double y)
   {
      lu.verschiebe(x, y);
      ru.verschiebe(x, y);
      lo.verschiebe(x, y);
      ro.verschiebe(x, y);
      return this;
   }

   public String toString()
   {
      return "["+lu.toString()+","+ro.toString()+"]"; //Darstellung "[(1,2),(5,7)]"
   }
}
