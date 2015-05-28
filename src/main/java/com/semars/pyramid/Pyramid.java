package com.semars.pyramid;

public class Pyramid {
    private int rows;
    private StringBuilder output = new StringBuilder();

    public Pyramid(int rows) {
        this.rows = rows;
        makePyramid(this.rows);
    }

    private String makePyramid(int rows) {
        int blocks;
        int spaces;
        for (int i = 1; i <= rows; i++) {
            blocks = i + 1;
            spaces = rows - i;
            for (int k = 0; k < spaces; k++) {
                output.append(" ");
            }
            for (int j = 0; j < blocks; j++) {
                output.append("#");
            }
            output.append("\r\n");
        }
        return output.toString();
    }
    @Override
    public String toString() {
        return output.toString();
    }
}