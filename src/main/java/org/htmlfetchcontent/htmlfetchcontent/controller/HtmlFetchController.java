package org.htmlfetchcontent.htmlfetchcontent.controller;
import org.htmlfetchcontent.htmlfetchcontent.dto.UrlRequestDto;
import org.htmlfetchcontent.htmlfetchcontent.dto.UrlResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/url-preview")
public class HtmlFetchController{

    private final RestTemplate restTemplate;

    // constructor injection
    @Autowired
    public HtmlFetchController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping
    public ResponseEntity<?> getHtmlContent(@RequestBody UrlRequestDto urlRequestDto) {
        String htmlContent = restTemplate.getForObject(urlRequestDto.getUrl(), String.class);
        return ResponseEntity.ok(
                new UrlResponseDto(htmlContent)
        );
    }
}