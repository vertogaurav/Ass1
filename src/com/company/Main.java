package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        String path="/home/hasher/events.csv";
        String line="";
        Integer count=0;
        List<Record> data= DataUtils.dataPrep();
//        List<Integer>InputInteger=new ArrayList<>(Arrays.asList(1,2,3))
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine())!=null)
            {
                count++;
//                System.out.println(line);
                String[] values=line.split(",");
                System.out.println(values[0] +",");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows users want to query in");
            Integer number = sc.nextInt();
            System.out.println("Choose an option:");
            System.out.println("1.List top "+number+" pages that were viewed the most");
            System.out.println("2.List top "+number+" pages where most time was spent");
            System.out.println("3.List top "+number+" active users (by most time spent)");
            System.out.println("Choose report type");
            System.out.println("1.Daily Report");
            System.out.println("2.Monthly Report");
            System.out.println("3.Quaterly Report");

            Integer number1 = sc.nextInt();
            switch (number1){
                case 1:
                    System.out.println("Listing top n pages that were viewed the most");
                    getMostViewdPages();
                    break;
                case 2:
                    System.out.println("List top pages where most time was spent");
                    break;
                case 3:
                    System.out.println();

            }



            System.out.println(count);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    private static void getMostViewdPages() {
        System.out.println("Print Most Visied Pages");
    }
}
