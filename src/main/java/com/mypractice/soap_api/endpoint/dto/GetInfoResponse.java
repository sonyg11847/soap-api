package com.mypractice.soap_api.endpoint.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"info"})
@XmlRootElement(name = "getInfoResponse")
@Getter @Setter
public class GetInfoResponse {
    @XmlElement
    String info;
}
