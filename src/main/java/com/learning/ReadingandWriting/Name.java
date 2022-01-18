package com.learning.ReadingandWriting;
//You can even read values of already initialized fields on a
//line initializing a new field.
public class Name {
    String first = "Theodore";
    String last = "Moose";
    String full = first + last;
}
//Line 5 and 6 both write to fields. Line 7 both reads and writes
//data. It reads the fields first and last. It then writes the
//field full.