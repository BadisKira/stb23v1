package fr.univrouen.stb23v1.model;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.Charset;


public class TestSTB {
    Resource resource ;
    public String loadFileXml() throws IOException {
        resource = new DefaultResourceLoader().getResource("classpath:xml/test0.xml") ;
        return resource.getContentAsString(Charset.defaultCharset()) ;
    }

}
