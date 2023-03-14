package nfsetimbo.capivaratech.service;


import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientService {

    public void sendXmlRequest() {
        String webServiceEndpointUrl = "https://homologacao.atende.net";
        String webServiceBody = "/?pg=rest&service=WNERestServiceNFSe&cidade=integracoes";
        String username = "25.825.307/0001-52";
        String password = "Teste@2023";

        WebClient webClient = WebClient.builder()
                .baseUrl(webServiceEndpointUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.MULTIPART_FORM_DATA_VALUE)
                .build();

        Resource file = new ClassPathResource("codebeautify.xml");
        MultipartBodyBuilder multipartBodyBuilder = new MultipartBodyBuilder();
        multipartBodyBuilder.part("file", file, MediaType.APPLICATION_XML);

        String result = webClient
                .post()
                .uri(webServiceBody)
                .headers(headers -> headers.setBasicAuth(username, password))
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(multipartBodyBuilder.build()))
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println(result);
    }
}
