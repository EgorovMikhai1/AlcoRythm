package org.example._20_11_2024;

public class Point {
    public boolean isAtPoint(String path) {
        int column = 0;
        int row = 0;

        for (int i = 0; i < path.length(); i++) {
            if("A".equals(path.charAt(i))) {
                column++;
            }
            if("C".equals(path.charAt(i))) {
                column--;
            }
            if("B".equals(path.charAt(i))) {
                row++;
            }
            if("D".equals(path.charAt(i))) {
                row--;
            }
        }

        return column == row;
    }
}
