package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setCharacterEncoding("utf-8"); // 한국어 나오게함
		res.setContentType("text/html; charset=utf-8"); // 한국어 나오게함
		PrintWriter pw = res.getWriter();
		pw.print("포스트로 날 호출했군용");
	}
}
