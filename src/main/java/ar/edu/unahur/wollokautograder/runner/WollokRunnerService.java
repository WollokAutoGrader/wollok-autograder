package ar.edu.unahur.wollokautograder.runner;

import ar.edu.unahur.wollokautograder.util.ProcessExecutionResult;
import ar.edu.unahur.wollokautograder.util.ProcessExecutor;
import org.springframework.stereotype.Service;

import java.nio.file.Path;

@Service
public class WollokRunnerService implements RunnerService {

    @Override
    public RunnerResult run(Path repository) {

        var command = WollokCommandBuilder.build(
                repository,
                "cachitoTest.wtest"
        );

        ProcessExecutionResult execution = ProcessExecutor.execute(command);

        return new RunnerResult(
                execution.exitCode() == 0,
                execution.output()
        );
    }
}