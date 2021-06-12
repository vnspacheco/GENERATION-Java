package Aula1106;

public class Collections2Aula {

		private String titulo;
		private int tempo;
		
		public Collections2Aula (String titulo, int tempo) {
			this.titulo = titulo;
			this.tempo = tempo;
		}
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getTempo() {
			return tempo;
		}
		public void setTempo(int tempo) {
			this.tempo = tempo;
		}
		
		public String toString () {
			return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
		}
}
