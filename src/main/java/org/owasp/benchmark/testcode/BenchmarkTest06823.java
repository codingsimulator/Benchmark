/**
* OWASP Benchmark Project v1.1
*
* This file is part of the Open Web Application Security Project (OWASP)
* Benchmark Project. For details, please see
* <a href="https://www.owasp.org/index.php/Benchmark">https://www.owasp.org/index.php/Benchmark</a>.
*
* The Benchmark is free software: you can redistribute it and/or modify it under the terms
* of the GNU General Public License as published by the Free Software Foundation, version 2.
*
* The Benchmark is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
* even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details
*
* @author Nick Sanidas <a href="https://www.aspectsecurity.com">Aspect Security</a>
* @created 2015
*/

package org.owasp.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest06823")
public class BenchmarkTest06823 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		org.owasp.benchmark.helpers.SeparateClassRequest scr = new org.owasp.benchmark.helpers.SeparateClassRequest( request );
		String param = scr.getTheValue("foo");
		
		
		// Chain a bunch of propagators in sequence
		String a21050 = param; //assign
		StringBuilder b21050 = new StringBuilder(a21050);  // stick in stringbuilder
		b21050.append(" SafeStuff"); // append some safe content
		b21050.replace(b21050.length()-"Chars".length(),b21050.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map21050 = new java.util.HashMap<String,Object>();
		map21050.put("key21050", b21050.toString()); // put in a collection
		String c21050 = (String)map21050.get("key21050"); // get it back out
		String d21050 = c21050.substring(0,c21050.length()-1); // extract most of it
		String e21050 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d21050.getBytes() ) )); // B64 encode and decode it
		String f21050 = e21050.split(" ")[0]; // split it on a space
		org.owasp.benchmark.helpers.ThingInterface thing = org.owasp.benchmark.helpers.ThingFactory.createThing();
		String g21050 = "barbarians_at_the_gate";  // This is static so this whole flow is 'safe'
		String bar = thing.doSomething(g21050); // reflection
		
		
		Object[] obj = { "a", "b"};
		
		response.getWriter().printf(bar,obj);
	}
}