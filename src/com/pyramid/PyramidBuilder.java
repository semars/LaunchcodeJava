package com.pyramid;

public class PyramidBuilder {
    private PyramidBuilder() {}

    private static PyramidBuilder pyramidBuilder;

    public static PyramidBuilder getInstance() {
        if (pyramidBuilder == null) {
            pyramidBuilder = new PyramidBuilder();
        }
        return pyramidBuilder;
    }

    public Pyramid pyramid(int rows) {
        return new Pyramid(rows);
    }
}
