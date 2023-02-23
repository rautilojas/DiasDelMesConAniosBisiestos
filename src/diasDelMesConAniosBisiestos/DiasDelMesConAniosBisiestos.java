package diasDelMesConAniosBisiestos;
import javax.swing.JOptionPane;

public class DiasDelMesConAniosBisiestos {

	public static void main(String[] args) {
		
		int numYear = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
		
		switch (month) {
			case 1: 
				JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
			break;
			case 2:
				if (numYear % 400 == 0 || (numYear % 4 == 0 && !(numYear % 100 == 0))) {
					JOptionPane.showMessageDialog(null, "El mes tiene 29 dìas!");
				} else {
					JOptionPane.showMessageDialog(null, "El mes tiene 28 dìas!");
				}
			break;
			case 3: 
				JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
			break;
			case 4:
				JOptionPane.showMessageDialog(null, "El mes tiene 30 dìas!");
			break;
			case 5: 
				JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
			break;
			case 6:
				JOptionPane.showMessageDialog(null, "El mes tiene 30 dìas!");
			break;
			case 7: 
				JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
			break;
			case 8:
				JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
			break;
			case 9: 
				JOptionPane.showMessageDialog(null, "El mes tiene 30 dìas!");
			break;
			case 10:
				JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
			break;
			case 11: 
				JOptionPane.showMessageDialog(null, "El mes tiene 30 dìas!");
			break;
			case 12:
				JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Ingrese un mes valido");
		}
		
	}

}
