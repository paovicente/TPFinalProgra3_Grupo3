package igu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class VentanaEmpleado extends JFrame {

	private JPanel contentPane;
	private JPanel panel_RondaEncuentros;
	private JPanel panel_getElecciones;
	private JPanel panel_addEmpleado;
	private JLabel label_rondaEncuentros;
	private JButton btn_rondaEncuentros;
	private JLabel label_MostrarElecciones;
	private JLabel label_agregarEmpleado;
	private JButton btn_agregarEmpleado;
	private JPanel panel_LabelRondaEncuentros;
	private JPanel panel_btnRondaEncuentros;
	private JPanel panel_actionElecciones;
	private JPanel panel_labelAddEmpleado;
	private JPanel panel_btnAddEmpleado;
	private JPanel panel_btnElecciones;
	private JButton btn_mostrarElecciones;
	private JPanel panel_infoElecciones;
	private JPanel panel_labelElecciones;
	private JPanel panel_textAreaElecciones;
	private JScrollPane scrollPane;
	private JList list;
	private ActionListener actionlistener;
	
	
	/**
	 * Create the frame.
	 */
	public VentanaEmpleado() {
		setTitle("Bienvenido Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 489);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_RondaEncuentros = new JPanel();
		this.panel_RondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_RondaEncuentros.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_RondaEncuentros);
		this.panel_RondaEncuentros.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_LabelRondaEncuentros = new JPanel();
		this.panel_LabelRondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_RondaEncuentros.add(this.panel_LabelRondaEncuentros);
		this.panel_LabelRondaEncuentros.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.label_rondaEncuentros = new JLabel("Ronda Encuentros");
		this.label_rondaEncuentros.setFont(new Font("Century Gothic", Font.BOLD, 20));
		this.label_rondaEncuentros.setHorizontalAlignment(SwingConstants.RIGHT);
		this.panel_LabelRondaEncuentros.add(this.label_rondaEncuentros);
		
		this.panel_btnRondaEncuentros = new JPanel();
		this.panel_btnRondaEncuentros.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout = (FlowLayout) this.panel_btnRondaEncuentros.getLayout();
		flowLayout.setHgap(25);
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(40);
		this.panel_RondaEncuentros.add(this.panel_btnRondaEncuentros);
		
		this.btn_rondaEncuentros = new JButton("Iniciar");
		this.btn_rondaEncuentros.setFont(new Font("Century Gothic", Font.BOLD, 20));
		this.btn_rondaEncuentros.setMargin(new Insets(15, 30, 15, 30));
		this.panel_btnRondaEncuentros.add(this.btn_rondaEncuentros);
		
		this.panel_getElecciones = new JPanel();
		this.panel_getElecciones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_getElecciones);
		this.panel_getElecciones.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_actionElecciones = new JPanel();
		this.panel_actionElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_getElecciones.add(this.panel_actionElecciones);
		this.panel_actionElecciones.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_labelElecciones = new JPanel();
		this.panel_labelElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_actionElecciones.add(this.panel_labelElecciones);
		this.panel_labelElecciones.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.label_MostrarElecciones = new JLabel("Mostrar Elecciones");
		this.label_MostrarElecciones.setHorizontalAlignment(SwingConstants.RIGHT);
		this.panel_labelElecciones.add(this.label_MostrarElecciones);
		this.label_MostrarElecciones.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		this.panel_btnElecciones = new JPanel();
		this.panel_btnElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_actionElecciones.add(this.panel_btnElecciones);
		this.panel_btnElecciones.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
		
		this.btn_mostrarElecciones = new JButton("Mostrar");
		this.btn_mostrarElecciones.setMargin(new Insets(15, 30, 15, 30));
		this.btn_mostrarElecciones.setFont(new Font("Century Gothic", Font.BOLD, 20));
		this.panel_btnElecciones.add(this.btn_mostrarElecciones);
		
		this.panel_infoElecciones = new JPanel();
		this.panel_getElecciones.add(this.panel_infoElecciones);
		this.panel_infoElecciones.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.panel_textAreaElecciones = new JPanel();
		this.panel_textAreaElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_infoElecciones.add(this.panel_textAreaElecciones);
		this.panel_textAreaElecciones.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBorder(new LineBorder(Color.BLACK, 2, true));
		this.scrollPane.setPreferredSize(new Dimension(370, 120));
		this.panel_textAreaElecciones.add(this.scrollPane);
		
		this.list = new JList();
		this.list.setBackground(SystemColor.controlHighlight);
		this.list.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.scrollPane.setViewportView(this.list);
		
		this.panel_addEmpleado = new JPanel();
		this.panel_addEmpleado.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_addEmpleado);
		this.panel_addEmpleado.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_labelAddEmpleado = new JPanel();
		this.panel_labelAddEmpleado.setBackground(SystemColor.inactiveCaption);
		this.panel_addEmpleado.add(this.panel_labelAddEmpleado);
		this.panel_labelAddEmpleado.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.label_agregarEmpleado = new JLabel("Agregar Empleado");
		this.label_agregarEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 20));
		this.label_agregarEmpleado.setHorizontalAlignment(SwingConstants.RIGHT);
		this.panel_labelAddEmpleado.add(this.label_agregarEmpleado);
		
		this.panel_btnAddEmpleado = new JPanel();
		this.panel_btnAddEmpleado.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout_2 = (FlowLayout) this.panel_btnAddEmpleado.getLayout();
		flowLayout_2.setVgap(40);
		flowLayout_2.setHgap(25);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		this.panel_addEmpleado.add(this.panel_btnAddEmpleado);
		
		this.btn_agregarEmpleado = new JButton("Agregar");
		this.btn_agregarEmpleado.setMargin(new Insets(15, 30, 15, 30));
		this.btn_agregarEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 20));
		this.panel_btnAddEmpleado.add(this.btn_agregarEmpleado);
	}


	public JList getList() {
		return list;
	}


	public void setList(JList list) {
		this.list = list;
	}


	public ActionListener getActionlistener() {
		return actionlistener;
	}


	public void setActionListener(ActionListener actionlistener) {
		this.btn_rondaEncuentros.addActionListener(actionlistener);
		this.btn_mostrarElecciones.addActionListener(actionlistener);
		this.btn_agregarEmpleado.addActionListener(actionlistener);
		this.actionlistener = actionlistener;
	}


	public JButton getBtn_rondaEncuentros() {
		return btn_rondaEncuentros;
	}


	public JButton getBtn_agregarEmpleado() {
		return btn_agregarEmpleado;
	}


	public JButton getBtn_mostrarElecciones() {
		return btn_mostrarElecciones;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}

}