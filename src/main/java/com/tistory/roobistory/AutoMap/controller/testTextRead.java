package com.tistory.roobistory.AutoMap.controller;
import org.jsoup.Jsoup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import java.io.IOException;

@RestController
public class testTextRead {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World?";
    }

    @GetMapping("/good")
    public String goodLuck() {
        return "have a nice Day!!";
    }

    @GetMapping("/test")
    public String textReadTest() throws IOException {
        Document doc = (Document) Jsoup.connect("https://lss.hansalim.or.kr/").get();
        return ((org.jsoup.nodes.Document) doc).title();
    }
}
