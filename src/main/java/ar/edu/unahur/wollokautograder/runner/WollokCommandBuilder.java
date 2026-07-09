package ar.edu.unahur.wollokautograder.runner;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WollokCommandBuilder {

    public static List<String> build(Path project, String testFile) {

        List<String> command = new ArrayList<>();

        command.add("C:\\Users\\coniglioh\\AppData\\Roaming\\npm\\wollok.cmd");
        command.add("test");
        command.add("-f");
        command.add(testFile);
        command.add("--skipValidations");
        command.add("-p");
        command.add(project.toString());

        return command;

    }

}