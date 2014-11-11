

/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase VentanaEdicionMascota, su función es abrir une ventana para editar la información de una mascota.
*
*/



package acceso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;

import logicaDeNegocios.*;


public class VentanaEdicionMascota extends JFrame{

	private JPanel contentPane;
	private JTextField txtfldChip;
	private JTextField txtfldRecompensa;
	private JComboBox cmbxTipo;
	private JComboBox cmbxRaza;
	private JComboBox cmbxProvincia;
	private JComboBox cmbxCanton;
	private JComboBox cmbxColorOjos;
	private JComboBox cmbxColorPelo;
	private JTextPane txtPaneNota;
	private JSpinner spinnerDia;
	private JSpinner spinnerMes;
	private JSpinner spinnerAnio;

	public VentanaEdicionMascota(int IdMascotaAEditar) throws IOException {
		
		Mascota mascotaActual = SistemasMascotas.getMascota(IdMascotaAEditar);
		
		setTitle("Edición de mascota");
		setResizable(false);
		setBounds(100, 100, 758, 597);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99,84, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloEdicion = new JLabel("Edici\u00F3n\r\n");
		lblTituloEdicion.setForeground(new Color(189, 183, 107));
		lblTituloEdicion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloEdicion.setFont(new Font("Khmer UI", Font.BOLD, 28));
		lblTituloEdicion.setBounds(10, 29, 143, 50);
		contentPane.add(lblTituloEdicion);
		
		JLabel label = new JLabel("____________________________________________________");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setForeground(new Color(189, 183, 107));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(20, 51, 710, 50);
		contentPane.add(label);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(new Color(189, 183, 107));
		lblTipo.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblTipo.setBounds(69, 152, 48, 50);
		contentPane.add(lblTipo);
		
		JLabel lblRaza = new JLabel("Raza:");
		lblRaza.setForeground(new Color(189, 183, 107));
		lblRaza.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblRaza.setBounds(69, 222, 48, 50);
		contentPane.add(lblRaza);
		
		JLabel lblChip = new JLabel("Chip:");
		lblChip.setForeground(new Color(189, 183, 107));
		lblChip.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblChip.setBounds(430, 283, 70, 50);
		contentPane.add(lblChip);
		
		JLabel lblColorDeOjos = new JLabel("Color de ojos:");
		lblColorDeOjos.setForeground(new Color(189, 183, 107));
		lblColorDeOjos.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblColorDeOjos.setBounds(69, 297, 97, 50);
		contentPane.add(lblColorDeOjos);
		
		JLabel lblColorDePelo = new JLabel("Color de pelo:");
		lblColorDePelo.setForeground(new Color(189, 183, 107));
		lblColorDePelo.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblColorDePelo.setBounds(71, 371, 114, 50);
		contentPane.add(lblColorDePelo);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setForeground(new Color(189, 183, 107));
		lblLugar.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblLugar.setBounds(418, 152, 70, 50);
		contentPane.add(lblLugar);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setForeground(new Color(189, 183, 107));
		lblFecha.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblFecha.setBounds(69, 474, 48, 50);
		contentPane.add(lblFecha);
		
		JLabel lblRecompensa = new JLabel("Recompensa:");
		lblRecompensa.setForeground(new Color(189, 183, 107));
		lblRecompensa.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblRecompensa.setBounds(372, 330, 104, 50);
		contentPane.add(lblRecompensa);
		
		JLabel lblNota = new JLabel("Nota:");
		lblNota.setForeground(new Color(189, 183, 107));
		lblNota.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		lblNota.setBounds(373, 377, 48, 50);
		contentPane.add(lblNota);
		
		txtfldChip = new JTextField();
		txtfldChip.setColumns(10);
		txtfldChip.setBounds(484, 299, 184, 20);
		txtfldChip.setText(mascotaActual.getChip());
		contentPane.add(txtfldChip);
		
		txtfldRecompensa = new JTextField();
		txtfldRecompensa.setColumns(10);
		txtfldRecompensa.setBounds(484, 346, 184, 20);
		txtfldRecompensa.setText(mascotaActual.getRecompensa());
		contentPane.add(txtfldRecompensa);
		
		txtPaneNota = new JTextPane();
		txtPaneNota.setBounds(431, 398, 237, 79);
		txtPaneNota.setText(mascotaActual.getNota());
		contentPane.add(txtPaneNota);
		
		cmbxTipo = new JComboBox();
		cmbxTipo.setModel(new DefaultComboBoxModel(Sistema.getListaTipo()));
		cmbxTipo.setBounds(122, 168, 143, 20);
		contentPane.add(cmbxTipo);
		String seleccionTipo = cmbxTipo.getSelectedItem().toString();
		
		cmbxRaza = new JComboBox();
		cmbxRaza.setModel(new DefaultComboBoxModel(Sistema.getListaRazas(cmbxTipo.getSelectedItem().toString())));
		cmbxRaza.setBounds(122, 238, 143, 20);
		contentPane.add(cmbxRaza);
		String seleccionRaza = cmbxRaza.getSelectedItem().toString();
		
		cmbxColorOjos = new JComboBox();
		cmbxColorOjos.setModel(new DefaultComboBoxModel(Sistema.arrayToString(Sistema.getListaColorDeOjos())));
		cmbxColorOjos.setBounds(122, 344, 143, 20);
		contentPane.add(cmbxColorOjos);
		String seleccionColorDeOjos = cmbxColorOjos.getSelectedItem().toString();
		
		cmbxColorPelo = new JComboBox();
		cmbxColorPelo.setModel(new DefaultComboBoxModel(Sistema.arrayToString(Sistema.getListaColorDePelo())));
		cmbxColorPelo.setBounds(122, 421, 143, 20);
		contentPane.add(cmbxColorPelo);
		String seleccionColorDePelo = cmbxColorPelo.getSelectedItem().toString();
		
		cmbxProvincia = new JComboBox();
		cmbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"San Jose", "Alajuela", "Cartago", "Heredia", "Puntarenas", "Limon", "Guanacaste"}));
        cmbxProvincia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cmbxProvincia.getSelectedIndex()==0){
                    cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Escazú","Desamparados","Puriscal","Tarrazú","Aserrí","Mora","Goicoechea",
                    		"Santa Ana","Alajuelita","Coronado","Acosta","Tibás","Moravia","Montes de Oca","Turrubares","Dota","Curridabat","Perez Zeledón","León Cortés"}))    ;           
                }
                if(cmbxProvincia.getSelectedIndex()==1){
                    cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","San Ramón","Grecia","San Mateo","Atenas","Naranjo",
                            "Palmares","Poás","Orotina","San Carlos","Alfaro Ruíz","Valverde Vega","Upala","Los Chiles","Guatuzo"}))   ;
                }
                if(cmbxProvincia.getSelectedIndex()==2){
                    cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Paraiso","La Unión","Jimenez","Turrialba","Alvarado","Oreamuno","El Guarco"}))    ;
                }
                if(cmbxProvincia.getSelectedIndex()==3){
                    cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Barva","Santo Domingo","Santa Barbara","San Rafael","San Isidro","Belén","Flores","San Pablo","Sarapiqui"}))  ;
                }
                if(cmbxProvincia.getSelectedIndex()==4){
                    cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Esparza","Buenos Aires","Montes de Oro","Osa","Aguirre","Golfito","Coto Brus","Parrita","Corredores","Garabito"}))    ;
                }
                if(cmbxProvincia.getSelectedIndex()==5){
                    cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Pococí","Siquirres","Talamanca","Matina","Guacimo"})) ;
                }
                if(cmbxProvincia.getSelectedIndex()==6){
                    cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Liberia","Nicoya","Santa Cruz","Bagaces","Carrillo","Cañas","Abangares","Tilaran","Nandayure","La Cruz","Hojancha"}))   ;
                }
            }
        });
		cmbxProvincia.setBounds(515, 211, 153, 20);
		contentPane.add(cmbxProvincia);
		String seleccionProvincia = cmbxProvincia.getSelectedItem().toString();
		
		cmbxCanton = new JComboBox();
		cmbxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Escazú","Desamparados","Puriscal","Tarrazú","Aserrí","Mora","Goicoechea","Santa Ana","Alajuelita",
													"Coronado","Acosta","Tibás","Moravia","Montes de Oca","Turrubares", "Dota","Curridabat","Perez Zeledón","León Cortés"}));    
		cmbxCanton.setBounds(515, 254, 153, 20);
		contentPane.add(cmbxCanton);
		String seleccionCanton = cmbxCanton.getSelectedItem().toString();
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setForeground(new Color(189, 183, 107));
		lblProvincia.setFont(new Font("Khmer UI", Font.PLAIN, 12));
		lblProvincia.setBounds(439, 194, 70, 50);
		contentPane.add(lblProvincia);
		
		JLabel lblCantn = new JLabel("Cant\u00F3n:");
		lblCantn.setForeground(new Color(189, 183, 107));
		lblCantn.setFont(new Font("Khmer UI", Font.PLAIN, 12));
		lblCantn.setBounds(449, 238, 70, 50);
		contentPane.add(lblCantn);
		
		String lugarElegido = (String)cmbxCanton.getSelectedItem() + ", " + (String)cmbxProvincia.getSelectedItem();
		
		spinnerDia = new JSpinner();
		spinnerDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinnerDia.setBounds(127, 490, 39, 20);
		contentPane.add(spinnerDia);
		
		spinnerMes = new JSpinner();
		spinnerMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinnerMes.setBounds(181, 490, 39, 20);
		contentPane.add(spinnerMes);
		
		spinnerAnio = new JSpinner();
		spinnerAnio.setModel(new SpinnerNumberModel(2014, 1990, 2014, 1));
		spinnerAnio.setBounds(233, 490, 63, 20);
		contentPane.add(spinnerAnio);
		
		String fechaElegida = spinnerDia.getValue().toString() + "/" + 
							  spinnerMes.getValue().toString() + "/" +
							  spinnerAnio.getValue().toString();
		
		JButton btnGuardar = new JButton("Guardar Cambios");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String estadoActual = SistemasMascotas.getMascota(IdMascotaAEditar).getEstado();
//				if(estadoActual.equals("PERDIDA") && seleccionEstado.equals("RECUPERADA")){
//					notificar();
//				}
				
				try {
					SistemasMascotas.leerMascota();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				SistemasMascotas.getMascota(IdMascotaAEditar).setChip(txtfldChip.getText());
				SistemasMascotas.getMascota(IdMascotaAEditar).setColorDeOjos(seleccionColorDeOjos);
				SistemasMascotas.getMascota(IdMascotaAEditar).setColorDePelo(seleccionColorDePelo);
				SistemasMascotas.getMascota(IdMascotaAEditar).setLugarVisto(lugarElegido);
				SistemasMascotas.getMascota(IdMascotaAEditar).setNota(txtPaneNota.getText());
				SistemasMascotas.getMascota(IdMascotaAEditar).setRaza(seleccionRaza);
				SistemasMascotas.getMascota(IdMascotaAEditar).setTipo(seleccionTipo);
				SistemasMascotas.getMascota(IdMascotaAEditar).setRecompensa(txtfldRecompensa.getText());
				SistemasMascotas.getMascota(IdMascotaAEditar).setDiaSuceso(fechaElegida);
				SistemasMascotas.GuardarMascota();
				dispose();
			}
		});
		btnGuardar.setBounds(530, 508, 143, 20);
		contentPane.add(btnGuardar);
	}
}

