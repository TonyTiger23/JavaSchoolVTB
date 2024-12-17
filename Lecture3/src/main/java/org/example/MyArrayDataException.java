package org.example;

public class MyArrayDataException extends RuntimeException {

        private final int row;
        private final int col;

    public MyArrayDataException(String message, int row, int col) {
            super(message);
            this.row = row;
            this.col = col;
        }

        @Override
        public String getMessage() {
            return super.getMessage() + " (Ошибка в ячейке: [" + row + "][" + col + "])";
        }

    }

