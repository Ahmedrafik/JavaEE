package com.iocean.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ConnectionFilter implements Filter {

		private FilterConfig filterconf;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		boolean auth = (boolean) req.getSession().getAttribute("authentification");
		if(auth){
			chain.doFilter(request, response);
		}
		else{
			
		}
	}

	@Override
	public void init(FilterConfig filterConf) throws ServletException {
		this.filterconf = filterConf;

	}

}
