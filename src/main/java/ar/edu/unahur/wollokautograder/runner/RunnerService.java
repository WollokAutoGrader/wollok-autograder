package ar.edu.unahur.wollokautograder.runner;

import java.nio.file.Path;

public interface RunnerService {

    RunnerResult run(Path repository);

}