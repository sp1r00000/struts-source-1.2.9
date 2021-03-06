<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-bean-el.tld" prefix="bean-el" %>
<%@ taglib uri="/WEB-INF/struts-html-el.tld" prefix="html-el" %>
<%@ taglib uri="/WEB-INF/struts-logic-el.tld" prefix="logic-el" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html-el:html>
 <head>
  <title>Test html-el:button Tag</title>
 </head>
 <body bgcolor="white">

  <div align="center">
   <h1>Test struts html-el:button Tag</h1>
  </div>

  <html-el:form action="html-button.do">
   <table>
    <tr>
     <td>
      <html-el:button property="stringProperty" />
     </td>
    </tr>
    <tr>
     <td>
      <html-el:button property="stringProperty" disabled="${!empty pageScope}"/>
     </td>
    </tr>
    <tr>
     <td>
      <logic-el:iterate collection="${pageScope}" id="item">
       <html-el:button property="stringIndexed" indexed="${!empty pageScope}"/>
      </logic-el:iterate>
     </td>
    </tr>
    <tr>
     <td>
      <html-el:checkbox property="stringProperty" />
     </td>
    </tr>
    <tr>
     <td>
      <html-el:checkbox property="stringProperty" disabled="${!empty pageScope}"/>
     </td>
    </tr>
    <tr>
     <td>
      <logic-el:iterate collection="${pageScope}" id="item">
       <html-el:checkbox property="stringProperty" indexed="${!empty pageScope}"/>
      </logic-el:iterate>
     </td>
    </tr>
    <tr>
     <td>
      <html-el:cancel property="stringProperty" />
     </td>
    </tr>
    <tr>
     <td>
      <html-el:cancel property="stringProperty" disabled="${!empty pageScope}"/>
     </td>
    </tr>
    <tr>
     <td>
      <html-el:reset property="stringProperty" />
     </td>
    </tr>
    <tr>
     <td>
      <html-el:reset property="stringProperty" disabled="${!empty pageScope}"/>
     </td>
    </tr>
   </table>
  </html-el:form>
  <script>
   <!--
    function showevent(evt) { window.status = evt.type; }
    // -->
  </script>

 </body>
</html-el:html>
