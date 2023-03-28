package com.example.restaurant.naver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NaverClient {

    @Value("&{naver.client.id}")
    private String naverClientId;
    @Value("&{naver.client.secret}")
    private String naverScret;

    @Value("&{naver.url.search.local}")
    private String naverLocalSearchUrl;
    @Value("&{naver.url.search.image}")
    private String naverImageSearchUrl;

    public void localSearch() {

    }

    public void imageSearch() {

    }
}
