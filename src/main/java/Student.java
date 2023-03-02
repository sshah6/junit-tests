import java.util.ArrayList;

public class Student {
    Long id;
    String name;
    ArrayList<Integer> grades;

    public Student(Long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
      grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        int ave = 0;
        for(Integer grade: getGrades()){
            sum += grade;
        }
        ave = sum / grades.size();
        return ave;
    }
}
