package com.projetos.comercinho.presentation.controllers;

import com.projetos.comercinho.application.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/comerciantes")
    public ResponseEntity<String> getComerciantesReport() {
        String csvContent = reportService.generateComerciantesCsvReport();
        return createCsvResponse(csvContent, "comerciantes_report.csv");
    }

    @GetMapping("/produtos")
    public ResponseEntity<String> getProdutosReport() {
        String csvContent = reportService.generateProdutosCsvReport();
        return createCsvResponse(csvContent, "produtos_report.csv");
    }

    private ResponseEntity<String> createCsvResponse(String csvContent, String fileName) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDisposition(ContentDisposition.builder("attachment")
                .filename(fileName)
                .build());
        headers.setContentType(MediaType.parseMediaType("text/csv"));

        return ResponseEntity.ok()
                .headers(headers)
                .body(csvContent);
    }
}
