package helper;

import java.util.List;

public class Question {
    String question;
    List<String> answers;
    String CorrectAnswer;

    public Question(String question, List<String> answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        CorrectAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

}
