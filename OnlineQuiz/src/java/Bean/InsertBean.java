/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

/**
 *
 * @author User
 */
public class InsertBean {
    private String id;
    private String username;
    private String password;
    private String question;
    private String option1;
    private String option2;
    private String option3;

    public void setE1(String e1) {
        this.e1 = e1;
    }

    public void setE2(String e2) {
        this.e2 = e2;
    }

    public void setE3(String e3) {
        this.e3 = e3;
    }

    public String getE1() {
        return e1;
    }

    public String getE2() {
        return e2;
    }

    public String getE3() {
        return e3;
    }
    private String option4;
    private String correct;
    private String exam_id;
    private String question_id;
    private String e1;
    private String e2;
    private String e3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getExam_id() {
        return exam_id;
    }

    public void setExam_id(String exam_id) {
        this.exam_id = exam_id;
    }



}


