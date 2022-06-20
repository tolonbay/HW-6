package com.company;
import java.util.Random;
public class Main {
    final Random random = new Random();

    public void onClick(View v) {
        mInfoTextView.setText(String.valueOf(random.nextInt()));
    }
    public static void main(String[] args) {

    }
}
