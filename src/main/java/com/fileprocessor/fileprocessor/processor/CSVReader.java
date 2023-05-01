package com.fileprocessor.fileprocessor.processor;

import com.fileprocessor.fileprocessor.model.Student;
import com.opencsv.CSVReaderBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CSVReader {
    public void parse(){
        try{
            com.opencsv.CSVReader reader=
                    new CSVReaderBuilder(new FileReader("C:\\Users\\kapil\\Documents\\Docs\\test.csv")).
                            withSkipLines(1). // Skiping firstline as it is header
                            build();
            List<Student> csv_objectList=reader.readAll().stream().map(data-> {
                Student csvObject= new Student();
                csvObject.setName(data[0]);
                csvObject.setAge(data[1]);
                return csvObject;
            }).collect(Collectors.toList());
            csv_objectList.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
