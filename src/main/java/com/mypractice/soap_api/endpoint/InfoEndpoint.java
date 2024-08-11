package com.mypractice.soap_api.endpoint;

import com.mypractice.soap_api.endpoint.dto.GetInfoRequest;
import com.mypractice.soap_api.endpoint.dto.GetInfoResponse;
import com.mypractice.soap_api.service.info.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@RequiredArgsConstructor
@Endpoint
public class InfoEndpoint {
    private final InfoService infoService;

    @PayloadRoot(namespace = "INFO_API", localPart = "getInfoRequest")
    @ResponsePayload
    public GetInfoResponse getInfo(@RequestPayload GetInfoRequest getInfoRequest) {
        System.out.println("I am in InfoEndpoint.getInfo");

        var res = new GetInfoResponse();
        res.setInfo(infoService.get(getInfoRequest.getFilename()));

        System.out.println(res.getInfo());

        return res;
    }
}
