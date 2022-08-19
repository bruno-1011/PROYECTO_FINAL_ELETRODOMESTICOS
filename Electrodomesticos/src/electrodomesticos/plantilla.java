package plantilla.java;

import javax.swing.JOptionPane;

/**
 *
 * @author cheli
 */
public abstract class plantilla {
    protected  String Lavadora,microondas,estufa,plancha,refrigerador;
	private static String Datos ;
    private int lavadora ;
    private int Microondas ;
    private int Estufa ;
    private int Plancha ;
    private int Refrigerador;

	public void Operaciones() {
		int opcion = 0;
		int bandera = 0;
		do {
			do {
				opcion = Integer.parseInt(JOptionPane
						.showInputDialog("Porfavor seleccione una opcion:" + "\n" + "[1].-LAVADORA" + "\n"
								+ "[2].-MICROONDAS" + "\n" + "[3].-ESTUFA" + "\n" + "[4].-PLANCHA"+ "\n" + "[5].-REFRIGERADOR"+ "\n" + "[6].-Salir"

						));
				if (opcion >= 1 && opcion <= 4) {
					bandera = 1;
				} else {
					JOptionPane.showMessageDialog(null, "Opcion no encontrada");
				}
			} while (bandera == 0);
			
			switch (opcion) {
			case 1: //lavadora
				plantilla.java  creando_Lavadora= new Lavadora ();
				creando_Lavadora.Electrodomesticos();

				break;
				
			case 2: //MICROONDAS
				plantilla. creando_microondas= new microondas();
				creando_microondas.Electrodomesticos();
				
				break;
				
			case 3://estufa
				plantilla creando_estufa= new  estufa();
				creando_estufa.Electrodomesticos();
				break;
				
                        case 4://plancha
				plantilla creando_plancha= new  plancha();
				creando_plancha.Electrodomesticos();
				break;  
                        case 5://refrigerador
				plantilla creando_refrigerador= new  refrigerador();
				creando_refrigerador.Electrodomesticos();
				break;    
                            
			case 6://salir
				JOptionPane.showMessageDialog(null, "Vuelva pronto");
				bandera=2;
				break;

			}

		} while (bandera != 2);
	}
        public void Lavadora() {
		Lavadora = Integer.parseInt(JOptionPane.showInputDialog(null,"�desea ver datos del lavdora?: "));
	}
	
	public void Microondas() {
		microondas = Integer.parseInt(JOptionPane.showInputDialog(null,"datos del microondas"));
	}
        public void estufa() {
		estufa = Integer.parseInt(JOptionPane.showInputDialog(null,"datos del la estufa"));
	}
        public void plancha() {
		plancha = Integer.parseInt(JOptionPane.showInputDialog(null,"datos del la plancha"));
	}
        public void refrigerador() {
		refrigerador = Integer.parseInt(JOptionPane.showInputDialog(null,"datos del refrigerador"));
	}
	
	public abstract void Electrodomestico();

	public static String getDatos() {
		return Datos;
	}

	public static void setDatos(String Datos) {
		plantilla.Datos = Datos;
}

    private void Electrodomesticos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}