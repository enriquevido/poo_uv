package escuela;

import java.util.ArrayList;

public class Section {
    private String NRC;
    private ArrayList<Student> arrayStu;

    public Section(){
        this.NRC = "21761";
        this.arrayStu = new ArrayList<>();
    }

    public void addStudent(Student s){
        this.arrayStu.add(s);
    }

    public void searchStudent(int id){
        for(Student st : this.arrayStu){
            if(st.getId() == id){
                System.out.println("ID: " + st.getId());
                System.out.println("Nombre: " + st.getName());
                break;
            }
        }
    }

    public void deleteStudent(int id){
        for(Student s : this.arrayStu){
            if(s.getId() == id){
                this.arrayStu.remove(s);
                System.out.println("Estudiante eliminado");
                break;
            }
        }
    }

    public void printStudentsByGender(String gender){
        for(Student st : this.arrayStu){
            if(st.getGender().equals(gender)){
                System.out.println("ID: " + st.getId());
                System.out.println("Nombre: " + st.getName());
            }
        }
    }

    public void printAllStudents(){
        for(Student st : this.arrayStu){
            System.out.println("ID: " + st.getId());
            System.out.println("Nombre: " + st.getName());
        }
    }

    @Override
    public String toString() {
        return "Section{" +
                "NRC='" + NRC + '\'' +
                ", arrayStu=" + arrayStu +
                '}';
    }
}
