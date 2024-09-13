package punto2.main;

import java.util.ArrayList;
import java.util.Iterator;

import punto2.model.Efemeride;
import punto2.util.Mes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Efemeride> efemerides = new ArrayList<>();
		 efemerides.add(new Efemeride(1, "Independencia", Mes.JULIO, 9, "Celebración del día de la independencia"));
		 efemerides.add(new Efemeride(2, "Dia del Veterano", Mes.ABRIL, 2, "Celebración del día del veterano"));
		 efemerides.add(new Efemeride(3, "Dia del Inmigrante", Mes.SEPTIEMBRE, 2, "Dia del Inmigrante ilegal"));
		 efemerides.add(new Efemeride(4, "Dia de la no Violencia", Mes.OCTUBRE, 2, "Dia de la no Violencia"));
		 efemerides.add(new Efemeride(5, "Dia de la Tradicion", Mes.NOVIEMBRE, 10, "Celebración por el Dia de la Tradicion"));
		 
		 
		 for (int i = 0; i < efemerides.size(); i++) {
	            Efemeride efemeride = efemerides.get(i);
	            System.out.println("Nombre: " + efemeride.getNombre() +
	                               ", Día: " + efemeride.getDia() +
	                               ", Mes: " + efemeride.getMes());
			  
			  efemerides.remove(2);
			  
			  Efemeride segunda = efemerides.get(1);
			  segunda.setNombre("Dia del Mestro");
			  segunda.setDetalle("Celebracion del Dia del Maestro");
			  
			  System.out.println("\nEfemérides restantes:");
		        for (int d = 0; d < efemerides.size(); d++) {
		            System.out.println(efemerides.get(d));
		        }
		  }
		 
		 
	}

}
