//package com.shanks.learn.ui.configuration;
//
//import javax.annotation.Resource;
//
//import okhttp3.OkHttpClient;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.fastjson.FastJsonConverterFactory;
//
//import com.github.blackshadowwalker.spring.retrofit.RetrofitServiceScannerConfigurer;
//
//@Configuration
//public class RetrofitConfiguration {
//	
//	@Resource
//	private Environment env;
//	
//	@Bean
//	public RetrofitServiceScannerConfigurer config() {
//		RetrofitServiceScannerConfigurer configurer = new RetrofitServiceScannerConfigurer();
//		configurer.setBasePackage("com.shanks.learn.ui.mvc.service");
//		configurer.setRetrofit("");
//		return configurer;
//	}
//
//	@Bean
//	@LoadBalanced
//	public Retrofit retrofitUser(OkHttpClient okHttpClient) {
//		return new Retrofit.Builder().baseUrl("http://learn-user/")
//				.addConverterFactory(FastJsonConverterFactory.create())
//				.client(okHttpClient()).build();
//	}
//
//	@Bean
//	public Retrofit retrofit7(OkHttpClient okHttpClient) {
//		return new Retrofit.Builder().baseUrl("http://127.0.0.1:10087")
//				.addConverterFactory(FastJsonConverterFactory.create())
//				.client(okHttpClient()).build();
//	}
//	
//	@Bean
//	public OkHttpClient okHttpClient() {
//		return new OkHttpClient.Builder().build();
//	}
//}
