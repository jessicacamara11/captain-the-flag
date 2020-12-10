package org.academiadecodigo.gnunas.captaindrink;

import java.util.List;

public class Player {

    private String name;
    private List<Question> questions;
    private int wrongAnswers;
    private boolean isAnswerCorrect;
    private String answer;
    private String ip;
    private GameRoom gameRoom;

    public Player(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public void drink() {
        wrongAnswers++;
    }

    public void writeAQuestion(Question question) {

        questions.add(question);
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setGameController(GameRoom gameRoom) {
        this.gameRoom = gameRoom;
    }

    public boolean isAnswerCorrect() {
        return isAnswerCorrect;
    }

    public String getIp() {
        return ip;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public String getAnswer() {
        return answer;
    }

    public String getName() {
        return name;
    }
}
