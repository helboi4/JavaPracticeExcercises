package com.helenatech.excercise4;
import java.util.Arrays;

public class Questionare {
    private String title;
    private Question[] questionList;
    private Boolean isFinished;

    public Questionare(String title, Question[] questionList) {
        this.title = title;
        this.questionList = questionList;
        this.isFinished = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Question[] getQuestionList() {
        return questionList;
    }

    public void setQuestionList(Question[] questionList) {
        this.questionList = questionList;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }

    @Override
    public String toString() {
        return "Questionare{" +
                "title='" + title + '\'' +
                ", questionList=" + Arrays.toString(questionList) +
                ", isFinished=" + isFinished +
                '}';
    }
}
