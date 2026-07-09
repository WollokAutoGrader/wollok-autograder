package ar.edu.unahur.wollokautograder.service;

import ar.edu.unahur.wollokautograder.runner.RunnerResult;
import ar.edu.unahur.wollokautograder.runner.RunnerService;
import org.springframework.stereotype.Service;

import java.nio.file.Path;

@Service
public class CorrectionServiceImpl implements CorrectionService {

    private final RunnerService runnerService;

    public CorrectionServiceImpl(RunnerService runnerService) {
        this.runnerService = runnerService;
    }

    @Override
    public RunnerResult correct(Path repository) {
        return runnerService.run(repository);
    }

}