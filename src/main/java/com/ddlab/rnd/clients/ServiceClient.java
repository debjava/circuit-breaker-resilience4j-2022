package com.ddlab.rnd.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo", url = "http://localhost:9090/")
public interface ServiceClient {

	@GetMapping(path = "/information/info", name = "infoName")
	String getDataInfo();
}
