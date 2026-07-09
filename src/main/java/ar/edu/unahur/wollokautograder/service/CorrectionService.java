package ar.edu.unahur.wollokautograder.service;

import ar.edu.unahur.wollokautograder.runner.RunnerResult;

import java.nio.file.Path;

public interface CorrectionService {

    RunnerResult correct(Path repository);

}