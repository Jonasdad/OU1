import java.util.*; // Scanner, Locale
class Temperaturer
{
 public static void main (String[] args)
 {
 System.out.println ("TEMPERATURER\n");

 // inmatningsverktyg
 Scanner in = new Scanner (System.in);
 in.useLocale (Locale.US);
 // mata in uppgifter om antalet veckor och antalet m�tningar
 System.out.print ("antalet veckor: ");
 int antalVeckor = in.nextInt ();
 System.out.print ("antalet m�tningar per vecka: ");
 int antalMatningarPerVecka = in.nextInt ();
 // plats att lagra temperaturer

 double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];


 // mata in temperaturerna
 for (int vecka = 1; vecka <= antalVeckor; vecka++)
 {
 System.out.println ("temperaturer - vecka " + vecka + ":");
 for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
 t[vecka][matning] = in.nextDouble ();
 }

 System.out.println ();

 // visa temperaturerna
 System.out.println ("temperaturerna:");
 for (int vecka = 1; vecka <= antalVeckor; vecka++)
 {
 for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
 System.out.print (t[vecka][matning] + " ");
 System.out.println ();
 }
 System.out.println ();


 // den minsta, den st�rsta och medeltemperaturen � veckovis
 double[] minT = new double[antalVeckor + 1];
 double[] maxT = new double[antalVeckor + 1];
 double[] sumT = new double[antalVeckor + 1];
  double[] medelT = new double[antalVeckor + 1];
  // koden ska skrivas h�r
 //Hittar minsta v�rdet.
 for (int vecka = 1; vecka <= antalVeckor; vecka++){
	 	double min_t = t[vecka][1];
		double max_t = t[vecka][1];
		double sum_t = t[vecka][1];
		double d = 0;
		//Hitta medelv�rdet
	 	for (int matning = 2; matning <= antalMatningarPerVecka; matning++){

				d = t[vecka][matning];

				sum_t += d;
				sumT[vecka] = sum_t;
				medelT[vecka] = sumT[vecka] / antalMatningarPerVecka;

		}

		//Hitta minv�rde
		for (int matning = 2; matning <= antalMatningarPerVecka; matning++){

			if(min_t > t[vecka][matning])
				min_t = t[vecka][matning];


		}
		minT[vecka] = min_t;

		//Hitta maxv�rde
		for (int matning = 2; matning <= antalMatningarPerVecka; matning++){

					if(max_t < t[vecka][matning])
						max_t = t[vecka][matning];

				maxT[vecka] = max_t;
		}
 }

 for (int vecka =1; vecka <= antalVeckor; vecka++){
	System.out.println("Vecka " + vecka +
	", Minsta Temperatur " + minT[vecka]+
	", H�gsta Temperatur " + maxT[vecka]+
	", Medelv�rdet " + medelT[vecka]);
}


  double minTemp = minT[1];
  double maxTemp = maxT[1];
  double sumTemp = sumT[1];
  double medelTemp = 0;
  // koden ska skrivas h�r
  for (int matning = 1; matning <= antalVeckor; matning++){

	  if(minTemp > minT[matning])
	  	minTemp = minT[matning];

	if(maxTemp < maxT[matning])
		maxTemp = maxT[matning];
	}
for (int matning = 2; matning <= antalVeckor; matning++){
	sumTemp += sumT[matning];
	medelTemp = sumTemp / (antalVeckor * antalMatningarPerVecka);
}


System.out.println("Absolut minsta v�rdet: " + minTemp);
System.out.println("Absolut st�rsta v�rdet: " + maxTemp);
System.out.println("Absoluta medelv�rdet: " + medelTemp);
  // visa den minsta, den st�rsta och medeltemperaturen i hela m�tperioden
  // koden ska skrivas h�r
  }
 }
