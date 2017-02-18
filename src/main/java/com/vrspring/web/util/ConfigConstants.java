package com.vrspring.web.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "aliyun.baichuan")
@Component
public class ConfigConstants {

	public static String IMAGE_DIRECTORY;
	public static String IMAGE_SUFFIX;
	public static String DNS_NAME;
	public static String IMAGE_URL;
	public static int BANNER_NUM;

	public static String getImageDirectory() {
		return IMAGE_DIRECTORY;
	}

	public static void setImageDirectory(String imageDirectory) {
		IMAGE_DIRECTORY = imageDirectory;
	}

	public static String getImageSuffix() {
		return IMAGE_SUFFIX;
	}

	public static void setImageSuffix(String imageSuffix) {
		IMAGE_SUFFIX = imageSuffix;
	}

	public static String getDnsName() {
		return DNS_NAME;
	}

	public static void setDnsName(String dnsName) {
		DNS_NAME = dnsName;
	}

	public static String getImageUrl() {
		return IMAGE_URL;
	}

	public static void setImageUrl(String imageUrl) {
		IMAGE_URL = imageUrl;
	}

	public static int getBannerNum() {
		return BANNER_NUM;
	}

	public static void setBannerNum(int bannerNum) {
		BANNER_NUM = bannerNum;
	}
}
