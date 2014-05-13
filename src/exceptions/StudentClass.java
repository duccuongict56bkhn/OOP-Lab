/**
 * JavaLab
 **/

package exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducccuongict
 */
public class StudentClass {
    private String classID;
    private String className;
    private List<Student> students;
    
    public StudentClass(String classID, String className) throws Exception {
        this.students = new ArrayList();
        this.classID = classID;
        this.className = className;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    public void add(Student student) throws MyException {
        if (students.contains(student)) {
            throw new MyException(MyException.EXIST);
        } else {
            students.add(student);
        }
    }
    
    public void add(int index, Student student) throws MyException {
        if (students.get(index).getStudentID().equals(student.getStudentID())) {
            throw new MyException(MyException.EXIST);
        } else {
            students.add(index, student);
        }
    }
    
    public void update(Student student) throws MyException {
        for(Student s : students) {
            if (s.getStudentID().equals(student.getStudentID())) { // Found
                s.setStudentName(student.getStudentName());
                s.setScore(student.getScore());
            } else {
                throw new MyException(MyException.NOT_EXISTED);
            }   
        }
    }
    
    public Student remove() throws MyException {
        int listSize = students.size();
        if (students.isEmpty()) {
            throw new MyException("The list is empty", "Remove student from list");
        } else {
            return students.remove(listSize - 1);
        }
    }
    
    public void remove(Student student) throws MyException {
        if(students.contains(student)) {
            students.remove(student);
        } else {
            throw new MyException(MyException.NO_ITEM);
        }
    }
    
    
}
