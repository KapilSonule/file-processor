package com.fileprocessor.fileprocessor;

import com.fileprocessor.fileprocessor.config.FileManager;
import com.fileprocessor.fileprocessor.processor.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class FileProcessorApplication implements CommandLineRunner {


	public static void main(String[] args) {
        SpringApplication.run(FileProcessorApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        FileManager manager = new FileManager();
        CSVReader csvReader= new CSVReader();
        csvReader.parse();
        String sourcepath = "C:\\Users\\kapil\\Documents\\Docs\\text.csv";
        String destinationepath = "C:\\Users\\kapil\\Documents\\Work\\Text.txt";
        //manager.fileMover(sourcepath,destinationepath);

    }
}