package com.sample.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.scribe.up.profile.google2.Google2Profile;
import org.springframework.security.core.context.SecurityContextHolder;

import com.github.leleuj.ss.oauth.client.authentication.OAuthAuthenticationToken;

public class CommonModel {
	
	public void putCommon(HttpServletRequest request, HttpServletResponse response, Map<String, Object> model){
		OAuthAuthenticationToken token = (OAuthAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
		
		Google2Profile google = (Google2Profile) token.getUserProfile();

		model.put("name", google.getDisplayName());
		model.put("email", google.getEmail());
		model.put("profilePicture", google.getPictureUrl());
		
		Boolean blocked = false;
		
		if( !google.getEmail().toLowerCase().endsWith("@openenglish.com") ){
			blocked = true;
		}
		
		model.put("blocked", blocked);
	}
}