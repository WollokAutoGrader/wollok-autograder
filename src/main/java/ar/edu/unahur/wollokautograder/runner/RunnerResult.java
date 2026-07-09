package ar.edu.unahur.wollokautograder.runner;

public class RunnerResult {

    private Boolean success;

    private String output;

    public RunnerResult() {
    }

    public RunnerResult(Boolean success, String output) {
        this.success = success;
        this.output = output;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getOutput() {
        return output;
    }
}