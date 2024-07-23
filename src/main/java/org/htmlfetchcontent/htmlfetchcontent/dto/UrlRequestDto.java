package org.htmlfetchcontent.htmlfetchcontent.dto;

public class UrlRequestDto {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlRequestDto(String url) {
        this.url = url;
    }

    public UrlRequestDto(){}
}
