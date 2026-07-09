package ar.edu.unahur.wollokautograder.controller;

import ar.edu.unahur.wollokautograder.runner.RunnerResult;
import ar.edu.unahur.wollokautograder.service.CorrectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.Paths;

@Controller
public class CorrectionController {

    private final CorrectionService correctionService;

    public CorrectionController(CorrectionService correctionService) {
        this.correctionService = correctionService;
    }

    @GetMapping("/correct")
    public String correct(Model model) {

    RunnerResult result =
            correctionService.correct(
                    Paths.get(
                            "C:\\PROPIO\\UNAHUR\\Objetos1\\Proyectos\\WollokAutogrades\\wag-playground"
                    ));

        model.addAttribute("result", result);

        return "result";
    }

}