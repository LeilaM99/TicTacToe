package com.github.LeilaM99.TicTacToe;

public class Player {
        String name;
        char symbol;

        public Player(String name, char symbol) {
            this.name = name;
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public char getSymbol() {
            return symbol;
        }
}
