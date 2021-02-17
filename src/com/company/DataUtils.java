package com.company;


import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataUtils {
    static public SimpleDateFormat dateFormat = null;
    static public SimpleDateFormat timeStampFormat = null;

    static {
        timeStampFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    public static Date parseDate(String dateString) {
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            return null;
        }

    }

    public static Date parseTimestamp(String dateString) {
        try {
            return timeStampFormat.parse(dateString);
        } catch (ParseException e) {
            return null;
        }

    }

    public static Integer parseInt(String intString) {
        try {
            return Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Long parseLong(String longString) {
        try {
            return Long.parseLong(longString);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static List<Record> dataPrep() {
        List<Record> data = null;
        try {
            Path csvInputPath = Paths.get(Main.class.getClassLoader().getResource("events.csv").getPath());
            int initialCapacity = (int) Files.lines(csvInputPath).count();
            data = new ArrayList<Record>(initialCapacity);
            BufferedReader reader = Files.newBufferedReader(csvInputPath);

        } catch (Exception e) {
            System.out.println("Error Parsing csv file");
        }
        return data;
    }
}