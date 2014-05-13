/**
 * JavaLab
 **/

package exceptions;

/**
 *
 * @author ducccuongict
 */
public class Student {
    private String studentID;
    private String studentName;
    private float score;
    
    public Student(String studentID, String studentName, float score) throws MyException {
        setStudentID(studentID);
        setStudentName(studentName);
        setScore(score);
    }
    
    public String getDetail() {
        return "ID: " + studentID + "\nName: " + studentName + "\nScore: " + score;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) throws MyException {
        if (studentID.isEmpty()) {
            throw new MyException("");
        } else {
            this.studentID = studentID;
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    
 }
