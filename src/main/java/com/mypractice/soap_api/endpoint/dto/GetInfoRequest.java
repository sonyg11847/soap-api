package com.mypractice.soap_api.endpoint.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"filename"})
@XmlRootElement(name = "getInfoRequest")
@Getter
public class GetInfoRequest {
    @XmlElement(required = true)
    String filename;
}
