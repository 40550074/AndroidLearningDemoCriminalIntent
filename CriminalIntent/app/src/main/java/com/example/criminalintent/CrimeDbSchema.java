package com.example.criminalintent;

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "name";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SLOVED = "solved";
        }
    }
}
