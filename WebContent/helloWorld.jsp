		<%@ include file="header.jsp" %>
		<%@ taglib prefix="da" uri = "WEB-INF/handleTag/Taglib.tld"%>
	
		<p>Hello Boy, We are on <%=new Date()%> </p>
	<%--	<p>Let me introduce you, <%=(String)request.getAttribute("name")%></p> --%>
		<p> Liste des attribut de la requete : </p>
		<ul>
 
 	
 	<% Enumeration<String> myenum = request.getAttributeNames();
 	String s=null;
 	for(;myenum.hasMoreElements();){
 		s=myenum.nextElement();
 			out.print("<li>");
 			out.print(s);
 			out.print(" -- ");
 			out.print(request.getAttribute(s));
 			out.print("</li>");
 		}
			%>
		</ul>
		
		<da:DateFormater date="25/11/1984 03:48:45" format="dd/MM/yy hh:mm:ss"/>
	</body>
</html>