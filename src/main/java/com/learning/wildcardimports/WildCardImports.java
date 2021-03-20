package com.learning.wildcardimports;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.*; //NO GOOD - a wildcard can only matches
// class names,not "file.Files"
//import java.nio.*.*; //NO GOOD you can only have one wildcard
import java.nio.file.Paths.*; //NO GOOD you can not import methods only class name

public class WildCardImports {
    public static void main(String[] args) {

    }
    public void read(Files files){
        Paths.get("name");
    }
}

