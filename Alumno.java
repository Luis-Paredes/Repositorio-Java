public class Alumno {
	private final int matricula;
	private final float cal1;
	private final float cal2;
	private final float cal3;

	// Constructor
	public Alumno(int matricula, float cal1, float cal2, float cal3) {
		this.matricula=matricula;
		this.cal1=cal1;
		this.cal2=cal2;
		this.cal3=cal3;
	}
	
	public double calPromedio() {
		return (cal1+cal2+cal3)/3;
	}
	
	public String toString() {
		return "Matrícula: "+matricula+"\tel promedio es: "+calPromedio();
	}
}
class Pincipal {
	public static void main(String[]args){
		Alumno a1=new Alumno(100000, 95.99f, 99.99f, 98.99f); // Los parámetros deben ir en el orden del constructor
		System.out.println(a1);
		Alumno a2=new Alumno(120000, 90.99f, 89.99f, 98.98f);
		System.out.println(a2);
	}
}
