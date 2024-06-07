package modelo;

public class Preguntas {
	
		private String Enunciado;
		private String Pregunta1;
		private String Pregunta2;
		private String Pregunta3;
		private String Respuesta;
		private String Ruta;
		
		public Preguntas(String enunciado, String pregunta1, String pregunta2, String pregunta3, String respuesta,
				String ruta) {
			super();
			Enunciado = enunciado;
			Pregunta1 = pregunta1;
			Pregunta2 = pregunta2;
			Pregunta3 = pregunta3;
			Respuesta = respuesta;
			Ruta = ruta;
		}

		public Preguntas() {
			super();
		}

		public String getEnunciado() {
			return Enunciado;
		}

		public void setEnunciado(String enunciado) {
			Enunciado = enunciado;
		}

		public String getPregunta1() {
			return Pregunta1;
		}

		public void setPregunta1(String pregunta1) {
			Pregunta1 = pregunta1;
		}

		public String getPregunta2() {
			return Pregunta2;
		}

		public void setPregunta2(String pregunta2) {
			Pregunta2 = pregunta2;
		}

		public String getPregunta3() {
			return Pregunta3;
		}

		public void setPregunta3(String pregunta3) {
			Pregunta3 = pregunta3;
		}

		public String getRespuesta() {
			return Respuesta;
		}

		public void setRespuesta(String respuesta) {
			Respuesta = respuesta;
		}

		public String getRuta() {
			return Ruta;
		}

		public void setRuta(String ruta) {
			Ruta = ruta;
		}

		@Override
		public String toString() {
			return "preguntas [Enunciado=" + Enunciado + ", Pregunta1=" + Pregunta1 + ", Pregunta2=" + Pregunta2
					+ ", Pregunta3=" + Pregunta3 + ", Respuesta=" + Respuesta + ", Ruta=" + Ruta + "]";
		}
		
		




}
