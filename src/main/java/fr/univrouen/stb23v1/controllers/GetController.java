package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.model.STB;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

@GetMapping("/resume")
public String getListRSSinXML(){
    return "Envoi de la liste des STB";
}

@GetMapping("/stbid")
public String getRSSinXML(
        @RequestParam(value = "id") String text
) {
    return "Detail du contenu STB demandé " + text ;
}

@GetMapping("/test")
public String getTest(
        @RequestParam
                (value= "id") String id  ,
        @RequestParam
                (value = "titre") String titre
) {
    return "Test :\n  Id = "+id+" \n" + " Titre = " + titre ;
    }



    @RequestMapping(value ="/xml" , produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody STB getXML() {
    STB stb = new STB(123,"TEST STB","2023-04-01T14:22:33") ;
    return stb ;
    }





}
