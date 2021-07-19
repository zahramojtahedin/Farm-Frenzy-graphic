package sample;

import java.io.File;

public class TestRes {

    public static void main ( String[] args ) {
        ClassLoader loader = TestRes.class.getClassLoader();
        loader.getResource("music.m4a");
        System.out.println();
    }
}
