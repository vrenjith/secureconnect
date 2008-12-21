<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : Dec 20, 2008, 6:19:27 PM
    Author     : Z000DG8C
-->
<jsp:root version="2.1" xmlns:df="http://java.sun.com/jsf/dynamicfaces" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <df:ajaxTransaction id="ajaxTransaction1" inputs="page1:html1:body1:form1:textField1" render="page1:html1:body1:form1:listbox1"/>
                    <df:ajaxTransaction id="ajaxTransaction2" inputs="page1:html1:body1:form1:listbox1" render="page1:html1:body1:form1:textField1"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="position: absolute; left: 120px; top: 72px" text="Name:"/>
                        <webuijsf:textField binding="#{Page1.textField1}" id="textField1"
                            onKeyUp="DynaFaces.Tx.fire(&quot;ajaxTransaction1&quot;, &quot;textField1&quot;)" style="left: 192px; top: 72px; position: absolute" valueChangeListenerExpression="#{Page1.textField1_processValueChange}"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 120px; top: 120px" text="Results:"/>
                        <webuijsf:listbox binding="#{Page1.listbox1}" converter="#{Page1.listbox1Converter}" id="listbox1"
                            items="#{Page1.employeeDataProvider.options['EMPLOYEE.ID,EMPLOYEE.FIRSTNAME']}"
                            onChange="DynaFaces.Tx.fire(&quot;ajaxTransaction1&quot;, &quot;textField1&quot;)" style="left: 192px; top: 120px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
