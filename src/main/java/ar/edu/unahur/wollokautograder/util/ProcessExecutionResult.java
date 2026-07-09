package ar.edu.unahur.wollokautograder.util;

public record ProcessExecutionResult(
        int exitCode,
        String output
) {
}