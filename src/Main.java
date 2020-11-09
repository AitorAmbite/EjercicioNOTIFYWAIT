public class Main {

    public static void main(String[] args){
        ProfesorThread profesor = new ProfesorThread();
        profesor.start();

        for (int i = 0;i < 5;i++){
            AlumnoThread alumnoDes = new AlumnoThread();
            alumnoDes.setName("Alumno "+i);
            alumnoDes.start();
        }
    }
}
