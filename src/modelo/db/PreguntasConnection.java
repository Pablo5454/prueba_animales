package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Preguntas;

public class PreguntasConnection {
	private static Connection conectar() {
		String URI= "jdbc:mysql://localhost:3306/test";
		String usuario="root";
		String password = "";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(URI, usuario, password);
		} catch (SQLException e) {
			System.err.println("Error al conectar con la base de datos.");		}
		
		return con;
		
	}
	
	public static ArrayList<Preguntas> importarPreguntas(){
		ArrayList<Preguntas> listaPreguntas = new ArrayList();
		Connection con = conectar();
		try {
			Statement st = con.createStatement();
			String sql = "SELECT * FROM preguntas";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				
				String enunciado = rs.getString("Enunciado");
				String pregunta1 = rs.getString("Pregunta_1");
				String pregunta2 = rs.getString("Pregunta_2");
				String pregunta3 = rs.getString("Pregunta_3");
				String solucion = rs.getString("Solucion");
				String imagen = rs.getString("Imagen");
				
				Preguntas p = new Preguntas(enunciado, pregunta1, pregunta2, pregunta3, solucion, imagen);
				listaPreguntas.add(p);


			}
		} catch (SQLException e) {
			System.err.println("Error en el statemen importarPreguntas.");		}
		
		return null;
	}
}
