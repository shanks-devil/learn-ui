package com.shanks.learn.ui.mvc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shanks.learn.ui.mvc.domain.User;

@Service
public class UserService {

	@Value("${learn.api.user}")
	private String userServiceName;

	@Resource
	private RestTemplate userTemplate;

	public List<User> listUser() {
		ParameterizedTypeReference<List<User>> reference = new ParameterizedTypeReference<List<User>>() {
		};
		return userTemplate.exchange(
				"http://" + userServiceName + "/learn/user", HttpMethod.GET,
				null, reference).getBody();
	}

}
