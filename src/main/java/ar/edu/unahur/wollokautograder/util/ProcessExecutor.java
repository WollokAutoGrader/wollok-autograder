package ar.edu.unahur.wollokautograder.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ProcessExecutor {

    public static ProcessExecutionResult execute(List<String> command) {

        StringBuilder output = new StringBuilder();

        try {

            ProcessBuilder processBuilder = new ProcessBuilder(command);

            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(process.getInputStream()));

            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitCode = process.waitFor();

            return new ProcessExecutionResult(exitCode, output.toString());

        } catch (IOException | InterruptedException e) {

            return new ProcessExecutionResult(-1, e.getMessage());

        }

    }

}