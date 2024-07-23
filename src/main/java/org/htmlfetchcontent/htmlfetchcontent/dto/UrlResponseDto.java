package org.htmlfetchcontent.htmlfetchcontent.dto;

public class UrlResponseDto {
    private String htmlContent;

    public UrlResponseDto() {
    }

    public UrlResponseDto(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }
}