package com.upward.data;

public class LevelInfo {
    private int position;
    private String level;
    private String grade;

    public LevelInfo(int position, String level, String grade) {
        this.position = position;
        this.level = level;
        this.grade = grade;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
