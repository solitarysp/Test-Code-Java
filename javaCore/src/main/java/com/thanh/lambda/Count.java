package com.thanh.lambda;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Count {
    public static void main(String[] args) throws IOException {
/*
        List<TestClass> testClasses = new LinkedList<>();

        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            testClasses.add(new TestClass(i));
            numbers.add(i);
        }
        System.out.println(testClasses.stream().map(TestClass::getValue).reduce(0, (a, b) -> a + b));
        System.out.println(numbers.stream().reduce(0, (a, b) -> a + b));
*/
        // ghi file
        FileOutputStream fos = new FileOutputStream("D:\\test\\sqlInsert_names_Boot.txt");
        DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));

        //doc
        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Admin\\Desktop\\namesboot"))) {

            // read line by line
            List<String> names = new LinkedList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String finalLine = line;
                if(names.stream().noneMatch(s -> s.equals(finalLine))){
                    String value = "\nINSERT INTO names_boot (`name`, `enable`) VALUES ('" + line + "', DEFAULT);";
                    names.add(line);
                    outStream.write(value.getBytes());
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }


        outStream.close();

/*        FileOutputStream fos = new FileOutputStream("D:\\test\\cxc.txt");
        DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
        for (int i = 0; i < 100000; i++) {
            String value = "\ninsert into user_profiles (uid, facebook_id, google_id, device_id, avatar_url, name, friend, state, online, connect_google, connect_facebook, created_at, updated_at, country_id, language_id) values" +
                    " ("+i+", null, null, "+i+", null, "+i+", null, 1, 1, 0, 0, '2019-08-07 15:33:25', '2019-08-07 15:33:25', 0, null);";
            outStream.write(value.getBytes());

        }
        outStream.close();*/
    }
}

class TestClass {
    private int value;

    public TestClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
